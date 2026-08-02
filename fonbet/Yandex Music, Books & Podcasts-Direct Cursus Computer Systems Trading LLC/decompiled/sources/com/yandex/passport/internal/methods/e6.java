package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.ParcelFormatException;
import defpackage.v75;
import defpackage.wb8;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class e6 implements f {
    public static final e6 b = new e6(0);
    public static final e6 c = new e6(1);
    public static final e6 d = new e6(2);
    public static final e6 e = new e6(3);
    public static final e6 f = new e6(4);
    public static final e6 g = new e6(5);
    public static final e6 h = new e6(6);
    public static final e6 i = new e6(7);
    public final /* synthetic */ int a;

    public /* synthetic */ e6(int i2) {
        this.a = i2;
    }

    public static Pair c(Bundle bundle) {
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("first-uid");
        Bundle bundle3 = bundle.getBundle("second-uid");
        if (bundle2 != null && bundle3 != null) {
            return new Pair(com.yandex.plus.pay.ui.core.b.r(bundle2), com.yandex.plus.pay.ui.core.b.r(bundle3));
        }
        xq0.q("both uids are must be in the args");
        return null;
    }

    public Bundle a(Bundle bundle) {
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("push-data-key");
        if (bundle2 != null) {
            return bundle2;
        }
        wb8.h("can't get required bundle push-data-key");
        return null;
    }

    public List b(Bundle bundle) {
        bundle.getClass();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("push_platforms");
        if (stringArrayList == null) {
            throw new ParcelFormatException("Missing " + com.yandex.passport.api.v2.class.getSimpleName() + " list in bundle");
        }
        ArrayList arrayList = new ArrayList(v75.o(stringArrayList, 10));
        for (String str : stringArrayList) {
            try {
                str.getClass();
                arrayList.add(com.yandex.passport.api.v2.valueOf(str));
            } catch (IllegalArgumentException unused) {
                throw new ParcelFormatException("Invalid " + com.yandex.passport.api.v2.class.getSimpleName() + " value: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.yandex.passport.internal.methods.f
    public final Object f(Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.getClass();
                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("passport-account-list");
                if (parcelableArrayList != null) {
                    return parcelableArrayList;
                }
                throw new ParcelFormatException("Invalid parcelable " + com.yandex.passport.internal.account.f.class.getSimpleName() + " in the bundle");
            case 1:
                bundle.getClass();
                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("passport-available-accounts");
                if (parcelableArrayList2 != null) {
                    return parcelableArrayList2;
                }
                throw new ParcelFormatException("Invalid parcelable " + com.yandex.passport.internal.account.g.class.getSimpleName() + " in the bundle");
            case 2:
                bundle.getClass();
                return new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
            case 3:
                bundle.getClass();
                if (!bundle.containsKey("environment") || !bundle.containsKey("passport-uid")) {
                    return null;
                }
                int i2 = bundle.getInt("environment");
                long j = bundle.getLong("passport-uid");
                com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i2);
                a.getClass();
                return new com.yandex.passport.api.z1(a, j);
            case 4:
                return a(bundle);
            case 5:
                return b(bundle);
            case 6:
                return c(bundle);
            case 7:
                bundle.getClass();
                return Unit.a;
            default:
                bundle.getClass();
                return Integer.valueOf(bundle.getInt("UPLOAD_DIARY_RESULT_KEY"));
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final void g(Bundle bundle, Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                bundle.putParcelableArrayList("passport-account-list", new ArrayList<>(list));
                break;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                bundle.putParcelableArrayList("passport-available-accounts", new ArrayList<>(list2));
                break;
            case 2:
                com.yandex.passport.api.z1 z1Var = (com.yandex.passport.api.z1) obj;
                z1Var.getClass();
                bundle.putLong("passport-uid", z1Var.b);
                bundle.putInt("environment", z1Var.a.a);
                break;
            case 3:
                com.yandex.passport.api.z1 z1Var2 = (com.yandex.passport.api.z1) obj;
                if (z1Var2 != null) {
                    bundle.putLong("passport-uid", z1Var2.b);
                    bundle.putInt("environment", z1Var2.a.a);
                    break;
                }
                break;
            case 4:
                Bundle bundle2 = (Bundle) obj;
                bundle2.getClass();
                bundle.putBundle("push-data-key", bundle2);
                break;
            case 5:
                List list3 = (List) obj;
                list3.getClass();
                List list4 = list3;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.yandex.passport.api.v2) it.next()).name());
                }
                bundle.putStringArrayList("push_platforms", new ArrayList<>(arrayList));
                break;
            case 6:
                Pair pair = (Pair) obj;
                pair.getClass();
                com.yandex.passport.api.z1 z1Var3 = (com.yandex.passport.api.z1) pair.a;
                z1Var3.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("passport-uid", z1Var3);
                bundle.putBundle("first-uid", bundle3);
                com.yandex.passport.api.z1 z1Var4 = (com.yandex.passport.api.z1) pair.b;
                z1Var4.getClass();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("passport-uid", z1Var4);
                bundle.putBundle("second-uid", bundle4);
                break;
            case 7:
                ((Unit) obj).getClass();
                break;
            default:
                bundle.putInt("UPLOAD_DIARY_RESULT_KEY", ((Number) obj).intValue());
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final String getKey() {
        switch (this.a) {
            case 0:
                return "passport-account-list";
            case 1:
                return "passport-available-accounts";
            case 2:
                return "passport-uid";
            case 3:
                return "passport-uid";
            case 4:
                return "push-data-key";
            case 5:
                return "push_platforms";
            case 6:
                return "first-uidsecond-uid";
            case 7:
                return "";
            default:
                return "UPLOAD_DIARY_RESULT_KEY";
        }
    }
}
