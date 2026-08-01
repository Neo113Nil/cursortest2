package j0;

import S0.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.FP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4596b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f38289f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C4596b f38290g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38291a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38292b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38293c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f38294d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final FP f38295e;

    public C4596b(Context context) {
        this.f38291a = context;
        this.f38295e = new FP(this, context.getMainLooper());
    }

    public static C4596b a(Context context) {
        C4596b c4596b;
        synchronized (f38289f) {
            try {
                if (f38290g == null) {
                    f38290g = new C4596b(context.getApplicationContext());
                }
                c4596b = f38290g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4596b;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f38292b) {
            try {
                C4595a c4595a = new C4595a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f38292b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f38292b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c4595a);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f38293c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f38293c.put(action, arrayList2);
                    }
                    arrayList2.add(c4595a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f38292b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f38291a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f38293c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z3) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        C4595a c4595a = (C4595a) arrayList2.get(i);
                        if (z3) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c4595a.f38285a);
                        }
                        if (c4595a.f38287c) {
                            if (z3) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = c4595a.f38285a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z3) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c4595a);
                                c4595a.f38287c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z3) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : NativeAdvancedJsUtils.f17906p : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                            ((C4595a) arrayList3.get(i6)).f38287c = false;
                        }
                        this.f38294d.add(new s(29, intent, arrayList3));
                        if (!this.f38295e.hasMessages(1)) {
                            this.f38295e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f38292b) {
            try {
                ArrayList arrayList = (ArrayList) this.f38292b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C4595a c4595a = (C4595a) arrayList.get(size);
                    c4595a.f38288d = true;
                    for (int i = 0; i < c4595a.f38285a.countActions(); i++) {
                        String action = c4595a.f38285a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f38293c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C4595a c4595a2 = (C4595a) arrayList2.get(size2);
                                if (c4595a2.f38286b == broadcastReceiver) {
                                    c4595a2.f38288d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f38293c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
