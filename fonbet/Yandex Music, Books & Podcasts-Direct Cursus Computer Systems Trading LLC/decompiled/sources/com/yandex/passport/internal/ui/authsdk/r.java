package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.sloth.d0;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.e0;
import com.yandex.passport.sloth.data.f0;
import com.yandex.passport.sloth.data.g0;
import com.yandex.passport.sloth.data.h0;
import com.yandex.passport.sloth.data.i0;
import com.yandex.passport.sloth.data.j0;
import com.yandex.passport.sloth.data.k0;
import com.yandex.passport.sloth.data.l0;
import com.yandex.passport.sloth.data.m0;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import defpackage.xq0;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        o0 b0Var;
        switch (this.a) {
            case 0:
                return new s(parcel);
            case 1:
                parcel.getClass();
                return new t(com.yandex.passport.internal.l.CREATOR.createFromParcel(parcel));
            case 2:
                return new u(parcel);
            case 3:
                parcel.getClass();
                return new v(m.CREATOR.createFromParcel(parcel));
            case 4:
                return new a0(parcel);
            case 5:
                return new b0(parcel);
            case 6:
                return new com.yandex.passport.internal.ui.base.i(parcel);
            case 7:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.bouncer.v(parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.domik.identifier.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new d0(com.yandex.passport.common.ui.a.valueOf(parcel.readString()), (com.yandex.passport.sloth.data.m) parcel.readParcelable(d0.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new com.yandex.passport.internal.ui.social.gimap.o(parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Parcelable.Creator<com.yandex.passport.internal.ui.social.gimap.o> creator = com.yandex.passport.internal.ui.social.gimap.o.CREATOR;
                return new com.yandex.passport.internal.ui.social.gimap.p(readString, readString2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.internal.ui.social.gimap.p.class.getClassLoader()));
            case 12:
                parcel.getClass();
                return new com.yandex.passport.sloth.data.a((com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.sloth.data.a.class.getClassLoader()), (com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.sloth.data.a.class.getClassLoader()));
            case 13:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.passport.sloth.data.b.a;
            case 14:
                parcel.getClass();
                return new com.yandex.passport.sloth.data.c(parcel.readInt());
            case 15:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.passport.sloth.data.d.a;
            case 16:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.passport.sloth.data.e.a;
            case 17:
                parcel.getClass();
                return new com.yandex.passport.sloth.data.f(parcel.readInt());
            case 18:
                parcel.getClass();
                int readInt = parcel.readInt();
                switch (readInt) {
                    case 0:
                        String readString3 = parcel.readString();
                        Parcelable readParcelable = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                        if (readParcelable == null) {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                            return null;
                        }
                        b0Var = new com.yandex.passport.sloth.data.b0(readString3, (com.yandex.passport.sloth.dependencies.e) readParcelable, parcel.readInt() != 0);
                        return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                    case 1:
                        Parcelable readParcelable2 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                        if (readParcelable2 != null) {
                            com.yandex.passport.sloth.dependencies.e eVar = (com.yandex.passport.sloth.dependencies.e) readParcelable2;
                            boolean z = parcel.readInt() != 0;
                            Parcelable readParcelable3 = parcel.readParcelable(com.yandex.passport.sloth.data.a.class.getClassLoader());
                            if (readParcelable3 != null) {
                                b0Var = new i0(eVar, z, (com.yandex.passport.sloth.data.a) readParcelable3, null);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.a.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 2:
                        Parcelable readParcelable4 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable4 != null) {
                            com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) readParcelable4;
                            long readLong = parcel.readLong();
                            String readString4 = parcel.readString();
                            boolean z2 = parcel.readInt() != 0;
                            Parcelable readParcelable5 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                            if (readParcelable5 != null) {
                                b0Var = new e0(fVar, readLong, readString4, z2, (com.yandex.passport.sloth.dependencies.e) readParcelable5);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 3:
                        String readString5 = parcel.readString();
                        String readString6 = parcel.readString();
                        String readString7 = parcel.readString();
                        String readString8 = parcel.readString();
                        Parcelable readParcelable6 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                        if (readParcelable6 != null) {
                            b0Var = new l0(readString5, readString6, readString7, readString8, (com.yandex.passport.sloth.dependencies.e) readParcelable6);
                            return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                        }
                        xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        return null;
                    case 4:
                        Parcelable readParcelable7 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                        if (readParcelable7 != null) {
                            b0Var = new f0((com.yandex.passport.sloth.dependencies.e) readParcelable7);
                            return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                        }
                        xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        return null;
                    case 5:
                        String readString9 = parcel.readString();
                        Parcelable readParcelable8 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable8 != null) {
                            com.yandex.passport.common.core.f fVar2 = (com.yandex.passport.common.core.f) readParcelable8;
                            boolean z3 = parcel.readInt() != 0;
                            Parcelable readParcelable9 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                            if (readParcelable9 != null) {
                                b0Var = new j0(readString9, fVar2, z3, (com.yandex.passport.sloth.dependencies.e) readParcelable9);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 6:
                        String u = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable10 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable10 != null) {
                            com.yandex.passport.common.core.f fVar3 = (com.yandex.passport.common.core.f) readParcelable10;
                            Serializable readSerializable = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar = (com.yandex.passport.sloth.data.o) (readSerializable instanceof com.yandex.passport.sloth.data.o ? readSerializable : null);
                            if (oVar != null) {
                                b0Var = new com.yandex.passport.sloth.data.u(u, fVar3, oVar, false);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 7:
                        String u2 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable11 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable11 != null) {
                            com.yandex.passport.common.core.f fVar4 = (com.yandex.passport.common.core.f) readParcelable11;
                            Serializable readSerializable2 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar2 = (com.yandex.passport.sloth.data.o) (readSerializable2 instanceof com.yandex.passport.sloth.data.o ? readSerializable2 : null);
                            if (oVar2 != null) {
                                b0Var = new com.yandex.passport.sloth.data.z(fVar4, oVar2, u2);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 8:
                        String u3 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable12 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable12 != null) {
                            com.yandex.passport.common.core.f fVar5 = (com.yandex.passport.common.core.f) readParcelable12;
                            Serializable readSerializable3 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar3 = (com.yandex.passport.sloth.data.o) (readSerializable3 instanceof com.yandex.passport.sloth.data.o ? readSerializable3 : null);
                            if (oVar3 != null) {
                                b0Var = new com.yandex.passport.sloth.data.v(fVar5, oVar3, u3);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 9:
                        String u4 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable13 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable13 != null) {
                            com.yandex.passport.common.core.f fVar6 = (com.yandex.passport.common.core.f) readParcelable13;
                            Serializable readSerializable4 = parcel.readSerializable();
                            if (!(readSerializable4 instanceof com.yandex.passport.sloth.data.o)) {
                                readSerializable4 = null;
                            }
                            com.yandex.passport.sloth.data.o oVar4 = (com.yandex.passport.sloth.data.o) readSerializable4;
                            if (oVar4 != null) {
                                Serializable readSerializable5 = parcel.readSerializable();
                                com.yandex.passport.sloth.data.h hVar = (com.yandex.passport.sloth.data.h) (readSerializable5 instanceof com.yandex.passport.sloth.data.h ? readSerializable5 : null);
                                if (hVar != null) {
                                    b0Var = new n0(u4, fVar6, oVar4, hVar);
                                    return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                                }
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.h.class, new StringBuilder("No data for ")));
                            } else {
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                            }
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 10:
                        String u5 = com.yandex.plus.core.locale.b.u(parcel);
                        String u6 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable14 = parcel.readParcelable(com.yandex.passport.sloth.dependencies.e.class.getClassLoader());
                        if (readParcelable14 != null) {
                            com.yandex.passport.sloth.dependencies.e eVar2 = (com.yandex.passport.sloth.dependencies.e) readParcelable14;
                            boolean z4 = parcel.readInt() != 0;
                            Parcelable readParcelable15 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                            if (readParcelable15 != null) {
                                b0Var = new com.yandex.passport.sloth.data.y(u5, u6, eVar2, z4, (com.yandex.passport.common.core.f) readParcelable15, parcel.readString(), parcel.readString(), com.yandex.plus.core.locale.b.u(parcel));
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.dependencies.e.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 11:
                        String u7 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable16 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable16 != null) {
                            b0Var = new com.yandex.passport.sloth.data.w((com.yandex.passport.common.core.f) readParcelable16, u7);
                            return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                        }
                        xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        return null;
                    case 12:
                        Serializable readSerializable6 = parcel.readSerializable();
                        com.yandex.passport.sloth.data.o oVar5 = (com.yandex.passport.sloth.data.o) (readSerializable6 instanceof com.yandex.passport.sloth.data.o ? readSerializable6 : null);
                        if (oVar5 != null) {
                            int readInt2 = parcel.readInt();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (int i = 0; i < readInt2; i++) {
                                String readString10 = parcel.readString();
                                String readString11 = parcel.readString();
                                if (readString10 != null && readString11 != null) {
                                    linkedHashMap.put(readString10, readString11);
                                }
                            }
                            Parcelable readParcelable17 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                            if (readParcelable17 != null) {
                                b0Var = new m0(oVar5, linkedHashMap, (com.yandex.passport.common.core.f) readParcelable17, Long.valueOf(parcel.readLong()));
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 13:
                        b0Var = new com.yandex.passport.sloth.data.x((com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader()), com.yandex.plus.core.locale.b.u(parcel));
                        return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                    case 14:
                        Parcelable readParcelable18 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable18 != null) {
                            com.yandex.passport.common.core.f fVar7 = (com.yandex.passport.common.core.f) readParcelable18;
                            long readLong2 = parcel.readLong();
                            Serializable readSerializable7 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar6 = (com.yandex.passport.sloth.data.o) (readSerializable7 instanceof com.yandex.passport.sloth.data.o ? readSerializable7 : null);
                            if (oVar6 != null) {
                                b0Var = new com.yandex.passport.sloth.data.t(readLong2, fVar7, oVar6);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 15:
                        String u8 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable19 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable19 != null) {
                            b0Var = new com.yandex.passport.sloth.data.d0(u8, (com.yandex.passport.common.core.f) readParcelable19, com.yandex.plus.core.locale.b.u(parcel));
                            return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                        }
                        xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        return null;
                    case 16:
                        Parcelable readParcelable20 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable20 != null) {
                            com.yandex.passport.common.core.f fVar8 = (com.yandex.passport.common.core.f) readParcelable20;
                            long readLong3 = parcel.readLong();
                            Serializable readSerializable8 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar7 = (com.yandex.passport.sloth.data.o) (readSerializable8 instanceof com.yandex.passport.sloth.data.o ? readSerializable8 : null);
                            if (oVar7 != null) {
                                b0Var = new c0(fVar8, readLong3, oVar7, com.yandex.plus.core.locale.b.u(parcel), com.yandex.plus.core.locale.b.u(parcel));
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 17:
                        Parcelable readParcelable21 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable21 != null) {
                            com.yandex.passport.common.core.f fVar9 = (com.yandex.passport.common.core.f) readParcelable21;
                            Parcelable readParcelable22 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                            if (readParcelable22 != null) {
                                com.yandex.passport.common.core.f fVar10 = (com.yandex.passport.common.core.f) readParcelable22;
                                long readLong4 = parcel.readLong();
                                boolean z5 = parcel.readInt() != 0;
                                Serializable readSerializable9 = parcel.readSerializable();
                                com.yandex.passport.sloth.data.o oVar8 = (com.yandex.passport.sloth.data.o) (readSerializable9 instanceof com.yandex.passport.sloth.data.o ? readSerializable9 : null);
                                if (oVar8 != null) {
                                    b0Var = new k0(fVar9, fVar10, readLong4, z5, oVar8);
                                    return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                                }
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                            } else {
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                            }
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 18:
                        String u9 = com.yandex.plus.core.locale.b.u(parcel);
                        Parcelable readParcelable23 = parcel.readParcelable(com.yandex.passport.sloth.data.g.class.getClassLoader());
                        if (readParcelable23 != null) {
                            com.yandex.passport.sloth.data.g gVar = (com.yandex.passport.sloth.data.g) readParcelable23;
                            String u10 = com.yandex.plus.core.locale.b.u(parcel);
                            Parcelable readParcelable24 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                            if (readParcelable24 != null) {
                                com.yandex.passport.common.core.f fVar11 = (com.yandex.passport.common.core.f) readParcelable24;
                                Serializable readSerializable10 = parcel.readSerializable();
                                com.yandex.passport.sloth.data.o oVar9 = (com.yandex.passport.sloth.data.o) (readSerializable10 instanceof com.yandex.passport.sloth.data.o ? readSerializable10 : null);
                                if (oVar9 != null) {
                                    b0Var = new g0(u9, gVar, u10, fVar11, oVar9, parcel.readInt());
                                    return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                                }
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                            } else {
                                xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                            }
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.g.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 19:
                        Parcelable readParcelable25 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable25 != null) {
                            com.yandex.passport.common.core.f fVar12 = (com.yandex.passport.common.core.f) readParcelable25;
                            Serializable readSerializable11 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar10 = (com.yandex.passport.sloth.data.o) (readSerializable11 instanceof com.yandex.passport.sloth.data.o ? readSerializable11 : null);
                            if (oVar10 != null) {
                                b0Var = new com.yandex.passport.sloth.data.a0(fVar12, oVar10, com.yandex.plus.core.locale.b.u(parcel));
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    case 20:
                        Parcelable readParcelable26 = parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
                        if (readParcelable26 != null) {
                            com.yandex.passport.common.core.f fVar13 = (com.yandex.passport.common.core.f) readParcelable26;
                            Serializable readSerializable12 = parcel.readSerializable();
                            com.yandex.passport.sloth.data.o oVar11 = (com.yandex.passport.sloth.data.o) (readSerializable12 instanceof com.yandex.passport.sloth.data.o ? readSerializable12 : null);
                            if (oVar11 != null) {
                                b0Var = new h0(parcel.readLong(), fVar13, oVar11);
                                return new com.yandex.passport.sloth.data.m(b0Var, (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.core.b) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()), (com.yandex.passport.common.properties.a) parcel.readParcelable(com.yandex.passport.sloth.data.m.class.getClassLoader()));
                            }
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.sloth.data.o.class, new StringBuilder("No data for ")));
                        } else {
                            xq0.q(com.appsflyer.internal.k.l(com.yandex.passport.common.core.f.class, new StringBuilder("No data for ")));
                        }
                        return null;
                    default:
                        xq0.k(readInt, "Wrong variant code ");
                        return null;
                }
            case 19:
                parcel.getClass();
                return new com.yandex.passport.sloth.data.a0((com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.sloth.data.a0.class.getClassLoader()), com.yandex.passport.sloth.data.o.valueOf(parcel.readString()), parcel.readString());
            case 20:
                parcel.getClass();
                return new com.yandex.passport.sloth.dependencies.e(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), com.yandex.passport.sloth.data.o.valueOf(parcel.readString()), (EnumSet) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString());
            case 21:
                parcel.getClass();
                com.yandex.plus.acquisition.adapter.api.c createFromParcel = parcel.readInt() == 0 ? null : com.yandex.plus.acquisition.adapter.api.c.CREATOR.createFromParcel(parcel);
                String readString12 = parcel.readString();
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = com.appsflyer.internal.k.b(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                }
                return new com.yandex.plus.acquisition.adapter.api.d(createFromParcel, readString12, linkedHashMap2);
            case 22:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt4);
                for (int i3 = 0; i3 != readInt4; i3++) {
                    linkedHashSet.add(com.yandex.plus.acquisition.adapter.api.b.CREATOR.createFromParcel(parcel));
                }
                int readInt5 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt5);
                for (int i4 = 0; i4 != readInt5; i4++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new com.yandex.plus.acquisition.adapter.api.c(linkedHashSet, linkedHashSet2);
            case 23:
                parcel.getClass();
                return new com.yandex.plus.acquisition.adapter.api.b(parcel.readLong(), parcel.readLong());
            case 24:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.adapter.api.e.a;
            case 25:
                parcel.getClass();
                return new com.yandex.plus.acquisition.adapter.api.f(parcel.readString());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.adapter.api.g.a;
            case 27:
                parcel.getClass();
                return new com.yandex.plus.acquisition.adapter.api.h(parcel.readString());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new com.yandex.plus.acquisition.adapter.api.i(parcel.readString());
            default:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.acquisition.adapter.api.j.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s[i];
            case 1:
                return new t[i];
            case 2:
                return new u[i];
            case 3:
                return new v[i];
            case 4:
                return new a0[i];
            case 5:
                return new b0[i];
            case 6:
                return new com.yandex.passport.internal.ui.base.i[i];
            case 7:
                return new com.yandex.passport.internal.ui.bouncer.v[i];
            case 8:
                return new com.yandex.passport.internal.ui.domik.identifier.a[i];
            case 9:
                return new d0[i];
            case 10:
                return new com.yandex.passport.internal.ui.social.gimap.o[i];
            case 11:
                return new com.yandex.passport.internal.ui.social.gimap.p[i];
            case 12:
                return new com.yandex.passport.sloth.data.a[i];
            case 13:
                return new com.yandex.passport.sloth.data.b[i];
            case 14:
                return new com.yandex.passport.sloth.data.c[i];
            case 15:
                return new com.yandex.passport.sloth.data.d[i];
            case 16:
                return new com.yandex.passport.sloth.data.e[i];
            case 17:
                return new com.yandex.passport.sloth.data.f[i];
            case 18:
                return new com.yandex.passport.sloth.data.m[i];
            case 19:
                return new com.yandex.passport.sloth.data.a0[i];
            case 20:
                return new com.yandex.passport.sloth.dependencies.e[i];
            case 21:
                return new com.yandex.plus.acquisition.adapter.api.d[i];
            case 22:
                return new com.yandex.plus.acquisition.adapter.api.c[i];
            case 23:
                return new com.yandex.plus.acquisition.adapter.api.b[i];
            case 24:
                return new com.yandex.plus.acquisition.adapter.api.e[i];
            case 25:
                return new com.yandex.plus.acquisition.adapter.api.f[i];
            case 26:
                return new com.yandex.plus.acquisition.adapter.api.g[i];
            case 27:
                return new com.yandex.plus.acquisition.adapter.api.h[i];
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.acquisition.adapter.api.i[i];
            default:
                return new com.yandex.plus.acquisition.adapter.api.j[i];
        }
    }
}
