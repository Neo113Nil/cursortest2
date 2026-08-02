package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.bdui.trigger.network.TriggerApi;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerActionRequestDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerEntitiesDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerEntityDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerListsDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerMetaDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerPollingRequestDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerShownRequestDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class ik5 {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public ik5(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
    }

    public static xyo e(xyo xyoVar, String str) {
        if (xyoVar instanceof wyo) {
            Object obj = (List) ((Map) ((wyo) xyoVar).a).get(str);
            if (obj == null) {
                obj = c5b.a;
            }
            return new wyo(obj);
        }
        if (xyoVar instanceof vyo) {
            return ivf.K((vyo) xyoVar);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Call call, cg6 cg6Var) {
        bk5 bk5Var;
        int i;
        ik5 ik5Var;
        bii biiVar;
        ik5 ik5Var2;
        String str;
        Object J;
        LinkedHashMap linkedHashMap;
        ik5 ik5Var3;
        String str2;
        jyr jyrVar;
        Iterator it;
        String str3;
        int i2;
        boolean z;
        String str4;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        ik5 ik5Var4;
        String str5;
        jyr jyrVar2;
        String str6;
        Iterator it2;
        LinkedHashMap linkedHashMap3;
        TriggerEntitiesDto triggerEntitiesDto;
        String str7;
        Iterator it3;
        int i3;
        boolean z2;
        Object obj;
        Object obj2;
        qh5 qh5Var;
        rv8 rv8Var;
        JsonElement v;
        JsonObject G;
        String i4;
        JsonObject G2;
        String i5;
        ch5 ch5Var;
        String I;
        String str8;
        JsonElement v2;
        String I2;
        String str9;
        JsonElement v3;
        String I3;
        String str10;
        zg5 zg5Var;
        ah5 ah5Var;
        JsonObject G3;
        String I4;
        String str11;
        JsonObject G4;
        String I5;
        String str12;
        JsonElement v4;
        String I6;
        String str13;
        JsonObject G5;
        JsonObject G6;
        String I7;
        String str14;
        oh5 oh5Var;
        Boolean E;
        Boolean E2;
        String I8;
        String str15;
        JsonElement v5;
        String I9;
        String str16;
        JsonElement v6;
        Boolean E3;
        String I10;
        String str17;
        JsonElement v7;
        JsonObject G7;
        nh5 e;
        JsonElement v8;
        String I11;
        String str18;
        JsonElement v9;
        String I12;
        String str19;
        String I13;
        String str20;
        String I14;
        String str21;
        JsonElement v10;
        String I15;
        String str22;
        String I16;
        String I17;
        String I18;
        String I19;
        String I20;
        String I21;
        String I22;
        JsonObject G8;
        String I23;
        String I24;
        String I25;
        Object obj3;
        uh5 uh5Var;
        String I26;
        String str23;
        rh5 rh5Var;
        sh5 sh5Var;
        JsonObject G9;
        Long l;
        String I27;
        String I28;
        JsonObject G10;
        String I29;
        String str24;
        JsonElement v11;
        String I30;
        String str25;
        String I31;
        String I32;
        jh5 jh5Var;
        fh5 fh5Var;
        JsonObject G11;
        String I33;
        JsonObject G12;
        JsonObject G13;
        JsonObject G14;
        hh5 d;
        JsonElement v12;
        JsonObject G15;
        eh5 b;
        String str26;
        String str27;
        ih5 ih5Var;
        JsonObject G16;
        String I34;
        JsonElement v13;
        JsonObject G17;
        gh5 c;
        ik5 ik5Var5 = this;
        if (cg6Var instanceof bk5) {
            bk5Var = (bk5) cg6Var;
            int i6 = bk5Var.m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bk5Var.m = i6 - Integer.MIN_VALUE;
                Object obj4 = bk5Var.k;
                nm6 nm6Var = nm6.a;
                i = bk5Var.m;
                boolean z3 = true;
                if (i != 0) {
                    qgg.h0(obj4);
                    bk5Var.j = ik5Var5;
                    bk5Var.m = 1;
                    obj4 = swf.N(call, bk5Var);
                    if (obj4 == nm6Var) {
                        return nm6Var;
                    }
                    ik5Var = ik5Var5;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ik5Var = bk5Var.j;
                    qgg.h0(obj4);
                }
                biiVar = (bii) obj4;
                String str28 = "";
                if (biiVar instanceof aii) {
                    ik5Var2 = ik5Var;
                    str = "";
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i7 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str29 = name == null ? str : name;
                        String message = musicBackendInvocationError.getMessage();
                        J = new kj6(i7, musicBackendInvocationError.getDetails(), str29, message == null ? str : message, xhiVar.a);
                    } else if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            b6e.s();
                            return null;
                        }
                        J = uwf.J((zhi) biiVar);
                    }
                } else {
                    TriggerListsDto triggerListsDto = (TriggerListsDto) ((aii) biiVar).a;
                    List triggers = triggerListsDto.getTriggers();
                    jyr jyrVar3 = ik5Var5.c;
                    String str30 = "CommunicationTriggerRepositoryImpl";
                    if (triggers == null) {
                        Assertions.throwOrSkip("CommunicationTriggerRepositoryImpl", new FailedAssertionException("failed to parse triggers cause of nullable parameter. dto = " + triggerListsDto));
                        qi5.a((qi5) jyrVar3.getValue(), "empty_response", null, null, 14);
                        ik5Var2 = ik5Var;
                        str = "";
                        linkedHashMap = null;
                    } else {
                        ArrayList O = CollectionsKt.O(triggerListsDto.getTriggers());
                        int i8 = 10;
                        int a = tah.a(v75.o(O, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(a);
                        Iterator it4 = O.iterator();
                        while (it4.hasNext()) {
                            TriggerEntitiesDto triggerEntitiesDto2 = (TriggerEntitiesDto) it4.next();
                            String anchorId = triggerEntitiesDto2.getAnchorId();
                            if (triggerEntitiesDto2.getAnchorId() == null || triggerEntitiesDto2.getTriggers() == null) {
                                ik5Var3 = ik5Var;
                                str2 = str28;
                                jyrVar = jyrVar3;
                                it = it4;
                                LinkedHashMap linkedHashMap5 = linkedHashMap4;
                                str3 = anchorId;
                                i2 = i8;
                                z = z3;
                                str4 = str30;
                                Assertions.throwOrSkip(str4, new FailedAssertionException("failed to parse triggers cause of nullable parameter. dto = " + triggerEntitiesDto2));
                                qi5.a((qi5) jyrVar.getValue(), "null_fields", triggerEntitiesDto2.getAnchorId(), null, 12);
                                linkedHashMap2 = linkedHashMap5;
                                arrayList = null;
                            } else {
                                ArrayList O2 = CollectionsKt.O(triggerEntitiesDto2.getTriggers());
                                arrayList = new ArrayList();
                                Iterator it5 = O2.iterator();
                                while (it5.hasNext()) {
                                    TriggerEntityDto triggerEntityDto = (TriggerEntityDto) it5.next();
                                    sj5 sj5Var = (sj5) ik5Var5.b.getValue();
                                    sj5Var.getClass();
                                    triggerEntityDto.getClass();
                                    if (triggerEntityDto.getScreenId() == null || triggerEntityDto.getFeedbackToken() == null || triggerEntityDto.getData() == null || triggerEntityDto.getMeta() == null) {
                                        ik5Var4 = ik5Var;
                                        str5 = str28;
                                        jyrVar2 = jyrVar3;
                                        str6 = str30;
                                        it2 = it4;
                                        linkedHashMap3 = linkedHashMap4;
                                        triggerEntitiesDto = triggerEntitiesDto2;
                                        str7 = anchorId;
                                        it3 = it5;
                                        i3 = 10;
                                        z2 = true;
                                        dfi.r("failed to parse trigger cause of nullable parameter. dto = " + triggerEntityDto, "CommunicationTriggerNetworkMapper");
                                    } else {
                                        TriggerMetaDto meta = triggerEntityDto.getMeta();
                                        fs7 fs7Var = wh5.b;
                                        String uiType = meta.getUiType();
                                        fs7Var.getClass();
                                        Iterator it6 = wh5.j.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj2 = it6.next();
                                                if (((wh5) obj2).a.equals(uiType)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        wh5 wh5Var = (wh5) obj2;
                                        if (wh5Var == null) {
                                            str5 = str28;
                                            jyrVar2 = jyrVar3;
                                            qh5Var = null;
                                        } else {
                                            Boolean hasTabDot = meta.getHasTabDot();
                                            str5 = str28;
                                            boolean booleanValue = hasTabDot != null ? hasTabDot.booleanValue() : false;
                                            jyrVar2 = jyrVar3;
                                            qh5Var = new qh5(wh5Var, booleanValue, null, null);
                                        }
                                        if (qh5Var == null) {
                                            dfi.r("failed to parse trigger meta. dto = " + triggerEntityDto, "CommunicationTriggerNetworkMapper");
                                            ik5Var4 = ik5Var;
                                            str6 = str30;
                                            it2 = it4;
                                            linkedHashMap3 = linkedHashMap4;
                                            triggerEntitiesDto = triggerEntitiesDto2;
                                            str7 = anchorId;
                                            it3 = it5;
                                        } else {
                                            it2 = it4;
                                            it3 = it5;
                                            ik5Var4 = ik5Var;
                                            linkedHashMap3 = linkedHashMap4;
                                            switch (qh5Var.a.ordinal()) {
                                                case 0:
                                                case 1:
                                                    str6 = str30;
                                                    triggerEntitiesDto = triggerEntitiesDto2;
                                                    str7 = anchorId;
                                                    i3 = 10;
                                                    String screenId = triggerEntityDto.getScreenId();
                                                    String feedbackToken = triggerEntityDto.getFeedbackToken();
                                                    JsonObject data = triggerEntityDto.getData();
                                                    Gson gson = sj5Var.a;
                                                    z2 = true;
                                                    qc9 qc9Var = new qc9(new gy2(1));
                                                    try {
                                                        JsonElement v14 = data.v("templates");
                                                        if (v14 != null && (G2 = cxb.G(v14)) != null && (i5 = gson.i(G2)) != null) {
                                                            qc9Var.e(new JSONObject(i5));
                                                        }
                                                        v = data.v("card");
                                                    } catch (JsonIOException e2) {
                                                        Assertions.throwOrSkip("CommunicationTriggerNetworkMapper", new FailedAssertionException("failed to parse div data", e2));
                                                    } catch (JsonSyntaxException e3) {
                                                        Assertions.throwOrSkip("CommunicationTriggerNetworkMapper", new FailedAssertionException("failed to parse div data", e3));
                                                    } catch (JSONException e4) {
                                                        Assertions.throwOrSkip("CommunicationTriggerNetworkMapper", new FailedAssertionException("failed to parse div data", e4));
                                                    } catch (z7k e5) {
                                                        Assertions.throwOrSkip("CommunicationTriggerNetworkMapper", new FailedAssertionException("failed to parse div data", e5));
                                                    }
                                                    if (v != null && (G = cxb.G(v)) != null && (i4 = gson.i(G)) != null) {
                                                        JSONObject jSONObject = new JSONObject(i4);
                                                        int i9 = rv8.i;
                                                        rv8Var = fgq.y(qc9Var, jSONObject);
                                                        if (rv8Var != null) {
                                                            obj = new mh5(screenId, feedbackToken, qh5Var, rv8Var);
                                                            if (obj == null) {
                                                                qi5.a((qi5) jyrVar2.getValue(), "mapper_null", triggerEntitiesDto.getAnchorId(), triggerEntityDto.getScreenId(), 8);
                                                            }
                                                            if (obj != null) {
                                                                arrayList.add(obj);
                                                            }
                                                            ik5Var5 = this;
                                                            i8 = i3;
                                                            z3 = z2;
                                                            jyrVar3 = jyrVar2;
                                                            str28 = str5;
                                                            it4 = it2;
                                                            it5 = it3;
                                                            ik5Var = ik5Var4;
                                                            linkedHashMap4 = linkedHashMap3;
                                                            anchorId = str7;
                                                            str30 = str6;
                                                            triggerEntitiesDto2 = triggerEntitiesDto;
                                                        }
                                                    }
                                                    rv8Var = null;
                                                    if (rv8Var != null) {
                                                    }
                                                    break;
                                                case 2:
                                                    str6 = str30;
                                                    triggerEntitiesDto = triggerEntitiesDto2;
                                                    str7 = anchorId;
                                                    i3 = 10;
                                                    String screenId2 = triggerEntityDto.getScreenId();
                                                    String feedbackToken2 = triggerEntityDto.getFeedbackToken();
                                                    JsonObject data2 = triggerEntityDto.getData();
                                                    JsonElement v15 = data2.v("title");
                                                    if (v15 == null || (I = cxb.I(v15)) == null || (str8 = (String) avf.R(I)) == null || (v2 = data2.v("subtitle")) == null || (I2 = cxb.I(v2)) == null || (str9 = (String) avf.R(I2)) == null || (v3 = data2.v("imageUrl")) == null || (I3 = cxb.I(v3)) == null || (str10 = (String) avf.R(I3)) == null) {
                                                        ch5Var = null;
                                                    } else {
                                                        JsonElement v16 = data2.v("lightTheme");
                                                        bh5 a2 = (v16 == null || (G6 = cxb.G(v16)) == null) ? null : sj5.a(G6);
                                                        JsonElement v17 = data2.v("darkTheme");
                                                        bh5 a3 = (v17 == null || (G5 = cxb.G(v17)) == null) ? null : sj5.a(G5);
                                                        JsonElement v18 = data2.v(Constants.KEY_ACTION);
                                                        if (v18 == null || (G4 = cxb.G(v18)) == null) {
                                                            zg5Var = null;
                                                        } else {
                                                            JsonElement v19 = G4.v(ConnectableDevice.KEY_ID);
                                                            zg5Var = (v19 == null || (I5 = cxb.I(v19)) == null || (str12 = (String) avf.R(I5)) == null || (v4 = G4.v("uri")) == null || (I6 = cxb.I(v4)) == null || (str13 = (String) avf.R(I6)) == null) ? null : new zg5(str13, str12);
                                                        }
                                                        JsonElement v20 = data2.v("adv");
                                                        if (v20 == null || (G3 = cxb.G(v20)) == null) {
                                                            ah5Var = null;
                                                        } else {
                                                            JsonElement v21 = G3.v("text");
                                                            ah5Var = (v21 == null || (I4 = cxb.I(v21)) == null || (str11 = (String) avf.R(I4)) == null) ? null : new ah5(str11);
                                                        }
                                                        ch5Var = new ch5(str8, str9, str10, a2, a3, zg5Var, ah5Var);
                                                    }
                                                    if (ch5Var != null) {
                                                        obj = new dh5(screenId2, feedbackToken2, qh5Var, ch5Var);
                                                        z2 = true;
                                                        if (obj == null) {
                                                        }
                                                        if (obj != null) {
                                                        }
                                                        ik5Var5 = this;
                                                        i8 = i3;
                                                        z3 = z2;
                                                        jyrVar3 = jyrVar2;
                                                        str28 = str5;
                                                        it4 = it2;
                                                        it5 = it3;
                                                        ik5Var = ik5Var4;
                                                        linkedHashMap4 = linkedHashMap3;
                                                        anchorId = str7;
                                                        str30 = str6;
                                                        triggerEntitiesDto2 = triggerEntitiesDto;
                                                    }
                                                    obj = null;
                                                    z2 = true;
                                                    if (obj == null) {
                                                    }
                                                    if (obj != null) {
                                                    }
                                                    ik5Var5 = this;
                                                    i8 = i3;
                                                    z3 = z2;
                                                    jyrVar3 = jyrVar2;
                                                    str28 = str5;
                                                    it4 = it2;
                                                    it5 = it3;
                                                    ik5Var = ik5Var4;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    anchorId = str7;
                                                    str30 = str6;
                                                    triggerEntitiesDto2 = triggerEntitiesDto;
                                                    break;
                                                case 3:
                                                    str6 = str30;
                                                    triggerEntitiesDto = triggerEntitiesDto2;
                                                    str7 = anchorId;
                                                    i3 = 10;
                                                    String screenId3 = triggerEntityDto.getScreenId();
                                                    String feedbackToken3 = triggerEntityDto.getFeedbackToken();
                                                    JsonElement v22 = triggerEntityDto.getData().v("deeplink");
                                                    if (v22 != null && (I7 = cxb.I(v22)) != null && (str14 = (String) avf.R(I7)) != null) {
                                                        obj = new lh5(screenId3, feedbackToken3, qh5Var, str14);
                                                        z2 = true;
                                                        if (obj == null) {
                                                        }
                                                        if (obj != null) {
                                                        }
                                                        ik5Var5 = this;
                                                        i8 = i3;
                                                        z3 = z2;
                                                        jyrVar3 = jyrVar2;
                                                        str28 = str5;
                                                        it4 = it2;
                                                        it5 = it3;
                                                        ik5Var = ik5Var4;
                                                        linkedHashMap4 = linkedHashMap3;
                                                        anchorId = str7;
                                                        str30 = str6;
                                                        triggerEntitiesDto2 = triggerEntitiesDto;
                                                    }
                                                    obj = null;
                                                    z2 = true;
                                                    if (obj == null) {
                                                    }
                                                    if (obj != null) {
                                                    }
                                                    ik5Var5 = this;
                                                    i8 = i3;
                                                    z3 = z2;
                                                    jyrVar3 = jyrVar2;
                                                    str28 = str5;
                                                    it4 = it2;
                                                    it5 = it3;
                                                    ik5Var = ik5Var4;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    anchorId = str7;
                                                    str30 = str6;
                                                    triggerEntitiesDto2 = triggerEntitiesDto;
                                                    break;
                                                case 4:
                                                    str6 = str30;
                                                    triggerEntitiesDto = triggerEntitiesDto2;
                                                    str7 = anchorId;
                                                    i3 = 10;
                                                    String screenId4 = triggerEntityDto.getScreenId();
                                                    String feedbackToken4 = triggerEntityDto.getFeedbackToken();
                                                    JsonObject data3 = triggerEntityDto.getData();
                                                    JsonElement v23 = data3.v("can_be_opened");
                                                    if (v23 != null && (E = cxb.E(v23)) != null) {
                                                        boolean booleanValue2 = E.booleanValue();
                                                        JsonElement v24 = data3.v("is_center_align");
                                                        if (v24 != null && (E2 = cxb.E(v24)) != null) {
                                                            boolean booleanValue3 = E2.booleanValue();
                                                            JsonElement v25 = data3.v("header_text");
                                                            if (v25 != null && (I8 = cxb.I(v25)) != null && (str15 = (String) avf.R(I8)) != null && (v5 = data3.v("header_color")) != null && (I9 = cxb.I(v5)) != null && (str16 = (String) avf.R(I9)) != null && (v6 = data3.v("big_header")) != null && (E3 = cxb.E(v6)) != null) {
                                                                boolean booleanValue4 = E3.booleanValue();
                                                                JsonElement v26 = data3.v("subtitle_text");
                                                                String str31 = (v26 == null || (I25 = cxb.I(v26)) == null) ? null : (String) avf.R(I25);
                                                                JsonElement v27 = data3.v("subtitle_color");
                                                                String str32 = (v27 == null || (I24 = cxb.I(v27)) == null) ? null : (String) avf.R(I24);
                                                                JsonElement v28 = data3.v("first_button_text");
                                                                if (v28 != null && (I10 = cxb.I(v28)) != null && (str17 = (String) avf.R(I10)) != null && (v7 = data3.v("first_button_action")) != null && (G7 = cxb.G(v7)) != null && (e = sj5.e(G7)) != null && (v8 = data3.v("first_button_color")) != null && (I11 = cxb.I(v8)) != null && (str18 = (String) avf.R(I11)) != null && (v9 = data3.v("first_button_text_color")) != null && (I12 = cxb.I(v9)) != null && (str19 = (String) avf.R(I12)) != null) {
                                                                    JsonElement v29 = data3.v("second_button_text");
                                                                    String str33 = (v29 == null || (I23 = cxb.I(v29)) == null) ? null : (String) avf.R(I23);
                                                                    JsonElement v30 = data3.v("second_button_action");
                                                                    nh5 e6 = (v30 == null || (G8 = cxb.G(v30)) == null) ? null : sj5.e(G8);
                                                                    JsonElement v31 = data3.v("second_button_color");
                                                                    String str34 = (v31 == null || (I22 = cxb.I(v31)) == null) ? null : (String) avf.R(I22);
                                                                    JsonElement v32 = data3.v("second_button_text_color");
                                                                    String str35 = (v32 == null || (I21 = cxb.I(v32)) == null) ? null : (String) avf.R(I21);
                                                                    JsonElement v33 = data3.v("close_button_color");
                                                                    if (v33 != null && (I13 = cxb.I(v33)) != null && (str20 = (String) avf.R(I13)) != null) {
                                                                        JsonElement v34 = data3.v("erid_button_color");
                                                                        String str36 = (v34 == null || (I20 = cxb.I(v34)) == null) ? null : (String) avf.R(I20);
                                                                        JsonElement v35 = data3.v("adv_disclaimer");
                                                                        String str37 = (v35 == null || (I19 = cxb.I(v35)) == null) ? null : (String) avf.R(I19);
                                                                        JsonElement v36 = data3.v("disclaimer_text");
                                                                        String str38 = (v36 == null || (I18 = cxb.I(v36)) == null) ? null : (String) avf.R(I18);
                                                                        JsonElement v37 = data3.v("disclaimer_color");
                                                                        String str39 = (v37 == null || (I17 = cxb.I(v37)) == null) ? null : (String) avf.R(I17);
                                                                        JsonElement v38 = data3.v("image_url");
                                                                        if (v38 != null && (I14 = cxb.I(v38)) != null && (str21 = (String) avf.R(I14)) != null && (v10 = data3.v("background_color")) != null && (I15 = cxb.I(v10)) != null && (str22 = (String) avf.R(I15)) != null) {
                                                                            JsonElement v39 = data3.v("background_image_url");
                                                                            oh5Var = new oh5(booleanValue2, booleanValue3, str15, str16, booleanValue4, str31, str32, str17, e, str18, str19, str33, e6, str34, str35, str20, str36, str37, str38, str39, str21, str22, (v39 == null || (I16 = cxb.I(v39)) == null) ? null : (String) avf.R(I16));
                                                                            if (oh5Var != null) {
                                                                                obj = new ph5(screenId4, feedbackToken4, qh5Var, oh5Var);
                                                                                z2 = true;
                                                                                if (obj == null) {
                                                                                }
                                                                                if (obj != null) {
                                                                                }
                                                                                ik5Var5 = this;
                                                                                i8 = i3;
                                                                                z3 = z2;
                                                                                jyrVar3 = jyrVar2;
                                                                                str28 = str5;
                                                                                it4 = it2;
                                                                                it5 = it3;
                                                                                ik5Var = ik5Var4;
                                                                                linkedHashMap4 = linkedHashMap3;
                                                                                anchorId = str7;
                                                                                str30 = str6;
                                                                                triggerEntitiesDto2 = triggerEntitiesDto;
                                                                            }
                                                                            obj = null;
                                                                            z2 = true;
                                                                            if (obj == null) {
                                                                            }
                                                                            if (obj != null) {
                                                                            }
                                                                            ik5Var5 = this;
                                                                            i8 = i3;
                                                                            z3 = z2;
                                                                            jyrVar3 = jyrVar2;
                                                                            str28 = str5;
                                                                            it4 = it2;
                                                                            it5 = it3;
                                                                            ik5Var = ik5Var4;
                                                                            linkedHashMap4 = linkedHashMap3;
                                                                            anchorId = str7;
                                                                            str30 = str6;
                                                                            triggerEntitiesDto2 = triggerEntitiesDto;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    oh5Var = null;
                                                    if (oh5Var != null) {
                                                    }
                                                    obj = null;
                                                    z2 = true;
                                                    if (obj == null) {
                                                    }
                                                    if (obj != null) {
                                                    }
                                                    ik5Var5 = this;
                                                    i8 = i3;
                                                    z3 = z2;
                                                    jyrVar3 = jyrVar2;
                                                    str28 = str5;
                                                    it4 = it2;
                                                    it5 = it3;
                                                    ik5Var = ik5Var4;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    anchorId = str7;
                                                    str30 = str6;
                                                    triggerEntitiesDto2 = triggerEntitiesDto;
                                                    break;
                                                case 5:
                                                    str6 = str30;
                                                    str7 = anchorId;
                                                    String screenId5 = triggerEntityDto.getScreenId();
                                                    String feedbackToken5 = triggerEntityDto.getFeedbackToken();
                                                    JsonObject data4 = triggerEntityDto.getData();
                                                    d51 d51Var = th5.a;
                                                    JsonElement v40 = data4.v("toast_type");
                                                    String I35 = v40 != null ? cxb.I(v40) : null;
                                                    d51Var.getClass();
                                                    Iterator it7 = th5.d.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            obj3 = it7.next();
                                                            ((th5) obj3).getClass();
                                                            triggerEntitiesDto = triggerEntitiesDto2;
                                                            if (!"simple".equals(I35)) {
                                                                triggerEntitiesDto2 = triggerEntitiesDto;
                                                            }
                                                        } else {
                                                            triggerEntitiesDto = triggerEntitiesDto2;
                                                            obj3 = null;
                                                        }
                                                    }
                                                    th5 th5Var = (th5) obj3;
                                                    if (th5Var == null) {
                                                        uh5Var = null;
                                                        i3 = 10;
                                                    } else {
                                                        JsonElement v41 = data4.v("title");
                                                        if (v41 == null || (I26 = cxb.I(v41)) == null || (str23 = (String) avf.R(I26)) == null) {
                                                            i3 = 10;
                                                            uh5Var = null;
                                                        } else {
                                                            JsonElement v42 = data4.v("subtitle");
                                                            String str40 = (v42 == null || (I32 = cxb.I(v42)) == null) ? null : (String) avf.R(I32);
                                                            JsonElement v43 = data4.v("imageUrl");
                                                            String str41 = (v43 == null || (I31 = cxb.I(v43)) == null) ? null : (String) avf.R(I31);
                                                            JsonElement v44 = data4.v(Constants.KEY_ACTION);
                                                            if (v44 == null || (G10 = cxb.G(v44)) == null) {
                                                                rh5Var = null;
                                                            } else {
                                                                JsonElement v45 = G10.v(ConnectableDevice.KEY_ID);
                                                                rh5Var = (v45 == null || (I29 = cxb.I(v45)) == null || (str24 = (String) avf.R(I29)) == null || (v11 = G10.v("uri")) == null || (I30 = cxb.I(v11)) == null || (str25 = (String) avf.R(I30)) == null) ? null : new rh5(str25, str24);
                                                            }
                                                            JsonElement v46 = data4.v("timers");
                                                            if (v46 == null || (G9 = cxb.G(v46)) == null) {
                                                                i3 = 10;
                                                                sh5Var = null;
                                                            } else {
                                                                JsonElement v47 = G9.v("delay_before_show");
                                                                if (v47 == null || (I28 = cxb.I(v47)) == null) {
                                                                    i3 = 10;
                                                                    l = null;
                                                                } else {
                                                                    i3 = 10;
                                                                    l = StringsKt.r0(10, I28);
                                                                }
                                                                JsonElement v48 = G9.v("delay_before_dismiss");
                                                                sh5Var = new sh5(l, (v48 == null || (I27 = cxb.I(v48)) == null) ? null : StringsKt.r0(i3, I27));
                                                            }
                                                            uh5Var = new uh5(th5Var, str23, str40, str41, rh5Var, sh5Var);
                                                        }
                                                    }
                                                    if (uh5Var != null) {
                                                        obj = new vh5(screenId5, feedbackToken5, qh5Var, uh5Var);
                                                        z2 = true;
                                                        if (obj == null) {
                                                        }
                                                        if (obj != null) {
                                                        }
                                                        ik5Var5 = this;
                                                        i8 = i3;
                                                        z3 = z2;
                                                        jyrVar3 = jyrVar2;
                                                        str28 = str5;
                                                        it4 = it2;
                                                        it5 = it3;
                                                        ik5Var = ik5Var4;
                                                        linkedHashMap4 = linkedHashMap3;
                                                        anchorId = str7;
                                                        str30 = str6;
                                                        triggerEntitiesDto2 = triggerEntitiesDto;
                                                    }
                                                    obj = null;
                                                    z2 = true;
                                                    if (obj == null) {
                                                    }
                                                    if (obj != null) {
                                                    }
                                                    ik5Var5 = this;
                                                    i8 = i3;
                                                    z3 = z2;
                                                    jyrVar3 = jyrVar2;
                                                    str28 = str5;
                                                    it4 = it2;
                                                    it5 = it3;
                                                    ik5Var = ik5Var4;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    anchorId = str7;
                                                    str30 = str6;
                                                    triggerEntitiesDto2 = triggerEntitiesDto;
                                                    break;
                                                case 6:
                                                    String screenId6 = triggerEntityDto.getScreenId();
                                                    String feedbackToken6 = triggerEntityDto.getFeedbackToken();
                                                    JsonObject data5 = triggerEntityDto.getData();
                                                    JsonElement v49 = data5.v("title");
                                                    if (v49 != null) {
                                                        if (!(v49 instanceof JsonArray)) {
                                                            v49 = null;
                                                        }
                                                        JsonArray g = v49 != null ? v49.g() : null;
                                                        if (g != null) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            Iterator it8 = g.a.iterator();
                                                            while (true) {
                                                                Iterator it9 = it8;
                                                                if (it8.hasNext()) {
                                                                    JsonElement jsonElement = (JsonElement) it9.next();
                                                                    if (jsonElement == null || (G16 = cxb.G(jsonElement)) == null) {
                                                                        str26 = str30;
                                                                        str27 = anchorId;
                                                                    } else {
                                                                        str27 = anchorId;
                                                                        JsonElement v50 = G16.v("text");
                                                                        if (v50 == null || (I34 = cxb.I(v50)) == null) {
                                                                            str26 = str30;
                                                                        } else {
                                                                            str26 = str30;
                                                                            String str42 = (String) avf.Q(I34);
                                                                            if (str42 != null && (v13 = G16.v("color")) != null && (G17 = cxb.G(v13)) != null && (c = sj5.c(G17)) != null) {
                                                                                ih5Var = new ih5(str42, c);
                                                                                if (ih5Var == null) {
                                                                                    arrayList2.add(ih5Var);
                                                                                }
                                                                                it8 = it9;
                                                                                anchorId = str27;
                                                                                str30 = str26;
                                                                            }
                                                                        }
                                                                    }
                                                                    ih5Var = null;
                                                                    if (ih5Var == null) {
                                                                    }
                                                                    it8 = it9;
                                                                    anchorId = str27;
                                                                    str30 = str26;
                                                                } else {
                                                                    str6 = str30;
                                                                    str7 = anchorId;
                                                                    ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                                                                    if (arrayList3 != null) {
                                                                        JsonElement v51 = data5.v("button");
                                                                        if (v51 == null || (G13 = cxb.G(v51)) == null) {
                                                                            fh5Var = null;
                                                                        } else {
                                                                            JsonElement v52 = G13.v("color");
                                                                            fh5Var = (v52 == null || (G14 = cxb.G(v52)) == null || (d = sj5.d(G14)) == null || (v12 = G13.v(Constants.KEY_ACTION)) == null || (G15 = cxb.G(v12)) == null || (b = sj5.b(G15)) == null) ? null : new fh5(d, b);
                                                                        }
                                                                        JsonElement v53 = data5.v("image");
                                                                        hh5 d2 = (v53 == null || (G12 = cxb.G(v53)) == null) ? null : sj5.d(G12);
                                                                        JsonElement v54 = data5.v("bgColor");
                                                                        String str43 = (v54 == null || (I33 = cxb.I(v54)) == null) ? null : (String) avf.Q(I33);
                                                                        JsonElement v55 = data5.v(Constants.KEY_ACTION);
                                                                        jh5Var = new jh5(arrayList3, fh5Var, d2, str43, (v55 == null || (G11 = cxb.G(v55)) == null) ? null : sj5.b(G11));
                                                                        if (jh5Var == null) {
                                                                            triggerEntitiesDto = triggerEntitiesDto2;
                                                                            break;
                                                                        } else {
                                                                            obj = new kh5(screenId6, feedbackToken6, qh5Var, jh5Var);
                                                                            triggerEntitiesDto = triggerEntitiesDto2;
                                                                            i3 = 10;
                                                                            z2 = true;
                                                                            if (obj == null) {
                                                                            }
                                                                            if (obj != null) {
                                                                            }
                                                                            ik5Var5 = this;
                                                                            i8 = i3;
                                                                            z3 = z2;
                                                                            jyrVar3 = jyrVar2;
                                                                            str28 = str5;
                                                                            it4 = it2;
                                                                            it5 = it3;
                                                                            ik5Var = ik5Var4;
                                                                            linkedHashMap4 = linkedHashMap3;
                                                                            anchorId = str7;
                                                                            str30 = str6;
                                                                            triggerEntitiesDto2 = triggerEntitiesDto;
                                                                        }
                                                                    }
                                                                    jh5Var = null;
                                                                    if (jh5Var == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str6 = str30;
                                                    str7 = anchorId;
                                                    jh5Var = null;
                                                    if (jh5Var == null) {
                                                    }
                                                    break;
                                                default:
                                                    b6e.s();
                                                    return null;
                                            }
                                        }
                                        obj = null;
                                        i3 = 10;
                                        z2 = true;
                                        if (obj == null) {
                                        }
                                        if (obj != null) {
                                        }
                                        ik5Var5 = this;
                                        i8 = i3;
                                        z3 = z2;
                                        jyrVar3 = jyrVar2;
                                        str28 = str5;
                                        it4 = it2;
                                        it5 = it3;
                                        ik5Var = ik5Var4;
                                        linkedHashMap4 = linkedHashMap3;
                                        anchorId = str7;
                                        str30 = str6;
                                        triggerEntitiesDto2 = triggerEntitiesDto;
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                    if (obj != null) {
                                    }
                                    ik5Var5 = this;
                                    i8 = i3;
                                    z3 = z2;
                                    jyrVar3 = jyrVar2;
                                    str28 = str5;
                                    it4 = it2;
                                    it5 = it3;
                                    ik5Var = ik5Var4;
                                    linkedHashMap4 = linkedHashMap3;
                                    anchorId = str7;
                                    str30 = str6;
                                    triggerEntitiesDto2 = triggerEntitiesDto;
                                }
                                ik5Var3 = ik5Var;
                                i2 = i8;
                                str2 = str28;
                                jyrVar = jyrVar3;
                                it = it4;
                                str3 = anchorId;
                                z = z3;
                                str4 = str30;
                                linkedHashMap2 = linkedHashMap4;
                            }
                            linkedHashMap2.put(str3, arrayList);
                            linkedHashMap4 = linkedHashMap2;
                            str30 = str4;
                            i8 = i2;
                            z3 = z;
                            jyrVar3 = jyrVar;
                            str28 = str2;
                            it4 = it;
                            ik5Var = ik5Var3;
                            ik5Var5 = this;
                        }
                        ik5Var2 = ik5Var;
                        str = str28;
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap4.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && value != null) {
                                linkedHashMap6.put(entry.getKey(), entry.getValue());
                            }
                        }
                        linkedHashMap = linkedHashMap6;
                    }
                    J = linkedHashMap == null ? new nj6(null) : new qj6(linkedHashMap);
                }
                ik5Var2.getClass();
                if (!(J instanceof qj6)) {
                    return new wyo(((qj6) J).a);
                }
                if (!(J instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                qi5 qi5Var = (qi5) ik5Var2.c.getValue();
                pj6 pj6Var = (pj6) J;
                String message2 = pj6Var.a().getMessage();
                String str44 = message2 == null ? str : message2;
                qi5Var.getClass();
                qi5.c(qi5Var, "network", str44, null, null, 28);
                return new vyo(null, pj6Var.a());
            }
        }
        bk5Var = new bk5(ik5Var5, cg6Var);
        Object obj42 = bk5Var.k;
        nm6 nm6Var2 = nm6.a;
        i = bk5Var.m;
        boolean z32 = true;
        if (i != 0) {
        }
        biiVar = (bii) obj42;
        String str282 = "";
        if (biiVar instanceof aii) {
        }
        ik5Var2.getClass();
        if (!(J instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Map map, cg6 cg6Var) {
        ck5 ck5Var;
        int i;
        String str2;
        ik5 ik5Var;
        if (cg6Var instanceof ck5) {
            ck5Var = (ck5) cg6Var;
            int i2 = ck5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ck5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = ck5Var.l;
                nm6 nm6Var = nm6.a;
                i = ck5Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    List c = t75.c(str);
                    ck5Var.j = str;
                    ck5Var.k = this;
                    ck5Var.n = 1;
                    obj = a(((TriggerApi) this.a.getValue()).a(new TriggerPollingRequestDto(c, map)), ck5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                    ik5Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ik5Var = ck5Var.k;
                    str2 = ck5Var.j;
                    qgg.h0(obj);
                }
                ik5Var.getClass();
                return e((xyo) obj, str2);
            }
        }
        ck5Var = new ck5(this, cg6Var);
        Object obj2 = ck5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = ck5Var.n;
        if (i != 0) {
        }
        ik5Var.getClass();
        return e((xyo) obj2, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, e5b e5bVar, cg6 cg6Var) {
        fk5 fk5Var;
        int i;
        String str4;
        ik5 ik5Var;
        if (cg6Var instanceof fk5) {
            fk5Var = (fk5) cg6Var;
            int i2 = fk5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fk5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = fk5Var.l;
                nm6 nm6Var = nm6.a;
                i = fk5Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<TriggerListsDto>> c = ((TriggerApi) this.a.getValue()).c(new TriggerActionRequestDto(str2, str3, t75.c(str), e5bVar));
                    fk5Var.j = str;
                    fk5Var.k = this;
                    fk5Var.n = 1;
                    obj = a(c, fk5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str4 = str;
                    ik5Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ik5Var = fk5Var.k;
                    str4 = fk5Var.j;
                    qgg.h0(obj);
                }
                ik5Var.getClass();
                return e((xyo) obj, str4);
            }
        }
        fk5Var = new fk5(this, cg6Var);
        Object obj2 = fk5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = fk5Var.n;
        if (i != 0) {
        }
        ik5Var.getClass();
        return e((xyo) obj2, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, Map map, cg6 cg6Var) {
        gk5 gk5Var;
        int i;
        String str3;
        ik5 ik5Var;
        if (cg6Var instanceof gk5) {
            gk5Var = (gk5) cg6Var;
            int i2 = gk5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gk5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = gk5Var.l;
                nm6 nm6Var = nm6.a;
                i = gk5Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<TriggerListsDto>> d = ((TriggerApi) this.a.getValue()).d(new TriggerShownRequestDto(str2, t75.c(str), map));
                    gk5Var.j = str;
                    gk5Var.k = this;
                    gk5Var.n = 1;
                    obj = a(d, gk5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str3 = str;
                    ik5Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ik5Var = gk5Var.k;
                    str3 = gk5Var.j;
                    qgg.h0(obj);
                }
                ik5Var.getClass();
                return e((xyo) obj, str3);
            }
        }
        gk5Var = new gk5(this, cg6Var);
        Object obj2 = gk5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = gk5Var.n;
        if (i != 0) {
        }
        ik5Var.getClass();
        return e((xyo) obj2, str3);
    }
}
