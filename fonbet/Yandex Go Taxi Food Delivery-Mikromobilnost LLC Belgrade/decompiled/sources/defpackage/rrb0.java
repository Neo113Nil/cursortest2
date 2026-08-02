package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.div.state.db.StateEntry;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jrb0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class rrb0 extends vzt0 {
    public static final rrb0 d = new rrb0();

    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        Long valueOf9;
        Long valueOf10;
        Long valueOf11;
        Long valueOf12;
        Long valueOf13;
        Long valueOf14;
        Long valueOf15;
        Long valueOf16;
        Long valueOf17;
        Long valueOf18;
        Long valueOf19;
        Long l = null;
        switch (b) {
            case Byte.MIN_VALUE:
                Map map = (Map) e(byteBuffer);
                jrb0.a aVar = new jrb0.a();
                aVar.a = (String) map.get("documentId");
                Object obj = map.get("pageNumber");
                if (obj != null) {
                    l = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
                }
                aVar.b = l;
                aVar.c = (Boolean) map.get("autoCloseAndroid");
                return aVar;
            case -127:
                Map map2 = (Map) e(byteBuffer);
                jrb0.b bVar = new jrb0.b();
                bVar.a = (String) map2.get("id");
                bVar.b = (Double) map2.get("width");
                bVar.c = (Double) map2.get("height");
                return bVar;
            case -126:
                Map map3 = (Map) e(byteBuffer);
                jrb0.c cVar = new jrb0.c();
                cVar.a = (String) map3.get("id");
                return cVar;
            case -125:
                Map map4 = (Map) e(byteBuffer);
                jrb0.d dVar = new jrb0.d();
                dVar.a = (byte[]) map4.get(Constants.KEY_DATA);
                dVar.b = (String) map4.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
                return dVar;
            case -124:
                Map map5 = (Map) e(byteBuffer);
                jrb0.e eVar = new jrb0.e();
                eVar.a = (String) map5.get(StateEntry.COLUMN_PATH);
                eVar.b = (String) map5.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
                return eVar;
            case -123:
                Map map6 = (Map) e(byteBuffer);
                jrb0.f fVar = new jrb0.f();
                fVar.a = (String) map6.get("id");
                Object obj2 = map6.get("pagesCount");
                if (obj2 != null) {
                    l = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
                }
                fVar.b = l;
                return fVar;
            case -122:
                Map map7 = (Map) e(byteBuffer);
                jrb0.g gVar = new jrb0.g();
                Object obj3 = map7.get("id");
                if (obj3 != null) {
                    l = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
                }
                gVar.a = l;
                return gVar;
            case -121:
                Map map8 = (Map) e(byteBuffer);
                jrb0.h hVar = new jrb0.h();
                hVar.a = (String) map8.get("pageId");
                Object obj4 = map8.get("width");
                if (obj4 == null) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
                }
                hVar.b = valueOf;
                Object obj5 = map8.get("height");
                if (obj5 == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(obj5 instanceof Integer ? ((Integer) obj5).intValue() : ((Long) obj5).longValue());
                }
                hVar.c = valueOf2;
                Object obj6 = map8.get("format");
                if (obj6 == null) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
                }
                hVar.d = valueOf3;
                hVar.e = (String) map8.get(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
                hVar.f = (Boolean) map8.get("crop");
                Object obj7 = map8.get("cropX");
                if (obj7 == null) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(obj7 instanceof Integer ? ((Integer) obj7).intValue() : ((Long) obj7).longValue());
                }
                hVar.g = valueOf4;
                Object obj8 = map8.get("cropY");
                if (obj8 == null) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
                }
                hVar.h = valueOf5;
                Object obj9 = map8.get("cropHeight");
                if (obj9 == null) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(obj9 instanceof Integer ? ((Integer) obj9).intValue() : ((Long) obj9).longValue());
                }
                hVar.i = valueOf6;
                Object obj10 = map8.get("cropWidth");
                if (obj10 == null) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(obj10 instanceof Integer ? ((Integer) obj10).intValue() : ((Long) obj10).longValue());
                }
                hVar.j = valueOf7;
                Object obj11 = map8.get("quality");
                if (obj11 != null) {
                    l = Long.valueOf(obj11 instanceof Integer ? ((Integer) obj11).intValue() : ((Long) obj11).longValue());
                }
                hVar.k = l;
                hVar.l = (Boolean) map8.get("forPrint");
                return hVar;
            case -120:
                Map map9 = (Map) e(byteBuffer);
                jrb0.i iVar = new jrb0.i();
                Object obj12 = map9.get("width");
                if (obj12 == null) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Long.valueOf(obj12 instanceof Integer ? ((Integer) obj12).intValue() : ((Long) obj12).longValue());
                }
                iVar.a = valueOf8;
                Object obj13 = map9.get("height");
                if (obj13 != null) {
                    l = Long.valueOf(obj13 instanceof Integer ? ((Integer) obj13).intValue() : ((Long) obj13).longValue());
                }
                iVar.b = l;
                iVar.c = (String) map9.get(StateEntry.COLUMN_PATH);
                iVar.d = (byte[]) map9.get(Constants.KEY_DATA);
                return iVar;
            case -119:
                Map map10 = (Map) e(byteBuffer);
                jrb0.j jVar = new jrb0.j();
                Object obj14 = map10.get("textureId");
                if (obj14 == null) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Long.valueOf(obj14 instanceof Integer ? ((Integer) obj14).intValue() : ((Long) obj14).longValue());
                }
                jVar.a = valueOf9;
                Object obj15 = map10.get("width");
                if (obj15 == null) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(obj15 instanceof Integer ? ((Integer) obj15).intValue() : ((Long) obj15).longValue());
                }
                jVar.b = valueOf10;
                Object obj16 = map10.get("height");
                if (obj16 != null) {
                    l = Long.valueOf(obj16 instanceof Integer ? ((Integer) obj16).intValue() : ((Long) obj16).longValue());
                }
                jVar.c = l;
                return jVar;
            case -118:
                Map map11 = (Map) e(byteBuffer);
                jrb0.k kVar = new jrb0.k();
                Object obj17 = map11.get("id");
                if (obj17 != null) {
                    l = Long.valueOf(obj17 instanceof Integer ? ((Integer) obj17).intValue() : ((Long) obj17).longValue());
                }
                kVar.a = l;
                return kVar;
            case -117:
                Map map12 = (Map) e(byteBuffer);
                jrb0.l lVar = new jrb0.l();
                lVar.a = (String) map12.get("documentId");
                Object obj18 = map12.get("pageNumber");
                if (obj18 == null) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Long.valueOf(obj18 instanceof Integer ? ((Integer) obj18).intValue() : ((Long) obj18).longValue());
                }
                lVar.b = valueOf11;
                lVar.c = (String) map12.get("pageId");
                Object obj19 = map12.get("textureId");
                if (obj19 == null) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Long.valueOf(obj19 instanceof Integer ? ((Integer) obj19).intValue() : ((Long) obj19).longValue());
                }
                lVar.d = valueOf12;
                Object obj20 = map12.get("width");
                if (obj20 == null) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(obj20 instanceof Integer ? ((Integer) obj20).intValue() : ((Long) obj20).longValue());
                }
                lVar.e = valueOf13;
                Object obj21 = map12.get("height");
                if (obj21 == null) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Long.valueOf(obj21 instanceof Integer ? ((Integer) obj21).intValue() : ((Long) obj21).longValue());
                }
                lVar.f = valueOf14;
                lVar.g = (String) map12.get(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
                Object obj22 = map12.get("sourceX");
                if (obj22 == null) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Long.valueOf(obj22 instanceof Integer ? ((Integer) obj22).intValue() : ((Long) obj22).longValue());
                }
                lVar.h = valueOf15;
                Object obj23 = map12.get("sourceY");
                if (obj23 == null) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Long.valueOf(obj23 instanceof Integer ? ((Integer) obj23).intValue() : ((Long) obj23).longValue());
                }
                lVar.i = valueOf16;
                Object obj24 = map12.get("destinationX");
                if (obj24 == null) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Long.valueOf(obj24 instanceof Integer ? ((Integer) obj24).intValue() : ((Long) obj24).longValue());
                }
                lVar.j = valueOf17;
                Object obj25 = map12.get("destinationY");
                if (obj25 == null) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Long.valueOf(obj25 instanceof Integer ? ((Integer) obj25).intValue() : ((Long) obj25).longValue());
                }
                lVar.k = valueOf18;
                lVar.l = (Double) map12.get("fullWidth");
                lVar.m = (Double) map12.get("fullHeight");
                Object obj26 = map12.get("textureWidth");
                if (obj26 == null) {
                    valueOf19 = null;
                } else {
                    valueOf19 = Long.valueOf(obj26 instanceof Integer ? ((Integer) obj26).intValue() : ((Long) obj26).longValue());
                }
                lVar.n = valueOf19;
                Object obj27 = map12.get("textureHeight");
                if (obj27 != null) {
                    l = Long.valueOf(obj27 instanceof Integer ? ((Integer) obj27).intValue() : ((Long) obj27).longValue());
                }
                lVar.o = l;
                lVar.p = (Boolean) map12.get("allowAntiAliasing");
                return lVar;
            default:
                return super.f(b, byteBuffer);
        }
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (obj instanceof jrb0.a) {
            cknVar.write(128);
            jrb0.a aVar = (jrb0.a) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", aVar.a);
            hashMap.put("pageNumber", aVar.b);
            hashMap.put("autoCloseAndroid", aVar.c);
            k(cknVar, hashMap);
            return;
        }
        if (obj instanceof jrb0.b) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            jrb0.b bVar = (jrb0.b) obj;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("id", bVar.a);
            hashMap2.put("width", bVar.b);
            hashMap2.put("height", bVar.c);
            k(cknVar, hashMap2);
            return;
        }
        if (obj instanceof jrb0.c) {
            cknVar.write(130);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("id", ((jrb0.c) obj).a);
            k(cknVar, hashMap3);
            return;
        }
        if (obj instanceof jrb0.d) {
            cknVar.write(HProv.PP_FAST_CODE);
            jrb0.d dVar = (jrb0.d) obj;
            HashMap hashMap4 = new HashMap();
            hashMap4.put(Constants.KEY_DATA, dVar.a);
            hashMap4.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, dVar.b);
            k(cknVar, hashMap4);
            return;
        }
        if (obj instanceof jrb0.e) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION);
            jrb0.e eVar = (jrb0.e) obj;
            HashMap hashMap5 = new HashMap();
            hashMap5.put(StateEntry.COLUMN_PATH, eVar.a);
            hashMap5.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, eVar.b);
            k(cknVar, hashMap5);
            return;
        }
        if (obj instanceof jrb0.f) {
            cknVar.write(HProv.PP_ENUM_CONTAINER_EXTENSION);
            jrb0.f fVar = (jrb0.f) obj;
            HashMap hashMap6 = new HashMap();
            hashMap6.put("id", fVar.a);
            hashMap6.put("pagesCount", fVar.b);
            k(cknVar, hashMap6);
            return;
        }
        if (obj instanceof jrb0.g) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION_DEL);
            HashMap hashMap7 = new HashMap();
            hashMap7.put("id", ((jrb0.g) obj).a);
            k(cknVar, hashMap7);
            return;
        }
        if (obj instanceof jrb0.h) {
            cknVar.write(HProv.PP_CONTAINER_DEFAULT);
            jrb0.h hVar = (jrb0.h) obj;
            HashMap hashMap8 = new HashMap();
            hashMap8.put("pageId", hVar.a);
            hashMap8.put("width", hVar.b);
            hashMap8.put("height", hVar.c);
            hashMap8.put("format", hVar.d);
            hashMap8.put(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, hVar.e);
            hashMap8.put("crop", hVar.f);
            hashMap8.put("cropX", hVar.g);
            hashMap8.put("cropY", hVar.h);
            hashMap8.put("cropHeight", hVar.i);
            hashMap8.put("cropWidth", hVar.j);
            hashMap8.put("quality", hVar.k);
            hashMap8.put("forPrint", hVar.l);
            k(cknVar, hashMap8);
            return;
        }
        if (obj instanceof jrb0.i) {
            cknVar.write(HProv.PP_LCD_QUERY);
            jrb0.i iVar = (jrb0.i) obj;
            HashMap hashMap9 = new HashMap();
            hashMap9.put("width", iVar.a);
            hashMap9.put("height", iVar.b);
            hashMap9.put(StateEntry.COLUMN_PATH, iVar.c);
            hashMap9.put(Constants.KEY_DATA, iVar.d);
            k(cknVar, hashMap9);
            return;
        }
        if (obj instanceof jrb0.j) {
            cknVar.write(HProv.PP_ENUM_LOG);
            jrb0.j jVar = (jrb0.j) obj;
            HashMap hashMap10 = new HashMap();
            hashMap10.put("textureId", jVar.a);
            hashMap10.put("width", jVar.b);
            hashMap10.put("height", jVar.c);
            k(cknVar, hashMap10);
            return;
        }
        if (obj instanceof jrb0.k) {
            cknVar.write(HProv.PP_VERSION_EX);
            HashMap hashMap11 = new HashMap();
            hashMap11.put("id", ((jrb0.k) obj).a);
            k(cknVar, hashMap11);
            return;
        }
        if (!(obj instanceof jrb0.l)) {
            super.k(cknVar, obj);
            return;
        }
        cknVar.write(139);
        jrb0.l lVar = (jrb0.l) obj;
        HashMap hashMap12 = new HashMap();
        hashMap12.put("documentId", lVar.a);
        hashMap12.put("pageNumber", lVar.b);
        hashMap12.put("pageId", lVar.c);
        hashMap12.put("textureId", lVar.d);
        hashMap12.put("width", lVar.e);
        hashMap12.put("height", lVar.f);
        hashMap12.put(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, lVar.g);
        hashMap12.put("sourceX", lVar.h);
        hashMap12.put("sourceY", lVar.i);
        hashMap12.put("destinationX", lVar.j);
        hashMap12.put("destinationY", lVar.k);
        hashMap12.put("fullWidth", lVar.l);
        hashMap12.put("fullHeight", lVar.m);
        hashMap12.put("textureWidth", lVar.n);
        hashMap12.put("textureHeight", lVar.o);
        hashMap12.put("allowAntiAliasing", lVar.p);
        k(cknVar, hashMap12);
    }
}
