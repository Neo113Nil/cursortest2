package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.bdu.trigger.cache.mapping.impl.CommunicationTriggerCacheMapperImpl$mapToJsonString$type$1;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Banner;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Deeplink;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithData;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Meta;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Toast;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$UiType;
import com.yandex.music.shared.bdu.trigger.data.a;
import com.yandex.music.shared.bdu.trigger.network.TriggerApi;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerEntitiesDto;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerEntityDto;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerListsDto;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerMetaDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class jk5 implements zj5 {
    public static final /* synthetic */ s9f[] n;
    public final TriggerApi a;
    public final ai5 b;
    public final zv8 c;
    public final dj5 d;
    public final ei5 e;
    public final pk5 f;
    public final ri5 g;
    public final mm6 h;
    public final boolean i;
    public final jyr j;
    public final rhp k;
    public final by7 l;
    public final xdr m;

    static {
        opi opiVar = new opi(jk5.class, "pollingJob", "getPollingJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        n = new s9f[]{opiVar};
    }

    public jk5(TriggerApi triggerApi, ai5 ai5Var, zv8 zv8Var, dj5 dj5Var, ei5 ei5Var, pk5 pk5Var, ri5 ri5Var, jyr jyrVar, boolean z) {
        tf6 e = gld.e(dm6.b);
        this.a = triggerApi;
        this.b = ai5Var;
        this.c = zv8Var;
        this.d = dj5Var;
        this.e = ei5Var;
        this.f = pk5Var;
        this.g = ri5Var;
        this.h = e;
        this.i = z;
        this.j = jyrVar;
        this.k = new rhp();
        this.l = asq.K(ei5Var.e, new v5(28, this));
        this.m = ei5Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0722 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x070e  */
    /* JADX WARN: Type inference failed for: r0v207, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, xdr] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, java.lang.String, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0826 -> B:13:0x0849). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jk5 jk5Var, Call call, cg6 cg6Var) {
        hk5 hk5Var;
        int i;
        Object obj;
        Object N;
        int i2;
        nm6 nm6Var;
        bii biiVar;
        ri5 ri5Var;
        String str;
        Object J;
        Object lj6Var;
        nm6 nm6Var2;
        Map linkedHashMap;
        jk5 jk5Var2;
        LinkedHashMap a;
        Iterator it;
        int i3;
        hk5 hk5Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        jyr jyrVar;
        ei5 ei5Var;
        hk5 hk5Var3;
        nm6 nm6Var3;
        String str2;
        int i8;
        String str3;
        char c;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        ei5 ei5Var2;
        hk5 hk5Var4;
        nm6 nm6Var4;
        String str4;
        int i9;
        String str5;
        Iterator it3;
        LinkedHashMap linkedHashMap3;
        Object obj2;
        Object obj3;
        InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta;
        boolean z;
        InternalCommunicationTrigger$Banner.Data data;
        String I;
        JsonElement v;
        String I2;
        JsonElement v2;
        String I3;
        InternalCommunicationTrigger$Banner.Data.Action action;
        InternalCommunicationTrigger$Banner.Data.Adv adv;
        JsonObject G;
        String I4;
        JsonObject G2;
        String I5;
        JsonElement v3;
        String I6;
        JsonObject G3;
        JsonObject G4;
        rv8 rv8Var;
        JsonElement v4;
        JsonObject G5;
        String i10;
        JsonObject G6;
        String i11;
        InternalCommunicationTrigger$DynamicOverlaySheet.Data data2;
        Boolean E;
        Boolean E2;
        String I7;
        JsonElement v5;
        String I8;
        JsonElement v6;
        Boolean E3;
        String I9;
        JsonElement v7;
        JsonObject G7;
        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction b;
        JsonElement v8;
        String I10;
        JsonElement v9;
        String I11;
        String I12;
        String I13;
        JsonElement v10;
        String I14;
        JsonObject G8;
        Object obj4;
        InternalCommunicationTrigger$Toast.Data data3;
        String I15;
        InternalCommunicationTrigger$Toast.Data.Action action2;
        InternalCommunicationTrigger$Toast.Data.Timers timers;
        JsonObject G9;
        int i12;
        Long l;
        String I16;
        String I17;
        JsonObject G10;
        String I18;
        JsonElement v11;
        String I19;
        int i13;
        hk5 hk5Var5;
        Map map;
        LinkedHashMap linkedHashMap4;
        Iterator it4;
        int i14;
        nm6 nm6Var5;
        char c2;
        int i15;
        int i16;
        ri5 ri5Var2 = jk5Var.g;
        jyr jyrVar2 = jk5Var.j;
        ei5 ei5Var3 = jk5Var.e;
        if (cg6Var instanceof hk5) {
            hk5Var = (hk5) cg6Var;
            int i17 = hk5Var.x;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                hk5Var.x = i17 - Integer.MIN_VALUE;
                Object obj5 = hk5Var.v;
                nm6 nm6Var6 = nm6.a;
                i = hk5Var.x;
                String str6 = "";
                if (i != 0) {
                    obj = null;
                    qgg.h0(obj5);
                    hk5Var.o = 0;
                    hk5Var.x = 1;
                    N = swf.N(call, hk5Var);
                    if (N == nm6Var6) {
                        nm6Var = nm6Var6;
                        return nm6Var;
                    }
                    i2 = 0;
                } else if (i == 1) {
                    obj = null;
                    int i18 = hk5Var.o;
                    qgg.h0(obj5);
                    i2 = i18;
                    N = obj5;
                } else if (i == 2) {
                    i16 = hk5Var.s;
                    i15 = hk5Var.r;
                    int i19 = hk5Var.q;
                    i14 = hk5Var.p;
                    i3 = hk5Var.o;
                    it4 = hk5Var.l;
                    Map map2 = hk5Var.k;
                    map = hk5Var.j;
                    qgg.h0(obj5);
                    hk5Var5 = hk5Var;
                    nm6Var5 = nm6Var6;
                    i13 = i19;
                    str = "";
                    c2 = 2;
                    linkedHashMap4 = map2;
                    ri5 ri5Var3 = ri5Var2;
                    i6 = i15;
                    nm6 nm6Var7 = nm6Var5;
                    hk5Var2 = hk5Var5;
                    i4 = i14;
                    it = it4;
                    i7 = i16;
                    linkedHashMap = map;
                    i5 = i13;
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    jk5Var2 = jk5Var;
                    nm6Var2 = nm6Var7;
                    a = linkedHashMap5;
                    ri5Var2 = ri5Var3;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i20 = hk5Var.u;
                    int i21 = hk5Var.t;
                    int i22 = hk5Var.s;
                    int i23 = hk5Var.r;
                    i13 = hk5Var.q;
                    int i24 = hk5Var.p;
                    int i25 = hk5Var.o;
                    Iterator it5 = hk5Var.n;
                    String str7 = hk5Var.m;
                    Iterator it6 = hk5Var.l;
                    Map map3 = hk5Var.k;
                    linkedHashMap = hk5Var.j;
                    qgg.h0(obj5);
                    LinkedHashMap linkedHashMap6 = map3;
                    ri5 ri5Var4 = ri5Var2;
                    nm6Var = nm6Var6;
                    str = "";
                    hk5Var5 = hk5Var;
                    int i26 = i21;
                    int i27 = i20;
                    a = linkedHashMap6;
                    nm6Var2 = nm6Var;
                    ri5Var2 = ri5Var4;
                    jk5Var2 = jk5Var;
                    if (it5.hasNext()) {
                        mte mteVar = (mte) it5.next();
                        Map map4 = linkedHashMap;
                        if (mteVar instanceof InternalCommunicationTrigger$Div$WithData) {
                            if (jk5Var2.i) {
                                ri5Var4 = ri5Var2;
                                nm6Var = nm6Var2;
                                dj5 dj5Var = jk5Var2.d;
                                InternalCommunicationTrigger$Div$WithData internalCommunicationTrigger$Div$WithData = (InternalCommunicationTrigger$Div$WithData) mteVar;
                                String screenId = internalCommunicationTrigger$Div$WithData.getScreenId();
                                rv8 div = internalCommunicationTrigger$Div$WithData.getDiv();
                                hk5Var5.getClass();
                                LinkedHashMap linkedHashMap7 = a;
                                hk5Var5.j = map4;
                                hk5Var5.k = linkedHashMap7;
                                hk5Var5.l = it6;
                                hk5Var5.m = str7;
                                hk5Var5.n = it5;
                                hk5Var5.o = i25;
                                hk5Var5.p = i24;
                                hk5Var5.q = i13;
                                hk5Var5.r = i23;
                                hk5Var5.s = i22;
                                hk5Var5.t = i26;
                                hk5Var5.u = i27;
                                hk5Var5.x = 3;
                                if (dj5Var.a(str7, screenId, div, hk5Var5) != nm6Var) {
                                    linkedHashMap = map4;
                                    linkedHashMap6 = linkedHashMap7;
                                }
                            } else {
                                zv8 zv8Var = jk5Var2.c;
                                InternalCommunicationTrigger$Div$WithData internalCommunicationTrigger$Div$WithData2 = (InternalCommunicationTrigger$Div$WithData) mteVar;
                                String screenId2 = internalCommunicationTrigger$Div$WithData2.getScreenId();
                                rv8 div2 = internalCommunicationTrigger$Div$WithData2.getDiv();
                                hk5Var5.getClass();
                                hk5Var5.j = map4;
                                hk5Var5.k = a;
                                hk5Var5.l = it6;
                                hk5Var5.m = null;
                                hk5Var5.n = null;
                                hk5Var5.o = i25;
                                hk5Var5.p = i24;
                                hk5Var5.q = i13;
                                hk5Var5.r = i23;
                                hk5Var5.s = i22;
                                hk5Var5.t = i26;
                                hk5Var5.u = i27;
                                c2 = 2;
                                hk5Var5.x = 2;
                                nm6Var5 = nm6Var2;
                                if (zv8Var.a(screenId2, div2, hk5Var5) == nm6Var5) {
                                    nm6Var = nm6Var5;
                                } else {
                                    int i28 = i23;
                                    linkedHashMap4 = a;
                                    i15 = i28;
                                    i16 = i22;
                                    i3 = i25;
                                    it4 = it6;
                                    i14 = i24;
                                    map = map4;
                                    ri5 ri5Var32 = ri5Var2;
                                    i6 = i15;
                                    nm6 nm6Var72 = nm6Var5;
                                    hk5Var2 = hk5Var5;
                                    i4 = i14;
                                    it = it4;
                                    i7 = i16;
                                    linkedHashMap = map;
                                    i5 = i13;
                                    LinkedHashMap linkedHashMap52 = linkedHashMap4;
                                    jk5Var2 = jk5Var;
                                    nm6Var2 = nm6Var72;
                                    a = linkedHashMap52;
                                    ri5Var2 = ri5Var32;
                                    if (!it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        i24 = i4;
                                        i13 = i5;
                                        i22 = i7;
                                        str7 = (String) entry.getKey();
                                        it6 = it;
                                        hk5Var5 = hk5Var2;
                                        i25 = i3;
                                        it5 = ((List) entry.getValue()).iterator();
                                        i27 = 0;
                                        i26 = 0;
                                        i23 = i6;
                                        if (it5.hasNext()) {
                                            ri5Var32 = ri5Var2;
                                            nm6Var72 = nm6Var2;
                                            hk5Var2 = hk5Var5;
                                            i3 = i25;
                                            i6 = i23;
                                            it = it6;
                                            i4 = i24;
                                            linkedHashMap52 = a;
                                            i7 = i22;
                                            i5 = i13;
                                            jk5Var2 = jk5Var;
                                            nm6Var2 = nm6Var72;
                                            a = linkedHashMap52;
                                            ri5Var2 = ri5Var32;
                                            if (!it.hasNext()) {
                                                ri5Var = ri5Var2;
                                                if (linkedHashMap != null) {
                                                    lj6Var = new qj6(linkedHashMap);
                                                    J = lj6Var;
                                                    if (!(J instanceof qj6)) {
                                                    }
                                                    return Unit.a;
                                                }
                                                J = new nj6(null);
                                                if (!(J instanceof qj6)) {
                                                    if (!(J instanceof pj6)) {
                                                        b6e.s();
                                                        return null;
                                                    }
                                                    String message = ((pj6) J).a().getMessage();
                                                    String str8 = message == null ? str : message;
                                                    ri5Var.getClass();
                                                    ri5.c(ri5Var, "network", str8, null, null, 28);
                                                }
                                                return Unit.a;
                                            }
                                        }
                                    }
                                }
                            }
                            return nm6Var;
                        }
                        ri5Var4 = ri5Var2;
                        nm6Var = nm6Var2;
                        linkedHashMap = map4;
                        linkedHashMap6 = a;
                        a = linkedHashMap6;
                        nm6Var2 = nm6Var;
                        ri5Var2 = ri5Var4;
                        jk5Var2 = jk5Var;
                        if (it5.hasNext()) {
                        }
                    }
                }
                biiVar = (bii) N;
                if (biiVar instanceof aii) {
                    ri5Var = ri5Var2;
                    str = "";
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i29 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str9 = name == null ? str : name;
                        String message2 = musicBackendInvocationError.getMessage();
                        J = new kj6(i29, musicBackendInvocationError.getDetails(), str9, message2 == null ? str : message2, xhiVar.a);
                    } else if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        lj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        J = lj6Var;
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            b6e.s();
                            return null;
                        }
                        J = uwf.J((zhi) biiVar);
                    }
                    if (!(J instanceof qj6)) {
                    }
                    return Unit.a;
                }
                TriggerListsDto triggerListsDto = (TriggerListsDto) ((aii) biiVar).a;
                if (triggerListsDto.getTriggers() == null) {
                    ?? r1 = ei5Var3.e;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    r1.getClass();
                    ?? r5 = obj;
                    r1.m(r5, e5bVar);
                    x97.y(ei5Var3.d, r5, r5, new ja4(ei5Var3, r5, 9), 3);
                    dfi.r("failed to parse triggers cause of nullable parameter. dto = " + triggerListsDto, "CommunicationTriggerRepository");
                    ri5.a(ri5Var2, "empty_response", r5, r5, 14);
                    return Unit.a;
                }
                ArrayList O = CollectionsKt.O(triggerListsDto.getTriggers());
                char c3 = '\n';
                int a2 = tah.a(v75.o(O, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(a2);
                Iterator it7 = O.iterator();
                while (it7.hasNext()) {
                    TriggerEntitiesDto triggerEntitiesDto = (TriggerEntitiesDto) it7.next();
                    String anchorId = triggerEntitiesDto.getAnchorId();
                    if (triggerEntitiesDto.getAnchorId() == null || triggerEntitiesDto.getTriggers() == null) {
                        jyrVar = jyrVar2;
                        ei5Var = ei5Var3;
                        hk5Var3 = hk5Var;
                        nm6Var3 = nm6Var6;
                        str2 = anchorId;
                        i8 = i2;
                        str3 = str6;
                        c = c3;
                        it2 = it7;
                        LinkedHashMap linkedHashMap9 = linkedHashMap8;
                        Assertions.throwOrSkip("CommunicationTriggerRepository", new FailedAssertionException("failed to parse triggers cause of nullable parameter. dto = " + triggerEntitiesDto));
                        ri5.a(ri5Var2, "null_fields", triggerEntitiesDto.getAnchorId(), null, 12);
                        linkedHashMap2 = linkedHashMap9;
                        arrayList = null;
                    } else {
                        ArrayList O2 = CollectionsKt.O(triggerEntitiesDto.getTriggers());
                        arrayList = new ArrayList();
                        Iterator it8 = O2.iterator();
                        while (it8.hasNext()) {
                            jyr jyrVar3 = jyrVar2;
                            TriggerEntityDto triggerEntityDto = (TriggerEntityDto) it8.next();
                            if (triggerEntityDto.getScreenId() == null || triggerEntityDto.getFeedbackToken() == null || triggerEntityDto.getData() == null || triggerEntityDto.getMeta() == null) {
                                ei5Var2 = ei5Var3;
                                hk5Var4 = hk5Var;
                                nm6Var4 = nm6Var6;
                                str4 = anchorId;
                                i9 = i2;
                                str5 = str6;
                                it3 = it7;
                                linkedHashMap3 = linkedHashMap8;
                                dfi.r("failed to parse trigger cause of nullable parameter. dto = " + triggerEntityDto, "CommunicationTriggerRepository");
                            } else {
                                TriggerMetaDto meta = triggerEntityDto.getMeta();
                                e88 e88Var = InternalCommunicationTrigger$UiType.b;
                                String uiType = meta.getUiType();
                                e88Var.getClass();
                                Iterator it9 = InternalCommunicationTrigger$UiType.d.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        obj3 = it9.next();
                                        hk5Var4 = hk5Var;
                                        if (!Intrinsics.d(((InternalCommunicationTrigger$UiType) obj3).a, uiType)) {
                                            hk5Var = hk5Var4;
                                        }
                                    } else {
                                        hk5Var4 = hk5Var;
                                        obj3 = null;
                                    }
                                }
                                InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType = (InternalCommunicationTrigger$UiType) obj3;
                                if (internalCommunicationTrigger$UiType == null) {
                                    i9 = i2;
                                    str5 = str6;
                                    it3 = it7;
                                    internalCommunicationTrigger$Meta = null;
                                } else {
                                    Boolean hasTabDot = meta.getHasTabDot();
                                    if (hasTabDot != null) {
                                        boolean booleanValue = hasTabDot.booleanValue();
                                        i9 = i2;
                                        z = booleanValue;
                                    } else {
                                        i9 = i2;
                                        z = false;
                                    }
                                    str5 = str6;
                                    it3 = it7;
                                    internalCommunicationTrigger$Meta = new InternalCommunicationTrigger$Meta(internalCommunicationTrigger$UiType, z, meta.getShowAfter(), meta.getShowBefore());
                                }
                                if (internalCommunicationTrigger$Meta == null) {
                                    dfi.r("failed to parse trigger meta cause of nullable parameter. dto = " + triggerEntityDto, "CommunicationTriggerRepository");
                                    ei5Var2 = ei5Var3;
                                    nm6Var4 = nm6Var6;
                                    str4 = anchorId;
                                    linkedHashMap3 = linkedHashMap8;
                                    obj2 = null;
                                } else {
                                    nm6Var4 = nm6Var6;
                                    switch (ak5.a[internalCommunicationTrigger$Meta.getUiType().ordinal()]) {
                                        case 1:
                                            ei5Var2 = ei5Var3;
                                            str4 = anchorId;
                                            linkedHashMap3 = linkedHashMap8;
                                            rj5 rj5Var = (rj5) jyrVar3.getValue();
                                            JsonObject data4 = triggerEntityDto.getData();
                                            ((tj5) rj5Var).getClass();
                                            data4.getClass();
                                            JsonElement v12 = data4.v("title");
                                            if (v12 == null || (I = cxb.I(v12)) == null || (v = data4.v("subtitle")) == null || (I2 = cxb.I(v)) == null || (v2 = data4.v("imageUrl")) == null || (I3 = cxb.I(v2)) == null) {
                                                data = null;
                                            } else {
                                                JsonElement v13 = data4.v("lightTheme");
                                                InternalCommunicationTrigger$Banner.Data.Theme a3 = (v13 == null || (G4 = cxb.G(v13)) == null) ? null : tj5.a(G4);
                                                JsonElement v14 = data4.v("darkTheme");
                                                InternalCommunicationTrigger$Banner.Data.Theme a4 = (v14 == null || (G3 = cxb.G(v14)) == null) ? null : tj5.a(G3);
                                                JsonElement v15 = data4.v(Constants.KEY_ACTION);
                                                if (v15 == null || (G2 = cxb.G(v15)) == null) {
                                                    action = null;
                                                } else {
                                                    JsonElement v16 = G2.v(ConnectableDevice.KEY_ID);
                                                    action = (v16 == null || (I5 = cxb.I(v16)) == null || (v3 = G2.v("uri")) == null || (I6 = cxb.I(v3)) == null) ? null : new InternalCommunicationTrigger$Banner.Data.Action(I6, I5);
                                                }
                                                JsonElement v17 = data4.v("adv");
                                                if (v17 == null || (G = cxb.G(v17)) == null) {
                                                    adv = null;
                                                } else {
                                                    JsonElement v18 = G.v("text");
                                                    adv = (v18 == null || (I4 = cxb.I(v18)) == null) ? null : new InternalCommunicationTrigger$Banner.Data.Adv(I4);
                                                }
                                                data = new InternalCommunicationTrigger$Banner.Data(I, I2, I3, a3, a4, action, adv);
                                            }
                                            if (data != null) {
                                                obj2 = new InternalCommunicationTrigger$Banner(triggerEntityDto.getScreenId(), triggerEntityDto.getFeedbackToken(), internalCommunicationTrigger$Meta, data);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            ei5Var2 = ei5Var3;
                                            str4 = anchorId;
                                            linkedHashMap3 = linkedHashMap8;
                                            rj5 rj5Var2 = (rj5) jyrVar3.getValue();
                                            JsonObject data5 = triggerEntityDto.getData();
                                            ((tj5) rj5Var2).getClass();
                                            data5.getClass();
                                            JsonElement v19 = data5.v("deeplink");
                                            String I20 = v19 != null ? cxb.I(v19) : null;
                                            if (I20 != null) {
                                                obj2 = new InternalCommunicationTrigger$Deeplink(triggerEntityDto.getScreenId(), triggerEntityDto.getFeedbackToken(), internalCommunicationTrigger$Meta, I20);
                                                break;
                                            }
                                            break;
                                        case 3:
                                        case 4:
                                            ei5Var2 = ei5Var3;
                                            str4 = anchorId;
                                            linkedHashMap3 = linkedHashMap8;
                                            rj5 rj5Var3 = (rj5) jyrVar3.getValue();
                                            JsonObject data6 = triggerEntityDto.getData();
                                            Gson gson = ((tj5) rj5Var3).a;
                                            data6.getClass();
                                            qc9 qc9Var = new qc9(new gy2(2));
                                            try {
                                                JsonElement v20 = data6.v("templates");
                                                if (v20 != null && (G6 = cxb.G(v20)) != null && (i11 = gson.i(G6)) != null) {
                                                    qc9Var.e(new JSONObject(i11));
                                                }
                                                v4 = data6.v("card");
                                            } catch (JsonIOException e) {
                                                Assertions.throwOrSkip("CommunicationTriggerMapper", new FailedAssertionException("failed to parse div data", e));
                                            } catch (JsonSyntaxException e2) {
                                                Assertions.throwOrSkip("CommunicationTriggerMapper", new FailedAssertionException("failed to parse div data", e2));
                                            } catch (JSONException e3) {
                                                Assertions.throwOrSkip("CommunicationTriggerMapper", new FailedAssertionException("failed to parse div data", e3));
                                            } catch (z7k e4) {
                                                Assertions.throwOrSkip("CommunicationTriggerMapper", new FailedAssertionException("failed to parse div data", e4));
                                            }
                                            if (v4 != null && (G5 = cxb.G(v4)) != null && (i10 = gson.i(G5)) != null) {
                                                JSONObject jSONObject = new JSONObject(i10);
                                                int i30 = rv8.i;
                                                rv8Var = fgq.y(qc9Var, jSONObject);
                                                if (rv8Var != null) {
                                                    obj2 = new InternalCommunicationTrigger$Div$WithData(triggerEntityDto.getScreenId(), triggerEntityDto.getFeedbackToken(), internalCommunicationTrigger$Meta, rv8Var);
                                                    break;
                                                }
                                            }
                                            rv8Var = null;
                                            if (rv8Var != null) {
                                            }
                                            break;
                                        case 5:
                                            ei5Var2 = ei5Var3;
                                            str4 = anchorId;
                                            linkedHashMap3 = linkedHashMap8;
                                            rj5 rj5Var4 = (rj5) jyrVar3.getValue();
                                            JsonObject data7 = triggerEntityDto.getData();
                                            ((tj5) rj5Var4).getClass();
                                            data7.getClass();
                                            JsonElement v21 = data7.v("can_be_opened");
                                            if (v21 != null && (E = cxb.E(v21)) != null) {
                                                boolean booleanValue2 = E.booleanValue();
                                                JsonElement v22 = data7.v("is_center_align");
                                                if (v22 != null && (E2 = cxb.E(v22)) != null) {
                                                    boolean booleanValue3 = E2.booleanValue();
                                                    JsonElement v23 = data7.v("header_text");
                                                    if (v23 != null && (I7 = cxb.I(v23)) != null && (v5 = data7.v("header_color")) != null && (I8 = cxb.I(v5)) != null && (v6 = data7.v("big_header")) != null && (E3 = cxb.E(v6)) != null) {
                                                        boolean booleanValue4 = E3.booleanValue();
                                                        JsonElement v24 = data7.v("subtitle_text");
                                                        String I21 = v24 != null ? cxb.I(v24) : null;
                                                        JsonElement v25 = data7.v("subtitle_color");
                                                        String I22 = v25 != null ? cxb.I(v25) : null;
                                                        JsonElement v26 = data7.v("first_button_text");
                                                        if (v26 != null && (I9 = cxb.I(v26)) != null && (v7 = data7.v("first_button_action")) != null && (G7 = cxb.G(v7)) != null && (b = tj5.b(G7)) != null && (v8 = data7.v("first_button_color")) != null && (I10 = cxb.I(v8)) != null && (v9 = data7.v("first_button_text_color")) != null && (I11 = cxb.I(v9)) != null) {
                                                            JsonElement v27 = data7.v("second_button_text");
                                                            String I23 = v27 != null ? cxb.I(v27) : null;
                                                            JsonElement v28 = data7.v("second_button_action");
                                                            InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction b2 = (v28 == null || (G8 = cxb.G(v28)) == null) ? null : tj5.b(G8);
                                                            JsonElement v29 = data7.v("second_button_color");
                                                            String I24 = v29 != null ? cxb.I(v29) : null;
                                                            JsonElement v30 = data7.v("second_button_text_color");
                                                            String I25 = v30 != null ? cxb.I(v30) : null;
                                                            JsonElement v31 = data7.v("close_button_color");
                                                            if (v31 != null && (I12 = cxb.I(v31)) != null) {
                                                                JsonElement v32 = data7.v("erid_button_color");
                                                                String I26 = v32 != null ? cxb.I(v32) : null;
                                                                JsonElement v33 = data7.v("adv_disclaimer");
                                                                String I27 = v33 != null ? cxb.I(v33) : null;
                                                                JsonElement v34 = data7.v("disclaimer_text");
                                                                String I28 = v34 != null ? cxb.I(v34) : null;
                                                                JsonElement v35 = data7.v("disclaimer_color");
                                                                String I29 = v35 != null ? cxb.I(v35) : null;
                                                                JsonElement v36 = data7.v("image_url");
                                                                if (v36 != null && (I13 = cxb.I(v36)) != null && (v10 = data7.v("background_color")) != null && (I14 = cxb.I(v10)) != null) {
                                                                    JsonElement v37 = data7.v("background_image_url");
                                                                    data2 = new InternalCommunicationTrigger$DynamicOverlaySheet.Data(booleanValue2, booleanValue3, I7, I8, booleanValue4, I21, I22, I9, b, I10, I11, I23, b2, I24, I25, I12, I26, I27, I28, I29, I13, I14, v37 != null ? cxb.I(v37) : null);
                                                                    if (data2 != null) {
                                                                        obj2 = new InternalCommunicationTrigger$DynamicOverlaySheet(triggerEntityDto.getScreenId(), triggerEntityDto.getFeedbackToken(), internalCommunicationTrigger$Meta, data2);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            data2 = null;
                                            if (data2 != null) {
                                            }
                                            break;
                                        case 6:
                                            rj5 rj5Var5 = (rj5) jyrVar3.getValue();
                                            ei5Var2 = ei5Var3;
                                            JsonObject data8 = triggerEntityDto.getData();
                                            ((tj5) rj5Var5).getClass();
                                            data8.getClass();
                                            a aVar = InternalCommunicationTrigger$Toast.Data.ToastType.b;
                                            str4 = anchorId;
                                            JsonElement v38 = data8.v("toast_type");
                                            String I30 = v38 != null ? cxb.I(v38) : null;
                                            aVar.getClass();
                                            Iterator it10 = InternalCommunicationTrigger$Toast.Data.ToastType.d.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    obj4 = it10.next();
                                                    linkedHashMap3 = linkedHashMap8;
                                                    if (!Intrinsics.d(((InternalCommunicationTrigger$Toast.Data.ToastType) obj4).a, I30)) {
                                                        linkedHashMap8 = linkedHashMap3;
                                                    }
                                                } else {
                                                    linkedHashMap3 = linkedHashMap8;
                                                    obj4 = null;
                                                }
                                            }
                                            InternalCommunicationTrigger$Toast.Data.ToastType toastType = (InternalCommunicationTrigger$Toast.Data.ToastType) obj4;
                                            if (toastType == null) {
                                                data3 = null;
                                            } else {
                                                JsonElement v39 = data8.v("title");
                                                if (v39 == null || (I15 = cxb.I(v39)) == null) {
                                                    data3 = null;
                                                } else {
                                                    JsonElement v40 = data8.v("subtitle");
                                                    String I31 = v40 != null ? cxb.I(v40) : null;
                                                    JsonElement v41 = data8.v("imageUrl");
                                                    String I32 = v41 != null ? cxb.I(v41) : null;
                                                    JsonElement v42 = data8.v(Constants.KEY_ACTION);
                                                    if (v42 == null || (G10 = cxb.G(v42)) == null) {
                                                        action2 = null;
                                                    } else {
                                                        JsonElement v43 = G10.v(ConnectableDevice.KEY_ID);
                                                        action2 = (v43 == null || (I18 = cxb.I(v43)) == null || (v11 = G10.v("uri")) == null || (I19 = cxb.I(v11)) == null) ? null : new InternalCommunicationTrigger$Toast.Data.Action(I19, I18);
                                                    }
                                                    JsonElement v44 = data8.v("timers");
                                                    if (v44 == null || (G9 = cxb.G(v44)) == null) {
                                                        timers = null;
                                                    } else {
                                                        JsonElement v45 = G9.v("delay_before_show");
                                                        if (v45 == null || (I17 = cxb.I(v45)) == null) {
                                                            i12 = 10;
                                                            l = null;
                                                        } else {
                                                            i12 = 10;
                                                            l = StringsKt.r0(10, I17);
                                                        }
                                                        JsonElement v46 = G9.v("delay_before_dismiss");
                                                        timers = new InternalCommunicationTrigger$Toast.Data.Timers(l, (v46 == null || (I16 = cxb.I(v46)) == null) ? null : StringsKt.r0(i12, I16));
                                                    }
                                                    data3 = new InternalCommunicationTrigger$Toast.Data(toastType, I15, I31, I32, action2, timers);
                                                }
                                            }
                                            if (data3 != null) {
                                                obj2 = new InternalCommunicationTrigger$Toast(triggerEntityDto.getScreenId(), triggerEntityDto.getFeedbackToken(), internalCommunicationTrigger$Meta, data3);
                                                break;
                                            }
                                            break;
                                        default:
                                            b6e.s();
                                            return null;
                                    }
                                }
                                if (obj2 == null) {
                                    ri5.a(ri5Var2, "mapper_null", triggerEntitiesDto.getAnchorId(), triggerEntityDto.getScreenId(), 8);
                                }
                                if (obj2 == null) {
                                    arrayList.add(obj2);
                                }
                                jyrVar2 = jyrVar3;
                                i2 = i9;
                                str6 = str5;
                                hk5Var = hk5Var4;
                                it7 = it3;
                                nm6Var6 = nm6Var4;
                                ei5Var3 = ei5Var2;
                                anchorId = str4;
                                linkedHashMap8 = linkedHashMap3;
                            }
                            obj2 = null;
                            if (obj2 == null) {
                            }
                            if (obj2 == null) {
                            }
                            jyrVar2 = jyrVar3;
                            i2 = i9;
                            str6 = str5;
                            hk5Var = hk5Var4;
                            it7 = it3;
                            nm6Var6 = nm6Var4;
                            ei5Var3 = ei5Var2;
                            anchorId = str4;
                            linkedHashMap8 = linkedHashMap3;
                        }
                        jyrVar = jyrVar2;
                        ei5Var = ei5Var3;
                        hk5Var3 = hk5Var;
                        nm6Var3 = nm6Var6;
                        str2 = anchorId;
                        i8 = i2;
                        str3 = str6;
                        it2 = it7;
                        c = '\n';
                        linkedHashMap2 = linkedHashMap8;
                    }
                    linkedHashMap2.put(str2, arrayList);
                    linkedHashMap8 = linkedHashMap2;
                    c3 = c;
                    jyrVar2 = jyrVar;
                    i2 = i8;
                    str6 = str3;
                    hk5Var = hk5Var3;
                    it7 = it2;
                    nm6Var6 = nm6Var3;
                    ei5Var3 = ei5Var;
                }
                ei5 ei5Var4 = ei5Var3;
                hk5 hk5Var6 = hk5Var;
                nm6Var2 = nm6Var6;
                int i31 = i2;
                str = str6;
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap8.entrySet()) {
                    Object key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (key != null && value != null) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ei5Var4.getClass();
                xdr xdrVar = ei5Var4.e;
                xdrVar.getClass();
                xdrVar.m(null, linkedHashMap);
                hi5 hi5Var = (hi5) ei5Var4.a;
                hi5Var.getClass();
                Type type = new CommunicationTriggerCacheMapperImpl$mapToJsonString$type$1().getType();
                Gson gson2 = hi5Var.a;
                StringWriter stringWriter = new StringWriter();
                try {
                    gson2.l(linkedHashMap, type, gson2.h(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    stringWriter2.getClass();
                    x97.y(ei5Var4.d, null, null, new vv4(ei5Var4, stringWriter2, (Continuation) null, 4), 3);
                    jk5Var2 = jk5Var;
                    a = ((rk5) jk5Var2.f).a(linkedHashMap);
                    it = a.entrySet().iterator();
                    i3 = i31;
                    hk5Var2 = hk5Var6;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    if (!it.hasNext()) {
                    }
                } catch (IOException e5) {
                    throw new JsonIOException(e5);
                }
            }
        }
        hk5Var = new hk5(jk5Var, cg6Var);
        Object obj52 = hk5Var.v;
        nm6 nm6Var62 = nm6.a;
        i = hk5Var.x;
        String str62 = "";
        if (i != 0) {
        }
        biiVar = (bii) N;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, cg6 cg6Var) {
        dk5 dk5Var;
        int i;
        if (cg6Var instanceof dk5) {
            dk5Var = (dk5) cg6Var;
            int i2 = dk5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dk5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = dk5Var.j;
                nm6 nm6Var = nm6.a;
                i = dk5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ek5 ek5Var = new ek5(this, j, (Continuation) null);
                    dk5Var.l = 1;
                    obj = tyf.L(j, ek5Var, dk5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                wyo wyoVar = (wyo) obj;
                return wyoVar == null ? wyoVar : new vyo(null, new TimeoutException("loading timer has expired"));
            }
        }
        dk5Var = new dk5(this, cg6Var);
        Object obj2 = dk5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = dk5Var.l;
        if (i != 0) {
        }
        wyo wyoVar2 = (wyo) obj2;
        if (wyoVar2 == null) {
        }
    }
}
