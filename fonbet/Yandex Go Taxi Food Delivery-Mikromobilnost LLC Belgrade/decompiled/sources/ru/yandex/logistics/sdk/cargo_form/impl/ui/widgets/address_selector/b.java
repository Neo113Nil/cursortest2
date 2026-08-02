package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.an91;
import defpackage.b0k0;
import defpackage.c0k0;
import defpackage.c71;
import defpackage.d71;
import defpackage.dty0;
import defpackage.fws0;
import defpackage.haq0;
import defpackage.hts0;
import defpackage.hty0;
import defpackage.ita1;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.l690;
import defpackage.lts0;
import defpackage.mum;
import defpackage.ny61;
import defpackage.o690;
import defpackage.oo0;
import defpackage.p5s;
import defpackage.q5s;
import defpackage.q8s;
import defpackage.qv0;
import defpackage.ryh;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.x2s;
import defpackage.x61;
import defpackage.yzj0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.AddressPositionModel;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;
    public final ryh c;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, ryh ryhVar) {
        this.a = q8sVar;
        this.b = aVar;
        this.c = ryhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x02c7, code lost:
    
        if (r7 != null) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71 c71Var, j6s j6sVar, Boolean bool, ContinuationImpl continuationImpl) {
        AddressSelectorMapper$map$1 addressSelectorMapper$map$1;
        int i;
        d71 d71Var;
        String str;
        int i2;
        boolean z;
        Object a;
        j6s j6sVar2;
        dty0 dty0Var;
        d71 d71Var2;
        oo0 oo0Var;
        fws0 fws0Var;
        hts0 hts0Var;
        boolean z2;
        CharSequence charSequence;
        jvs0 jvs0Var;
        c71 c71Var2;
        CharSequence charSequence2;
        d71 d71Var3;
        int i3;
        lts0 lts0Var;
        hts0 hts0Var2;
        hts0 s;
        o690 o690Var;
        l690 b;
        c71 c71Var3 = c71Var;
        if (continuationImpl instanceof AddressSelectorMapper$map$1) {
            addressSelectorMapper$map$1 = (AddressSelectorMapper$map$1) continuationImpl;
            int i4 = addressSelectorMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                addressSelectorMapper$map$1.label = i4 - Integer.MIN_VALUE;
                AddressSelectorMapper$map$1 addressSelectorMapper$map$12 = addressSelectorMapper$map$1;
                Object obj = addressSelectorMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressSelectorMapper$map$12.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c0k0 c0k0Var = c71Var3.b;
                    ryh ryhVar = this.c;
                    ryhVar.getClass();
                    Map map = c71Var3.m;
                    String str2 = c71Var3.k;
                    if (c0k0Var instanceof yzj0) {
                        yzj0 yzj0Var = (yzj0) c0k0Var;
                        int i5 = yzj0Var.a;
                        qv0 q = ryh.q(yzj0Var, j6sVar);
                        if (q != null && (oo0Var = q.a) != null) {
                            String str3 = oo0Var.a;
                            if (str3 == null) {
                                str3 = "";
                            }
                            q5s q5sVar = i5 == 0 ? vvb1.D : p5s.a;
                            LinkedHashMap l = kotlin.collections.b.l(new Pair(q5sVar.k(), Boolean.valueOf(q.g != null)));
                            l.put(q5sVar.a(), ita1.e(q));
                            if (bool != null) {
                                l.put("is_loading", bool);
                            }
                            if (q5sVar instanceof p5s) {
                                l.put("point_b_index", Integer.valueOf(i5));
                            }
                            MapBuilder mapBuilder = new MapBuilder();
                            mapBuilder.putAll(l);
                            if (map != null) {
                                mapBuilder.putAll(map);
                            }
                            d71Var = new d71(str3, new x2s(str2, mapBuilder.j()));
                            str = d71Var == null ? d71Var.a : null;
                            i2 = c71Var3.c != AddressPositionModel.SUBTITLE ? 1 : 0;
                            hty0 hty0Var = c71Var3.f;
                            dty0 v = hty0Var == null ? aVar.v(hty0Var) : null;
                            FormattedText formattedText = d71Var == null ? c71Var3.d : c71Var3.e;
                            addressSelectorMapper$map$12.L$0 = c71Var3;
                            addressSelectorMapper$map$12.L$1 = j6sVar;
                            addressSelectorMapper$map$12.L$2 = null;
                            addressSelectorMapper$map$12.L$3 = d71Var;
                            addressSelectorMapper$map$12.L$4 = str;
                            addressSelectorMapper$map$12.L$5 = v;
                            addressSelectorMapper$map$12.I$0 = i2;
                            z = true;
                            addressSelectorMapper$map$12.label = 1;
                            a = this.a.a(formattedText, addressSelectorMapper$map$12);
                            if (a != coroutineSingletons) {
                                j6sVar2 = j6sVar;
                                dty0Var = v;
                                obj = a;
                                d71Var2 = d71Var;
                            }
                            return coroutineSingletons;
                        }
                        d71Var = null;
                        if (d71Var == null) {
                        }
                        if (c71Var3.c != AddressPositionModel.SUBTITLE) {
                        }
                        hty0 hty0Var2 = c71Var3.f;
                        if (hty0Var2 == null) {
                        }
                        if (d71Var == null) {
                        }
                        addressSelectorMapper$map$12.L$0 = c71Var3;
                        addressSelectorMapper$map$12.L$1 = j6sVar;
                        addressSelectorMapper$map$12.L$2 = null;
                        addressSelectorMapper$map$12.L$3 = d71Var;
                        addressSelectorMapper$map$12.L$4 = str;
                        addressSelectorMapper$map$12.L$5 = v;
                        addressSelectorMapper$map$12.I$0 = i2;
                        z = true;
                        addressSelectorMapper$map$12.label = 1;
                        a = this.a.a(formattedText, addressSelectorMapper$map$12);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (!(c0k0Var instanceof b0k0)) {
                        w511.b();
                        return null;
                    }
                    FormStateRoutePointDto h = ((mum) ryhVar.b).h(j6sVar, ((b0k0) c0k0Var).a());
                    if (h != null) {
                        String shortText = h.getShortText();
                        LinkedHashMap l2 = kotlin.collections.b.l(new Pair("sender_info_filled", Boolean.valueOf(h.getContact() != null)));
                        Pair pair = new Pair("lat", h.getCoordinates().get(1));
                        Pair pair2 = new Pair("lon", h.getCoordinates().get(0));
                        Pair pair3 = new Pair(LaunchBrowserActivity.KEY_URI, String.valueOf(h.getUri()));
                        Pair pair4 = new Pair("full_name", h.getFullText());
                        String entrance = h.getEntrance();
                        if (entrance == null) {
                            entrance = "";
                        }
                        Pair pair5 = new Pair("porch", entrance);
                        String floor = h.getFloor();
                        if (floor == null) {
                            floor = "";
                        }
                        Pair pair6 = new Pair("floor", floor);
                        String code = h.getCode();
                        if (code == null) {
                            code = "";
                        }
                        Pair pair7 = new Pair("door_phone", code);
                        String room = h.getRoom();
                        if (room == null) {
                            room = "";
                        }
                        Pair pair8 = new Pair("apartment", room);
                        String comment = h.getComment();
                        if (comment == null) {
                            comment = "";
                        }
                        Pair pair9 = new Pair("comment", comment);
                        List<RoutePointCommentImageDto> commentImages = h.getCommentImages();
                        l2.put("sender_address", kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("photocomments_count", Integer.valueOf(commentImages != null ? commentImages.size() : 0))));
                        if (bool != null) {
                            l2.put("is_loading", bool);
                        }
                        MapBuilder mapBuilder2 = new MapBuilder();
                        mapBuilder2.putAll(l2);
                        if (map != null) {
                            mapBuilder2.putAll(map);
                        }
                        d71Var = new d71(shortText, new x2s(str2, mapBuilder2.j()));
                        if (d71Var == null) {
                        }
                        if (c71Var3.c != AddressPositionModel.SUBTITLE) {
                        }
                        hty0 hty0Var22 = c71Var3.f;
                        if (hty0Var22 == null) {
                        }
                        if (d71Var == null) {
                        }
                        addressSelectorMapper$map$12.L$0 = c71Var3;
                        addressSelectorMapper$map$12.L$1 = j6sVar;
                        addressSelectorMapper$map$12.L$2 = null;
                        addressSelectorMapper$map$12.L$3 = d71Var;
                        addressSelectorMapper$map$12.L$4 = str;
                        addressSelectorMapper$map$12.L$5 = v;
                        addressSelectorMapper$map$12.I$0 = i2;
                        z = true;
                        addressSelectorMapper$map$12.label = 1;
                        a = this.a.a(formattedText, addressSelectorMapper$map$12);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    d71Var = null;
                    if (d71Var == null) {
                    }
                    if (c71Var3.c != AddressPositionModel.SUBTITLE) {
                    }
                    hty0 hty0Var222 = c71Var3.f;
                    if (hty0Var222 == null) {
                    }
                    if (d71Var == null) {
                    }
                    addressSelectorMapper$map$12.L$0 = c71Var3;
                    addressSelectorMapper$map$12.L$1 = j6sVar;
                    addressSelectorMapper$map$12.L$2 = null;
                    addressSelectorMapper$map$12.L$3 = d71Var;
                    addressSelectorMapper$map$12.L$4 = str;
                    addressSelectorMapper$map$12.L$5 = v;
                    addressSelectorMapper$map$12.I$0 = i2;
                    z = true;
                    addressSelectorMapper$map$12.label = 1;
                    a = this.a.a(formattedText, addressSelectorMapper$map$12);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = addressSelectorMapper$map$12.I$0;
                    charSequence2 = (CharSequence) addressSelectorMapper$map$12.L$6;
                    dty0Var = (dty0) addressSelectorMapper$map$12.L$5;
                    str = (String) addressSelectorMapper$map$12.L$4;
                    d71Var3 = (d71) addressSelectorMapper$map$12.L$3;
                    c71Var2 = (c71) addressSelectorMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    hts0Var = null;
                    z = true;
                    z2 = false;
                    i2 = i3;
                    charSequence = charSequence2;
                    d71Var2 = d71Var3;
                    c71Var3 = c71Var2;
                    jvs0Var = (jvs0) obj;
                    dty0 dty0Var2 = dty0Var;
                    String str4 = str;
                    if (d71Var2 != null) {
                        lts0 lts0Var2 = c71Var3.g;
                        s = lts0Var2 != null ? aVar.s(lts0Var2) : hts0Var;
                    }
                    lts0Var = c71Var3.h;
                    if (lts0Var == null) {
                        hts0Var2 = hts0Var;
                        if (d71Var2 == null) {
                        }
                        haq0 haq0Var = new haq0(c71Var3.j, c71Var3.l, c71Var3.b, d71Var2 == null ? d71Var2.b : hts0Var);
                        o690Var = c71Var3.n;
                        if (o690Var == null) {
                        }
                        return new x61(str4, charSequence, i2 == 0 ? z : z2, dty0Var2, hts0Var2, jvs0Var, r27, haq0Var, b, c71Var3.a);
                    }
                    s = aVar.s(lts0Var);
                    hts0Var2 = s;
                    x2s x2sVar = d71Var2 == null ? d71Var2.b : hts0Var;
                    haq0 haq0Var2 = new haq0(c71Var3.j, c71Var3.l, c71Var3.b, d71Var2 == null ? d71Var2.b : hts0Var);
                    o690Var = c71Var3.n;
                    if (o690Var == null) {
                        aVar.getClass();
                        b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                    } else {
                        b = an91.b(8.0f, 0.0f, 2);
                    }
                    return new x61(str4, charSequence, i2 == 0 ? z : z2, dty0Var2, hts0Var2, jvs0Var, x2sVar, haq0Var2, b, c71Var3.a);
                }
                int i6 = addressSelectorMapper$map$12.I$0;
                dty0Var = (dty0) addressSelectorMapper$map$12.L$5;
                str = (String) addressSelectorMapper$map$12.L$4;
                d71 d71Var4 = (d71) addressSelectorMapper$map$12.L$3;
                j6sVar2 = (j6s) addressSelectorMapper$map$12.L$1;
                c71 c71Var4 = (c71) addressSelectorMapper$map$12.L$0;
                kotlin.b.b(obj);
                d71Var2 = d71Var4;
                z = true;
                i2 = i6;
                c71Var3 = c71Var4;
                CharSequence charSequence3 = (CharSequence) obj;
                fws0Var = c71Var3.i;
                if (fws0Var == null) {
                    addressSelectorMapper$map$12.L$0 = c71Var3;
                    addressSelectorMapper$map$12.L$1 = null;
                    addressSelectorMapper$map$12.L$2 = null;
                    addressSelectorMapper$map$12.L$3 = d71Var2;
                    addressSelectorMapper$map$12.L$4 = str;
                    addressSelectorMapper$map$12.L$5 = dty0Var;
                    addressSelectorMapper$map$12.L$6 = charSequence3;
                    addressSelectorMapper$map$12.L$7 = null;
                    addressSelectorMapper$map$12.I$0 = i2;
                    addressSelectorMapper$map$12.I$1 = 0;
                    addressSelectorMapper$map$12.label = 2;
                    z2 = false;
                    hts0Var = null;
                    Object u = this.b.u(fws0Var, j6sVar2, false, true, addressSelectorMapper$map$12);
                    if (u != coroutineSingletons) {
                        c71Var2 = c71Var3;
                        charSequence2 = charSequence3;
                        d71Var3 = d71Var2;
                        obj = u;
                        i3 = i2;
                        i2 = i3;
                        charSequence = charSequence2;
                        d71Var2 = d71Var3;
                        c71Var3 = c71Var2;
                        jvs0Var = (jvs0) obj;
                        dty0 dty0Var22 = dty0Var;
                        String str42 = str;
                        if (d71Var2 != null) {
                        }
                        lts0Var = c71Var3.h;
                        if (lts0Var == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                hts0Var = null;
                z2 = false;
                charSequence = charSequence3;
                jvs0Var = null;
                dty0 dty0Var222 = dty0Var;
                String str422 = str;
                if (d71Var2 != null) {
                }
                lts0Var = c71Var3.h;
                if (lts0Var == null) {
                }
            }
        }
        addressSelectorMapper$map$1 = new AddressSelectorMapper$map$1(this, continuationImpl);
        AddressSelectorMapper$map$1 addressSelectorMapper$map$122 = addressSelectorMapper$map$1;
        Object obj2 = addressSelectorMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressSelectorMapper$map$122.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        fws0Var = c71Var3.i;
        if (fws0Var == null) {
        }
    }
}
