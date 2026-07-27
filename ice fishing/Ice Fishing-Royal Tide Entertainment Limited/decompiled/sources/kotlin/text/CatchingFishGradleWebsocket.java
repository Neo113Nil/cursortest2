package kotlin.text;

import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGradleWebsocket implements Callable {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishXMLLayoutAdMob CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGradleWebsocket(CatchingFishXMLLayoutAdMob catchingFishXMLLayoutAdMob, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishXMLLayoutAdMob;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishXMLLayoutAdMob catchingFishXMLLayoutAdMob = this.CatchingFishSnackbar;
                synchronized (catchingFishXMLLayoutAdMob) {
                    try {
                        CatchingFishCameraXAndroidX catchingFishCameraXAndroidX = (CatchingFishCameraXAndroidX) catchingFishXMLLayoutAdMob.CatchingFishParcelableFAB.get();
                        ArrayList CatchingFishParcelableFAB = catchingFishCameraXAndroidX.CatchingFishParcelableFAB();
                        synchronized (catchingFishCameraXAndroidX) {
                            catchingFishCameraXAndroidX.CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishFragmentFactory(4, catchingFishCameraXAndroidX));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < CatchingFishParcelableFAB.size(); i++) {
                            CatchingFishStateFlowAdMob catchingFishStateFlowAdMob = (CatchingFishStateFlowAdMob) CatchingFishParcelableFAB.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", catchingFishStateFlowAdMob.CatchingFishParcelableFAB);
                            jSONObject.put("dates", new JSONArray((Collection) catchingFishStateFlowAdMob.CatchingFishSnackbar));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                CatchingFishXMLLayoutAdMob catchingFishXMLLayoutAdMob2 = this.CatchingFishSnackbar;
                synchronized (catchingFishXMLLayoutAdMob2) {
                    final CatchingFishCameraXAndroidX catchingFishCameraXAndroidX2 = (CatchingFishCameraXAndroidX) catchingFishXMLLayoutAdMob2.CatchingFishParcelableFAB.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    final String CatchingFishParcelableFAB2 = ((CatchingFishStripeAPIMVPMVI) catchingFishXMLLayoutAdMob2.CatchingFishCoroutine.get()).CatchingFishParcelableFAB();
                    synchronized (catchingFishCameraXAndroidX2) {
                        final String CatchingFishSnackbar = catchingFishCameraXAndroidX2.CatchingFishSnackbar(currentTimeMillis);
                        final CatchingFishXMLLayoutRedux CatchingFishJUnitRealm = CatchingFishOkHttpFAB.CatchingFishJUnitRealm(CatchingFishParcelableFAB2);
                        catchingFishCameraXAndroidX2.CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishServiceHandler() { // from class: kotlin.text.CatchingFishOkHttpRetrofit
                            @Override // kotlin.text.CatchingFishServiceHandler
                            public final Object CatchingFishFragmentHandler(Object obj) {
                                Object obj2;
                                CatchingFishCameraXAndroidX catchingFishCameraXAndroidX3 = CatchingFishCameraXAndroidX.this;
                                String str = CatchingFishSnackbar;
                                String str2 = CatchingFishParcelableFAB2;
                                CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux = CatchingFishJUnitRealm;
                                CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
                                Object obj3 = null;
                                if (((String) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, CatchingFishCameraXAndroidX.CatchingFishReduxKtor, "")).equals(str)) {
                                    CatchingFishXMLLayoutRedux CatchingFishCoroutine = catchingFishCameraXAndroidX3.CatchingFishCoroutine(catchingFishDaggerHiltMVI, str);
                                    if (CatchingFishCoroutine == null || CatchingFishCoroutine.CatchingFishParcelableFAB.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (catchingFishCameraXAndroidX3) {
                                        catchingFishCameraXAndroidX3.CatchingFishReduxKtor(catchingFishDaggerHiltMVI, str);
                                        HashSet hashSet = new HashSet((Collection) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, catchingFishXMLLayoutRedux, new HashSet()));
                                        hashSet.add(str);
                                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(catchingFishXMLLayoutRedux, hashSet);
                                    }
                                    return null;
                                }
                                CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux2 = CatchingFishCameraXAndroidX.CatchingFishCoroutine;
                                long longValue = ((Long) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, catchingFishXMLLayoutRedux2, 0L)).longValue();
                                if (longValue + 1 == 30) {
                                    synchronized (catchingFishCameraXAndroidX3) {
                                        try {
                                            long longValue2 = ((Long) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, catchingFishXMLLayoutRedux2, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : catchingFishDaggerHiltMVI.CatchingFishParcelableFAB().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 != null && str4.compareTo(str5) <= 0) {
                                                            obj3 = obj4;
                                                        }
                                                        str3 = ((CatchingFishXMLLayoutRedux) entry.getKey()).CatchingFishParcelableFAB;
                                                        str4 = str5;
                                                        hashSet2 = set;
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(CatchingFishOkHttpFAB.CatchingFishJUnitRealm(str3), hashSet3);
                                            longValue = longValue2 - 1;
                                            catchingFishDaggerHiltMVI.CatchingFishReduxKtor(CatchingFishCameraXAndroidX.CatchingFishCoroutine, Long.valueOf(longValue));
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, catchingFishXMLLayoutRedux, new HashSet()));
                                hashSet4.add(str);
                                catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(catchingFishXMLLayoutRedux, hashSet4);
                                catchingFishDaggerHiltMVI.CatchingFishReduxKtor(CatchingFishCameraXAndroidX.CatchingFishCoroutine, Long.valueOf(longValue + 1));
                                catchingFishDaggerHiltMVI.CatchingFishReduxKtor(CatchingFishCameraXAndroidX.CatchingFishReduxKtor, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
