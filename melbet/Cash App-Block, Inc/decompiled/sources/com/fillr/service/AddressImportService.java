package com.fillr.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.widget.Toolbar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressParseComponent;
import com.fillr.core.model.FillrAddressParseComponentList;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.ConnectionUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AddressImportService extends Service implements ConsumerAPIClientListener {
    public ArrayList mAddresses;
    public ArrayList mParsedAddresses;
    public Toolbar.AnonymousClass1 mProfileManager;
    public ProfileStore_ mProfileStore;
    public Schema_ mSchema;
    public int mStartId;
    public Repository repository;

    public final void importAddresses() {
        if (this.mAddresses.size() > 0) {
            String str = (String) this.mAddresses.get(0);
            Element element = this.mSchema.getElement("AddressDetails.Address");
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unparsed", str);
                jSONObject2.put("enablePostprocessing", true);
                jSONObject.put("address", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", 1);
                jSONObject3.put("hmac", ConnectionUtil.calculateSignature(jSONObject2.toString(), "some_secret_key_stuff"));
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version", "3.0.0");
                jSONObject4.put("dev_key", "53b58875e93728a18a0ae052f9410970");
                jSONObject4.put("extension", false);
                jSONObject.put("sdk", jSONObject4);
                jSONObject.put("signature", jSONObject3);
                ((Repository) this.repository.consumerAPIClient).parseAddressToParams(this.mStartId, jSONObject, element, null);
            } catch (JSONException unused) {
                stopSelf(this.mStartId);
            }
            this.mAddresses.remove(0);
            return;
        }
        Element element2 = this.mSchema.getElement("AddressDetails");
        if (element2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = this.mParsedAddresses.iterator();
        while (it.hasNext()) {
            FillrAddressParseComponentList fillrAddressParseComponentList = (FillrAddressParseComponentList) it.next();
            int addNamespaceToProfile = this.mProfileManager.addNamespaceToProfile(element2, false) - 1;
            for (Element element3 : fillrAddressParseComponentList.mSelectedAddress.actingElement().children) {
                hashMap.put("AddressDetails.Address[" + Integer.toString(addNamespaceToProfile) + "]." + (element3.actingElement().xmlElement != null ? element3.actingElement().xmlElement.r : null), "");
            }
            Iterator it2 = fillrAddressParseComponentList.mComponentList.iterator();
            while (it2.hasNext()) {
                FillrAddressParseComponent fillrAddressParseComponent = (FillrAddressParseComponent) it2.next();
                String str2 = fillrAddressParseComponent.mParam;
                hashMap.put("AddressDetails.Address[" + Integer.toString(addNamespaceToProfile) + "]." + str2, fillrAddressParseComponent.mValue);
            }
        }
        this.mProfileStore.setData(hashMap);
        this.mProfileStore.store();
        Intent intent = new Intent("com.fillr.service.AddressImportService");
        intent.putExtras(new Bundle());
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        stopSelf(this.mStartId);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
        if (modelBase instanceof FillrAddressParseComponentList) {
            this.mParsedAddresses.add((FillrAddressParseComponentList) modelBase);
        }
        importAddresses();
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
        importAddresses();
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.repository = new Repository(new Repository(this));
        ProfileStore_ instance_ = ProfileStore_.getInstance_(this);
        this.mProfileStore = instance_;
        instance_.loadStoredPin();
        this.mProfileManager = new Toolbar.AnonymousClass1(this.mProfileStore);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.mStartId = i2;
        this.mParsedAddresses = new ArrayList();
        this.mAddresses = new ArrayList(Arrays.asList(intent.getStringArrayExtra("ADDRESSES")));
        this.mSchema = Schema_.getInstance_(this);
        importAddresses();
        return 1;
    }
}
