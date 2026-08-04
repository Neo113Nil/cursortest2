package com.gamericefishpro.space.lb;

import android.util.Base64OutputStream;
import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.g0.t;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d dVar = (d) this.e;
                synchronized (dVar) {
                    try {
                        i iVar = (i) dVar.a.get();
                        ArrayList arrayListA = iVar.a();
                        synchronized (iVar) {
                            iVar.a.a(new com.gamericefishpro.space.a7.c(14, iVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            a aVar = (a) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            case 1:
                d dVar2 = (d) this.e;
                synchronized (dVar2) {
                    i iVar2 = (i) dVar2.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((com.gamericefishpro.space.vb.b) dVar2.c.get()).a();
                    synchronized (iVar2) {
                        iVar2.a.a(new t(iVar2, iVar2.b(jCurrentTimeMillis), strA, com.gamericefishpro.space.hj.c.W(strA), 2));
                    }
                }
                return null;
            default:
                com.gamericefishpro.space.v6.f this$0 = (com.gamericefishpro.space.v6.f) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WorkDatabase workDatabase = this$0.a;
                Long lF = workDatabase.x().f("next_alarm_manager_id");
                int iLongValue = lF != null ? (int) lF.longValue() : 0;
                workDatabase.x().g(new com.gamericefishpro.space.u6.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
        }
    }
}
