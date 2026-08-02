package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4869a;
import r2.C4906k;
import w2.C5140B;

/* loaded from: classes2.dex */
public final class Pr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27659a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27660b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27661c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27662d;

    public /* synthetic */ Pr(int i, Object obj, Object obj2, Object obj3) {
        this.f27659a = i;
        this.f27660b = obj;
        this.f27661c = obj2;
        this.f27662d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray optJSONArray;
        switch (this.f27659a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) AbstractC2789Sa.f28277a.r()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    w2.D d9 = C4906k.f40186C.f40191c;
                    String str2 = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f27660b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                componentName2 = runningTaskInfo.topActivity;
                                str2 = componentName2.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", str2);
                    Bundle bundle3 = new Bundle();
                    s2.f1 f1Var = (s2.f1) this.f27661c;
                    bundle3.putInt("width", f1Var.f40445x);
                    bundle3.putInt("height", f1Var.f40442u);
                    bundle2.putBundle("size", bundle3);
                    ArrayList arrayList = (ArrayList) this.f27662d;
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            case 1:
                C3075cu c3075cu = (C3075cu) this.f27660b;
                ArrayList<String> arrayList2 = c3075cu.f30397h;
                Bundle bundle4 = (Bundle) obj;
                if (arrayList2 == null) {
                    return;
                }
                if (arrayList2.isEmpty()) {
                    bundle4.putInt("native_version", 0);
                    return;
                }
                bundle4.putInt("native_version", 3);
                bundle4.putStringArrayList("native_templates", arrayList2);
                bundle4.putStringArrayList("native_custom_templates", c3075cu.i);
                C3485kb c3485kb = c3075cu.f30398j;
                if (c3485kb != null) {
                    if (c3485kb.f32248n > 3) {
                        bundle4.putBoolean("enable_native_media_orientation", true);
                        int i4 = c3485kb.f32244A;
                        String str3 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? com.anythink.core.common.v.m.f17596e : "square" : "portrait" : "landscape" : "any";
                        if (!com.anythink.core.common.v.m.f17596e.equals(str3)) {
                            bundle4.putString("native_media_orientation", str3);
                        }
                    }
                    int i6 = c3485kb.f32250v;
                    String str4 = i6 != 0 ? i6 != 1 ? i6 != 2 ? com.anythink.core.common.v.m.f17596e : "landscape" : "portrait" : "any";
                    if (!com.anythink.core.common.v.m.f17596e.equals(str4)) {
                        bundle4.putString("native_image_orientation", str4);
                    }
                    bundle4.putBoolean("native_multiple_images", c3485kb.f32251w);
                    bundle4.putBoolean("use_custom_mute", c3485kb.f32254z);
                    int i9 = c3485kb.f32245B;
                    if (i9 != 0) {
                        bundle4.putBoolean("sccg_tap", c3485kb.f32246C);
                        bundle4.putInt("sccg_dir", i9);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f27661c;
                int i10 = packageInfo != null ? packageInfo.versionCode : 0;
                C5140B c5140b = (C5140B) this.f27662d;
                c5140b.i();
                synchronized (c5140b.f41599a) {
                    i = c5140b.f41615r;
                }
                if (i10 > i) {
                    c5140b.i();
                    synchronized (c5140b.f41599a) {
                        try {
                            c5140b.f41617t = new JSONObject();
                            SharedPreferences.Editor editor = c5140b.f41605g;
                            if (editor != null) {
                                editor.remove("native_advanced_settings");
                                c5140b.f41605g.apply();
                            }
                            c5140b.j();
                        } finally {
                        }
                    }
                    c5140b.i();
                    synchronized (c5140b.f41599a) {
                        try {
                            if (c5140b.f41615r != i10) {
                                c5140b.f41615r = i10;
                                SharedPreferences.Editor editor2 = c5140b.f41605g;
                                if (editor2 != null) {
                                    editor2.putInt("version_code", i10);
                                    c5140b.f41605g.apply();
                                }
                                c5140b.j();
                            }
                        } finally {
                        }
                    }
                }
                c5140b.i();
                synchronized (c5140b.f41599a) {
                    jSONObject = c5140b.f41617t;
                }
                String str5 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(c3075cu.f30396g)) != null) {
                    str5 = optJSONArray.toString();
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle4.putString("native_advanced_settings", str5);
                }
                int i11 = c3075cu.f30400l;
                if (i11 > 1) {
                    bundle4.putInt("max_num_ads", i11);
                }
                C2570Fc c2570Fc = c3075cu.f30391b;
                if (c2570Fc != null) {
                    String str6 = c2570Fc.f25597v;
                    if (TextUtils.isEmpty(str6)) {
                        if (c2570Fc.f25595n >= 2) {
                            int i12 = c2570Fc.f25598w;
                            str = i12 != 2 ? i12 != 3 ? "l" : "p" : "l";
                        } else {
                            int i13 = c2570Fc.f25596u;
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 41);
                                    sb.append("Instream ad video aspect ratio ");
                                    sb.append(i13);
                                    sb.append(" is wrong.");
                                    x2.i.c(sb.toString());
                                } else {
                                    str = "p";
                                }
                            }
                            str = "l";
                        }
                        bundle4.putString("ia_var", str);
                    } else {
                        bundle4.putString("ad_tag", str6);
                    }
                    bundle4.putBoolean("instr", true);
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.od)).booleanValue() || c3485kb == null) {
                    return;
                }
                s2.Z0 z02 = c3485kb.f32253y;
                if (z02 != null) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putBoolean("startMuted", z02.f40385n);
                    bundle5.putBoolean("clickToExpandRequested", z02.f40387v);
                    bundle5.putBoolean("customControlsRequested", z02.f40386u);
                    bundle4.putBundle(com.anythink.basead.exoplayer.k.o.f9230a, bundle5);
                }
                bundle4.putBoolean("disable_image_loading", c3485kb.f32249u);
                bundle4.putInt("preferred_ad_choices_position", c3485kb.f32252x);
                return;
            default:
                try {
                    JSONObject v9 = d6.c.v("pii", (JSONObject) obj);
                    C4869a c4869a = (C4869a) this.f27660b;
                    if (c4869a != null) {
                        String str7 = c4869a.f40039a;
                        if (!TextUtils.isEmpty(str7)) {
                            v9.put("rdid", str7);
                            v9.put("is_lat", c4869a.f40040b);
                            v9.put("idtype", "adid");
                            C3404j1 c3404j1 = (C3404j1) this.f27662d;
                            String str8 = (String) c3404j1.f31944v;
                            long j6 = c3404j1.f31943u;
                            if (str8 != null && j6 > 0) {
                                v9.put("paidv1_id_android_3p", str8);
                                v9.put("paidv1_creation_time_android_3p", j6);
                            }
                            return;
                        }
                    }
                    String str9 = (String) this.f27661c;
                    if (str9 != null) {
                        v9.put("pdid", str9);
                        v9.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e9) {
                    w2.z.l("Failed putting Ad ID.", e9);
                    return;
                }
        }
    }
}
