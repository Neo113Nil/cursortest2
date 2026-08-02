package com.fillr.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.appcompat.widget.Toolbar;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressParseComponent;
import com.fillr.core.model.FillrAddressParseComponentList;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.core.utilities.ConnectionUtil;
import com.fillr.e0;
import java.util.ArrayList;
import java.util.Iterator;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AddressMappingService extends Service implements ConsumerAPIClientListener {
    public e0 mAddressUtil;
    public String mDevKey;
    public String mDomain;
    public Element mElement;
    public String mGroupParent;
    public String mSdkVersion;
    public String mSecretKey;
    public Repository repository;

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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r7.equals("StreetType") != false) goto L30;
     */
    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
        int i2;
        ProfileStore_ profileStore_;
        ArrayList arrayList;
        int i3;
        if (modelBase instanceof FillrAddressParseComponentList) {
            FillrAddressParseComponentList fillrAddressParseComponentList = (FillrAddressParseComponentList) modelBase;
            e0 e0Var = this.mAddressUtil;
            String str = this.mGroupParent;
            ProfileStore_ profileStore_2 = (ProfileStore_) e0Var.a;
            Element element = fillrAddressParseComponentList.mSelectedAddress;
            if (element != null) {
                ArrayList arrayList2 = fillrAddressParseComponentList.mComponentList;
                ArrayList readAllArrayElemetsForNameSpace = new Toolbar.AnonymousClass1(profileStore_2).readAllArrayElemetsForNameSpace(element);
                Element element2 = null;
                int i4 = 0;
                while (true) {
                    boolean z = true;
                    if (i4 >= readAllArrayElemetsForNameSpace.size()) {
                        break;
                    }
                    Element element3 = (Element) readAllArrayElemetsForNameSpace.get(i4);
                    Iterator it = element3.actingElement().children.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            profileStore_ = profileStore_2;
                            arrayList = readAllArrayElemetsForNameSpace;
                            i3 = i4;
                            break;
                        }
                        Element element4 = (Element) it.next();
                        if (element4.getFormattedPathKey().equals("AddressDetails.Address.StreetNumber") || element4.getFormattedPathKey().equals("AddressDetails.Address.StreetName")) {
                            String data = profileStore_2.getData(element4.actingElement().pathKey);
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                FillrAddressParseComponent fillrAddressParseComponent = (FillrAddressParseComponent) it2.next();
                                profileStore_ = profileStore_2;
                                String str2 = fillrAddressParseComponent.mParam;
                                String str3 = fillrAddressParseComponent.mValue;
                                arrayList = readAllArrayElemetsForNameSpace;
                                String str4 = element4.actingElement().elementName;
                                i3 = i4;
                                String str5 = "StreetName";
                                if (str2.equals("StreetName")) {
                                    if (!str4.equals("StreetName")) {
                                        str5 = "StreetType";
                                    }
                                    String correctFormData = e0Var.getCorrectFormData(str2, str3, element4.actingElement().elementName, element);
                                    if (!element4.actingElement().elementName.equals(str5) && (data == null || data.length() <= 0 || !data.equals(correctFormData))) {
                                        z = false;
                                        break;
                                    } else {
                                        profileStore_2 = profileStore_;
                                        readAllArrayElemetsForNameSpace = arrayList;
                                        i4 = i3;
                                    }
                                }
                                str5 = str2;
                                String correctFormData2 = e0Var.getCorrectFormData(str2, str3, element4.actingElement().elementName, element);
                                if (!element4.actingElement().elementName.equals(str5)) {
                                }
                                profileStore_2 = profileStore_;
                                readAllArrayElemetsForNameSpace = arrayList;
                                i4 = i3;
                            }
                            profileStore_ = profileStore_2;
                            arrayList = readAllArrayElemetsForNameSpace;
                            i3 = i4;
                            if (z) {
                                element2 = element3;
                                break;
                            } else {
                                profileStore_2 = profileStore_;
                                readAllArrayElemetsForNameSpace = arrayList;
                                i4 = i3;
                            }
                        }
                    }
                    i4 = i3 + 1;
                    profileStore_2 = profileStore_;
                    readAllArrayElemetsForNameSpace = arrayList;
                }
                if (element2 != null) {
                    e0Var.saveAddressComponentsIntoProfileElement(arrayList2, element2, false);
                    i2 = element2.actingElement().position;
                } else {
                    e0Var.saveAddressComponentsIntoProfileElement(arrayList2, element, true);
                    i2 = element.actingElement().position;
                }
                try {
                    String str6 = fillrAddressParseComponentList.mDomain;
                    if (str6 != null) {
                        ((AppPreferenceStore) e0Var.f).setSelectedArrayIndex(i2, str6, str);
                    }
                } catch (Exception unused) {
                }
            }
        }
        stopSelf(i);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.repository = new Repository(new Repository(this));
        this.mAddressUtil = new e0(this, ProfileStore_.getInstance_(this));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("query");
        this.mElement = (Element) intent.getSerializableExtra("profile_element");
        this.mGroupParent = intent.getStringExtra("group_parent");
        this.mDevKey = intent.getStringExtra("com.fillr.devkey");
        this.mSecretKey = intent.getStringExtra("com.fillr.secretkey");
        this.mSdkVersion = intent.getStringExtra("com.fillr.sdkversion");
        this.mDomain = intent.getStringExtra("com.fillr.domain");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("unparsed", stringExtra);
            jSONObject2.put("enablePostprocessing", true);
            jSONObject.put("address", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("version", 1);
            jSONObject3.put("hmac", ConnectionUtil.calculateSignature(jSONObject2.toString(), this.mSecretKey));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("version", this.mSdkVersion);
            jSONObject4.put("dev_key", this.mDevKey);
            jSONObject4.put("extension", false);
            jSONObject.put("sdk", jSONObject4);
            jSONObject.put("signature", jSONObject3);
            Repository repository = this.repository;
            ((Repository) repository.consumerAPIClient).parseAddressToParams(i2, jSONObject, this.mElement, this.mDomain);
            return 1;
        } catch (JSONException unused) {
            stopSelf(i2);
            return 1;
        }
    }
}
