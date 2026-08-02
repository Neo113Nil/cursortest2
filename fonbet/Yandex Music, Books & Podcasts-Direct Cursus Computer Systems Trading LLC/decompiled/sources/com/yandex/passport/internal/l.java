package com.yandex.passport.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.auth.LegacyAccountType;
import defpackage.c7;
import defpackage.zc4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new a(3);
    public final String a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.common.core.f c;
    public final com.yandex.passport.common.account.a d;
    public final com.yandex.passport.common.core.g e;
    public final com.yandex.passport.internal.stash.a f;
    public final Account g;
    public final String h;
    public final h i;
    public final String j;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(String str, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.g gVar, com.yandex.passport.internal.stash.a aVar2) {
        h hVar;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        com.yandex.passport.common.core.f fVar3;
        long parseLong;
        com.yandex.passport.common.core.b bVar;
        str.getClass();
        fVar.getClass();
        aVar.getClass();
        gVar.getClass();
        aVar2.getClass();
        this.a = str;
        this.b = fVar;
        this.c = fVar2;
        this.d = aVar;
        this.e = gVar;
        this.f = aVar2;
        this.g = new Account(str, com.yandex.passport.internal.ui.a.a);
        int i2 = gVar.h;
        this.h = com.yandex.plus.pay.ui.core.b.B(fVar.a) ? LegacyAccountType.STRING_TEAM : i2 != 6 ? i2 != 10 ? i2 != 12 ? LegacyAccountType.STRING_LOGIN : LegacyAccountType.STRING_MAILISH : "phone" : LegacyAccountType.STRING_SOCIAL;
        Pattern pattern = h.e;
        String a = aVar2.a(com.yandex.passport.internal.stash.b.PASSPORT_LINKAGE);
        if (a == null || a.length() == 0) {
            hVar = new h(1, new ArrayList(), new ArrayList(), new HashSet());
        } else {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "start Linkage deserialize: ".concat(a), 8);
            }
            String[] split = TextUtils.split(a, h.e);
            split.getClass();
            if (split.length == 0) {
                hVar = new h(1, new ArrayList(), new ArrayList(), new HashSet());
            } else {
                String str2 = split[0];
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1335395429) {
                        if (hashCode != -1102666215) {
                            if (hashCode == -911343192 && str2.equals("allowed")) {
                                i = 3;
                                if (split.length < 2) {
                                    String str3 = split[1];
                                    str3.getClass();
                                    Pattern pattern2 = h.f;
                                    pattern2.getClass();
                                    arrayList = new ArrayList(com.yandex.plus.core.network.api.utils.a.E(str3, pattern2));
                                } else {
                                    arrayList = new ArrayList();
                                }
                                if (split.length < 3) {
                                    String str4 = split[2];
                                    str4.getClass();
                                    Pattern pattern3 = h.g;
                                    pattern3.getClass();
                                    arrayList2 = new ArrayList(com.yandex.plus.core.network.api.utils.a.E(str4, pattern3));
                                } else {
                                    arrayList2 = new ArrayList();
                                }
                                HashSet hashSet = new HashSet();
                                if (split.length >= 4) {
                                    c7 H = zc4.H(TextUtils.split(split[3], h.h));
                                    while (H.hasNext()) {
                                        String str5 = (String) H.next();
                                        str5.getClass();
                                        int R = StringsKt.R(str5, ':', 0, false);
                                        if (R >= 1 && R != str5.length() - 1) {
                                            String substring = str5.substring(0, R);
                                            try {
                                                parseLong = Long.parseLong(str5.substring(R + 1));
                                            } catch (NumberFormatException unused) {
                                            }
                                            if (parseLong > 0) {
                                                try {
                                                    com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                                                    int parseInt = Integer.parseInt(substring);
                                                    aVar3.getClass();
                                                    bVar = com.yandex.passport.common.core.a.b(parseInt);
                                                } catch (Exception unused2) {
                                                    bVar = com.yandex.passport.common.core.b.c;
                                                }
                                                fVar3 = new com.yandex.passport.common.core.f(bVar, parseLong);
                                                if (fVar3 == null) {
                                                    hashSet.add(fVar3);
                                                }
                                            }
                                        }
                                        fVar3 = null;
                                        if (fVar3 == null) {
                                        }
                                    }
                                }
                                hVar = new h(i, arrayList, arrayList2, hashSet);
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "deserialize Linkage result: " + hVar, 8);
                                }
                            }
                        } else if (str2.equals("linked")) {
                            i = 4;
                            if (split.length < 2) {
                            }
                            if (split.length < 3) {
                            }
                            HashSet hashSet2 = new HashSet();
                            if (split.length >= 4) {
                            }
                            hVar = new h(i, arrayList, arrayList2, hashSet2);
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                        }
                    } else if (str2.equals("denied")) {
                        i = 2;
                        if (split.length < 2) {
                        }
                        if (split.length < 3) {
                        }
                        HashSet hashSet22 = new HashSet();
                        if (split.length >= 4) {
                        }
                        hVar = new h(i, arrayList, arrayList2, hashSet22);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                    }
                }
                i = 1;
                if (split.length < 2) {
                }
                if (split.length < 3) {
                }
                HashSet hashSet222 = new HashSet();
                if (split.length >= 4) {
                }
                hVar = new h(i, arrayList, arrayList2, hashSet222);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
            }
        }
        this.i = hVar;
        this.j = this.a;
    }

    public static l e(l lVar, String str, com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.g gVar, com.yandex.passport.internal.stash.a aVar2, int i) {
        if ((i & 1) != 0) {
            str = lVar.a;
        }
        String str2 = str;
        com.yandex.passport.common.core.f fVar = lVar.b;
        com.yandex.passport.common.core.f fVar2 = lVar.c;
        if ((i & 8) != 0) {
            aVar = lVar.d;
        }
        com.yandex.passport.common.account.a aVar3 = aVar;
        if ((i & 16) != 0) {
            gVar = lVar.e;
        }
        com.yandex.passport.common.core.g gVar2 = gVar;
        if ((i & 32) != 0) {
            aVar2 = lVar.f;
        }
        com.yandex.passport.internal.stash.a aVar4 = aVar2;
        lVar.getClass();
        str2.getClass();
        fVar.getClass();
        aVar3.getClass();
        gVar2.getClass();
        aVar4.getClass();
        return new l(str2, fVar, fVar2, aVar3, gVar2, aVar4);
    }

    public final g d() {
        String concat;
        boolean B = com.yandex.plus.pay.ui.core.b.B(this.b.a);
        com.yandex.passport.common.core.g gVar = this.e;
        if (B) {
            String str = gVar.g;
            str.getClass();
            concat = str.concat("@yandex-team.ru");
        } else {
            concat = gVar.e;
        }
        String str2 = concat;
        Long valueOf = Long.valueOf(gVar.d);
        String str3 = gVar.j;
        Boolean valueOf2 = Boolean.valueOf(gVar.k);
        String str4 = gVar.n;
        Boolean valueOf3 = Boolean.valueOf(!(str4 == null || str4.length() == 0));
        Boolean valueOf4 = Boolean.valueOf(gVar.o);
        com.yandex.passport.api.j[] jVarArr = com.yandex.passport.api.j.a;
        com.yandex.passport.internal.stash.a aVar = this.f;
        String str5 = (String) aVar.a.get("disk_pin_code");
        com.yandex.passport.api.j[] jVarArr2 = com.yandex.passport.api.j.a;
        return new g(valueOf, str2, str3, valueOf2, valueOf3, valueOf4, str5, (String) aVar.a.get("mail_pin_code"), 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && Intrinsics.d(this.d, lVar.d) && Intrinsics.d(this.e, lVar.e) && Intrinsics.d(this.f, lVar.f);
    }

    public final com.yandex.passport.api.n f() {
        com.yandex.passport.api.n.b.getClass();
        com.yandex.passport.common.core.g gVar = this.e;
        gVar.getClass();
        if (gVar.x) {
            return com.yandex.passport.api.n.CHILDISH;
        }
        return com.yandex.passport.api.q.h(gVar.h, gVar.p || gVar.q);
    }

    public final String g() {
        String str = this.e.j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final long h() {
        Long l = this.e.K;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final int hashCode() {
        int d = com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
        com.yandex.passport.common.core.f fVar = this.c;
        return this.f.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((d + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String i() {
        boolean B = com.yandex.plus.pay.ui.core.b.B(this.b.a);
        com.yandex.passport.common.core.g gVar = this.e;
        if (!B) {
            return gVar.h != 10 ? gVar.e : this.a;
        }
        String str = gVar.g;
        str.getClass();
        return str.concat("@yandex-team.ru");
    }

    public final String j() {
        if (com.yandex.plus.pay.ui.core.b.B(this.b.a)) {
            return null;
        }
        com.yandex.passport.common.core.g gVar = this.e;
        int i = gVar.h;
        if (i == 1 || i == 5 || i == 7) {
            String str = gVar.e;
            String str2 = gVar.i;
            String str3 = gVar.g;
            if (str2 != null && !str2.equals(str)) {
                return str2;
            }
            if (str3 != null && !str3.equals(str)) {
                return str3;
            }
        }
        return null;
    }

    public final String k() {
        String str = this.e.l;
        return (str == null && n()) ? this.f.a(com.yandex.passport.internal.stash.b.MAILISH_SOCIAL_CODE) : str;
    }

    public final long l() {
        long b;
        String a = this.f.a(com.yandex.passport.internal.stash.b.UPGRADE_POSTPONED_AT);
        if (a == null) {
            return 0L;
        }
        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, Long.parseLong(a));
        return b;
    }

    public final com.yandex.passport.api.o m() {
        com.yandex.passport.api.o oVar;
        String a = this.f.a(com.yandex.passport.internal.stash.b.UPGRADE_STATUS);
        int i = 0;
        int parseInt = a != null ? Integer.parseInt(a) : 0;
        com.yandex.passport.api.o[] values = com.yandex.passport.api.o.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                oVar = null;
                break;
            }
            oVar = values[i];
            if (oVar.ordinal() == parseInt) {
                break;
            }
            i++;
        }
        return oVar == null ? com.yandex.passport.api.o.a : oVar;
    }

    public final boolean n() {
        return this.e.h == 12;
    }

    public final boolean o() {
        return this.e.h == 10;
    }

    public final String toString() {
        return "ModernAccount(name=" + this.a + ", uid=" + this.b + ", masterUid=" + this.c + ", masterToken=" + this.d + ", userInfo=" + this.e + ", stash=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        this.f.writeToParcel(parcel, i);
    }
}
