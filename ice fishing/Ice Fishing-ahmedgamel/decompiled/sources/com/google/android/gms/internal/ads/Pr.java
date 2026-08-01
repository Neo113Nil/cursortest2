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
import o2.C4783a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import u2.C5069B;

/* loaded from: classes2.dex */
public final class Pr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26872a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26873b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26874c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26875d;

    public /* synthetic */ Pr(int i, Object obj, Object obj2, Object obj3) {
        this.f26872a = i;
        this.f26873b = obj;
        this.f26874c = obj2;
        this.f26875d = obj3;
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
        switch (this.f26872a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) AbstractC2769Sa.f27485a.r()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    u2.D d2 = C4835j.f39733C.f39738c;
                    String str2 = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f26873b).getSystemService("activity");
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
                    q2.f1 f1Var = (q2.f1) this.f26874c;
                    bundle3.putInt("width", f1Var.f40146x);
                    bundle3.putInt("height", f1Var.f40143u);
                    bundle2.putBundle("size", bundle3);
                    ArrayList arrayList = (ArrayList) this.f26875d;
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            case 1:
                C3052cu c3052cu = (C3052cu) this.f26873b;
                ArrayList<String> arrayList2 = c3052cu.f29627h;
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
                bundle4.putStringArrayList("native_custom_templates", c3052cu.i);
                C3462kb c3462kb = c3052cu.f29628j;
                if (c3462kb != null) {
                    if (c3462kb.f31471n > 3) {
                        bundle4.putBoolean("enable_native_media_orientation", true);
                        int i6 = c3462kb.f31467A;
                        String str3 = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? com.anythink.core.common.v.m.f16809e : "square" : "portrait" : "landscape" : "any";
                        if (!com.anythink.core.common.v.m.f16809e.equals(str3)) {
                            bundle4.putString("native_media_orientation", str3);
                        }
                    }
                    int i9 = c3462kb.f31473v;
                    String str4 = i9 != 0 ? i9 != 1 ? i9 != 2 ? com.anythink.core.common.v.m.f16809e : "landscape" : "portrait" : "any";
                    if (!com.anythink.core.common.v.m.f16809e.equals(str4)) {
                        bundle4.putString("native_image_orientation", str4);
                    }
                    bundle4.putBoolean("native_multiple_images", c3462kb.f31474w);
                    bundle4.putBoolean("use_custom_mute", c3462kb.f31477z);
                    int i10 = c3462kb.f31468B;
                    if (i10 != 0) {
                        bundle4.putBoolean("sccg_tap", c3462kb.f31469C);
                        bundle4.putInt("sccg_dir", i10);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f26874c;
                int i11 = packageInfo != null ? packageInfo.versionCode : 0;
                C5069B c5069b = (C5069B) this.f26875d;
                c5069b.i();
                synchronized (c5069b.f41209a) {
                    i = c5069b.f41225r;
                }
                if (i11 > i) {
                    c5069b.i();
                    synchronized (c5069b.f41209a) {
                        try {
                            c5069b.f41227t = new JSONObject();
                            SharedPreferences.Editor editor = c5069b.f41215g;
                            if (editor != null) {
                                editor.remove("native_advanced_settings");
                                c5069b.f41215g.apply();
                            }
                            c5069b.j();
                        } finally {
                        }
                    }
                    c5069b.i();
                    synchronized (c5069b.f41209a) {
                        try {
                            if (c5069b.f41225r != i11) {
                                c5069b.f41225r = i11;
                                SharedPreferences.Editor editor2 = c5069b.f41215g;
                                if (editor2 != null) {
                                    editor2.putInt("version_code", i11);
                                    c5069b.f41215g.apply();
                                }
                                c5069b.j();
                            }
                        } finally {
                        }
                    }
                }
                c5069b.i();
                synchronized (c5069b.f41209a) {
                    jSONObject = c5069b.f41227t;
                }
                String str5 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(c3052cu.f29626g)) != null) {
                    str5 = optJSONArray.toString();
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle4.putString("native_advanced_settings", str5);
                }
                int i12 = c3052cu.f29630l;
                if (i12 > 1) {
                    bundle4.putInt("max_num_ads", i12);
                }
                C2550Fc c2550Fc = c3052cu.f29621b;
                if (c2550Fc != null) {
                    String str6 = c2550Fc.f24808v;
                    if (TextUtils.isEmpty(str6)) {
                        if (c2550Fc.f24806n >= 2) {
                            int i13 = c2550Fc.f24809w;
                            str = i13 != 2 ? i13 != 3 ? "l" : "p" : "l";
                        } else {
                            int i14 = c2550Fc.f24807u;
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 41);
                                    sb.append("Instream ad video aspect ratio ");
                                    sb.append(i14);
                                    sb.append(" is wrong.");
                                    v2.i.c(sb.toString());
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
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.od)).booleanValue() || c3462kb == null) {
                    return;
                }
                q2.Z0 z02 = c3462kb.f31476y;
                if (z02 != null) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putBoolean("startMuted", z02.f40086n);
                    bundle5.putBoolean("clickToExpandRequested", z02.f40088v);
                    bundle5.putBoolean("customControlsRequested", z02.f40087u);
                    bundle4.putBundle(com.anythink.basead.exoplayer.k.o.f8444a, bundle5);
                }
                bundle4.putBoolean("disable_image_loading", c3462kb.f31472u);
                bundle4.putInt("preferred_ad_choices_position", c3462kb.f31475x);
                return;
            default:
                try {
                    JSONObject N8 = A8.b.N("pii", (JSONObject) obj);
                    C4783a c4783a = (C4783a) this.f26873b;
                    if (c4783a != null) {
                        String str7 = c4783a.f39556a;
                        if (!TextUtils.isEmpty(str7)) {
                            N8.put("rdid", str7);
                            N8.put("is_lat", c4783a.f39557b);
                            N8.put("idtype", "adid");
                            C3381j1 c3381j1 = (C3381j1) this.f26875d;
                            String str8 = (String) c3381j1.f31157v;
                            long j6 = c3381j1.f31156u;
                            if (str8 != null && j6 > 0) {
                                N8.put("paidv1_id_android_3p", str8);
                                N8.put("paidv1_creation_time_android_3p", j6);
                            }
                            return;
                        }
                    }
                    String str9 = (String) this.f26874c;
                    if (str9 != null) {
                        N8.put("pdid", str9);
                        N8.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e9) {
                    u2.z.l("Failed putting Ad ID.", e9);
                    return;
                }
        }
    }
}
