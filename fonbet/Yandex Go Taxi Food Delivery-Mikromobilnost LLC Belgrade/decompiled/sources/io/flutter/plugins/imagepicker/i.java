package io.flutter.plugins.imagepicker;

import defpackage.ckn;
import defpackage.hx10;
import defpackage.ix10;
import defpackage.lx10;
import defpackage.mx10;
import defpackage.ny61;
import defpackage.vzt0;
import io.flutter.plugins.imagepicker.Messages;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class i extends vzt0 {
    public static final i d = new i();

    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case -127:
                Object e = e(byteBuffer);
                if (e != null) {
                    return Messages.SourceCamera.values()[((Long) e).intValue()];
                }
                return null;
            case -126:
                Object e2 = e(byteBuffer);
                if (e2 != null) {
                    return Messages.SourceType.values()[((Long) e2).intValue()];
                }
                return null;
            case -125:
                Object e3 = e(byteBuffer);
                if (e3 != null) {
                    return Messages.CacheRetrievalType.values()[((Long) e3).intValue()];
                }
                return null;
            case -124:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ix10 ix10Var = new ix10();
                Boolean bool = (Boolean) arrayList.get(0);
                if (bool == null) {
                    ny61.r("Nonnull field \"allowMultiple\" is null.");
                    return null;
                }
                ix10Var.a = bool;
                Boolean bool2 = (Boolean) arrayList.get(1);
                if (bool2 == null) {
                    ny61.r("Nonnull field \"usePhotoPicker\" is null.");
                    return null;
                }
                ix10Var.b = bool2;
                ix10Var.c = (Long) arrayList.get(2);
                return ix10Var;
            case -123:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                lx10 lx10Var = new lx10();
                lx10Var.a = (Double) arrayList2.get(0);
                lx10Var.b = (Double) arrayList2.get(1);
                Long l = (Long) arrayList2.get(2);
                if (l != null) {
                    lx10Var.c = l;
                    return lx10Var;
                }
                ny61.r("Nonnull field \"quality\" is null.");
                return null;
            case -122:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                mx10 mx10Var = new mx10();
                lx10 lx10Var2 = (lx10) arrayList3.get(0);
                if (lx10Var2 != null) {
                    mx10Var.a = lx10Var2;
                    return mx10Var;
                }
                ny61.r("Nonnull field \"imageSelectionOptions\" is null.");
                return null;
            case -121:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                Messages.a aVar = new Messages.a();
                aVar.a = (Long) arrayList4.get(0);
                return aVar;
            case -120:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                j jVar = new j();
                Messages.SourceType sourceType = (Messages.SourceType) arrayList5.get(0);
                if (sourceType == null) {
                    ny61.r("Nonnull field \"type\" is null.");
                    return null;
                }
                jVar.a = sourceType;
                jVar.b = (Messages.SourceCamera) arrayList5.get(1);
                return jVar;
            case -119:
                ArrayList arrayList6 = (ArrayList) e(byteBuffer);
                hx10 hx10Var = new hx10();
                String str = (String) arrayList6.get(0);
                if (str == null) {
                    ny61.r("Nonnull field \"code\" is null.");
                    return null;
                }
                hx10Var.a = str;
                hx10Var.b = (String) arrayList6.get(1);
                return hx10Var;
            case -118:
                ArrayList arrayList7 = (ArrayList) e(byteBuffer);
                g gVar = new g();
                Messages.CacheRetrievalType cacheRetrievalType = (Messages.CacheRetrievalType) arrayList7.get(0);
                if (cacheRetrievalType == null) {
                    ny61.r("Nonnull field \"type\" is null.");
                    return null;
                }
                gVar.a = cacheRetrievalType;
                gVar.b = (hx10) arrayList7.get(1);
                List list = (List) arrayList7.get(2);
                if (list != null) {
                    gVar.c = list;
                    return gVar;
                }
                ny61.r("Nonnull field \"paths\" is null.");
                return null;
            default:
                return super.f(b, byteBuffer);
        }
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (obj instanceof Messages.SourceCamera) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Integer.valueOf(((Messages.SourceCamera) obj).index));
            return;
        }
        if (obj instanceof Messages.SourceType) {
            cknVar.write(130);
            k(cknVar, Integer.valueOf(((Messages.SourceType) obj).index));
            return;
        }
        if (obj instanceof Messages.CacheRetrievalType) {
            cknVar.write(HProv.PP_FAST_CODE);
            k(cknVar, Integer.valueOf(((Messages.CacheRetrievalType) obj).index));
            return;
        }
        if (obj instanceof ix10) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION);
            ix10 ix10Var = (ix10) obj;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(ix10Var.a);
            arrayList.add(ix10Var.b);
            arrayList.add(ix10Var.c);
            k(cknVar, arrayList);
            return;
        }
        if (obj instanceof lx10) {
            cknVar.write(HProv.PP_ENUM_CONTAINER_EXTENSION);
            lx10 lx10Var = (lx10) obj;
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(lx10Var.a);
            arrayList2.add(lx10Var.b);
            arrayList2.add(lx10Var.c);
            k(cknVar, arrayList2);
            return;
        }
        if (obj instanceof mx10) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION_DEL);
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(((mx10) obj).a);
            k(cknVar, arrayList3);
            return;
        }
        if (obj instanceof Messages.a) {
            cknVar.write(HProv.PP_CONTAINER_DEFAULT);
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(((Messages.a) obj).a);
            k(cknVar, arrayList4);
            return;
        }
        if (obj instanceof j) {
            cknVar.write(HProv.PP_LCD_QUERY);
            j jVar = (j) obj;
            ArrayList arrayList5 = new ArrayList(2);
            arrayList5.add(jVar.a);
            arrayList5.add(jVar.b);
            k(cknVar, arrayList5);
            return;
        }
        if (obj instanceof hx10) {
            cknVar.write(HProv.PP_ENUM_LOG);
            hx10 hx10Var = (hx10) obj;
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(hx10Var.a);
            arrayList6.add(hx10Var.b);
            k(cknVar, arrayList6);
            return;
        }
        if (!(obj instanceof g)) {
            super.k(cknVar, obj);
            return;
        }
        cknVar.write(HProv.PP_VERSION_EX);
        g gVar = (g) obj;
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add(gVar.a);
        arrayList7.add(gVar.b);
        arrayList7.add(gVar.c);
        k(cknVar, arrayList7);
    }
}
