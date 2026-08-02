package com.yandex.passport.sloth.command;

import com.yandex.passport.sloth.command.data.a0;
import com.yandex.passport.sloth.command.data.d0;
import com.yandex.passport.sloth.command.data.d1;
import com.yandex.passport.sloth.command.data.g0;
import com.yandex.passport.sloth.command.data.g1;
import com.yandex.passport.sloth.command.data.j0;
import com.yandex.passport.sloth.command.data.n0;
import com.yandex.passport.sloth.command.data.q0;
import com.yandex.passport.sloth.command.data.t0;
import com.yandex.passport.sloth.command.data.w0;
import com.yandex.passport.sloth.command.data.x;
import com.yandex.passport.sloth.command.data.z0;
import defpackage.b6e;
import defpackage.bow;
import defpackage.i5f;
import defpackage.quj;
import defpackage.x3f;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class k {
    public final i5f a = quj.r(x3f.d, new com.yandex.passport.internal.storage.d(19));

    public final c a(com.yandex.passport.common.web.a aVar, j jVar) {
        Object obj;
        int ordinal = aVar.ordinal();
        i5f i5fVar = this.a;
        switch (ordinal) {
            case 0:
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 25:
            case 29:
            case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                obj = Unit.a;
                break;
            case 1:
                String str = jVar.d;
                if (str == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(g0.Companion.serializer(), str);
                break;
            case 4:
                String str2 = jVar.d;
                if (str2 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(j0.Companion.serializer(), str2);
                break;
            case 5:
                String str3 = jVar.d;
                if (str3 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(q0.Companion.serializer(), str3);
                break;
            case 6:
                String str4 = jVar.d;
                if (str4 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(d1.Companion.serializer(), str4);
                break;
            case 7:
                String str5 = jVar.d;
                if (str5 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(n0.Companion.serializer(), str5);
                break;
            case 11:
                String str6 = jVar.d;
                if (str6 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(t0.Companion.serializer(), str6);
                break;
            case 14:
                String str7 = jVar.d;
                if (str7 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(g1.Companion.serializer(), str7);
                break;
            case 15:
                String str8 = jVar.d;
                if (str8 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.o.Companion.serializer(), str8);
                break;
            case 16:
                String str9 = jVar.d;
                if (str9 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(z0.Companion.serializer(), str9);
                break;
            case 21:
                String str10 = jVar.d;
                if (str10 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.u.Companion.serializer(), str10);
                break;
            case 22:
                String str11 = jVar.d;
                if (str11 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.r.Companion.serializer(), str11);
                break;
            case 23:
                String str12 = jVar.d;
                if (str12 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.l.Companion.serializer(), str12);
                break;
            case 24:
                String str13 = jVar.d;
                if (str13 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.i.Companion.serializer(), str13);
                break;
            case 26:
                String str14 = jVar.d;
                if (str14 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(a0.Companion.serializer(), str14);
                break;
            case 27:
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                obj = jVar.d;
                break;
            case 30:
                String str15 = jVar.d;
                if (str15 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.f.Companion.serializer(), str15);
                break;
            case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                String str16 = jVar.d;
                if (str16 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(x.Companion.serializer(), str16);
                break;
            case 32:
                String str17 = jVar.d;
                if (str17 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(d0.Companion.serializer(), str17);
                break;
            case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                String str18 = jVar.d;
                if (str18 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(w0.Companion.serializer(), str18);
                break;
            case 35:
                String str19 = jVar.d;
                if (str19 == null) {
                    bow.t("data must be not null");
                    throw null;
                }
                i5fVar.getClass();
                obj = i5fVar.b(com.yandex.passport.sloth.command.data.c.Companion.serializer(), str19);
                break;
            default:
                b6e.s();
                return null;
        }
        return new c(aVar, jVar.c, obj);
    }
}
