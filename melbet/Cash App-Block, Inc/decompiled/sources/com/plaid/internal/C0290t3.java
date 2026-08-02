package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.C0095a6;
import com.plaid.internal.D1;
import com.plaid.internal.F6;
import com.plaid.internal.I2;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

/* renamed from: com.plaid.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0290t3 {
    public final a a;
    public final Json b;
    public String c;

    /* renamed from: com.plaid.internal.t3$a */
    public interface a {
        void a(C0090a1 c0090a1);

        void a(LinkEvent linkEvent, I2 i2);

        void a(LinkExit linkExit);

        void a(LinkSuccess linkSuccess);

        void a(String str, LinkEventMetadata linkEventMetadata);

        void a(LinkedHashMap linkedHashMap);

        void b(String str);

        void c(String str);
    }

    /* renamed from: com.plaid.internal.t3$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0311v6.values().length];
            try {
                iArr[EnumC0311v6.ENQUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0311v6.ENQUEUE_AND_FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0311v6.NO_ENQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0311v6.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C0290t3(a aVar, Json json) {
        aVar.getClass();
        json.getClass();
        this.a = aVar;
        this.b = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d A[EDGE_INSN: B:90:0x017d->B:66:0x017d BREAK  A[LOOP:1: B:60:0x016a->B:63:0x017a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int parseInt;
        int length;
        int i;
        I2 i2;
        str.getClass();
        int i3 = 0;
        if (!StringsKt__StringsJVMKt.startsWith(str, "plaidlink://", false)) {
            C0095a6.a.a(C0095a6.a, "external link: ".concat(str));
            this.a.c(str);
            return;
        }
        String replace$default = StringsKt__StringsJVMKt.replace$default(str, "plaidlink://", "https://");
        HttpUrl.Builder builder = new HttpUrl.Builder();
        EnumC0311v6 enumC0311v6 = null;
        builder.parse$okhttp(null, replace$default);
        HttpUrl build = builder.build();
        C0095a6.a.a(C0095a6.a, "plaidcallback ".concat(str));
        String str2 = build.host;
        if (!Intrinsics.areEqual(str2, BreadcrumbHelper.Category.EVENT)) {
            F6.a.a("Webview url intercepted: " + str2);
        }
        Set queryParameterNames = build.queryParameterNames();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(queryParameterNames, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : queryParameterNames) {
            String queryParameter = build.queryParameter((String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        String str3 = (String) linkedHashMap.get("link_session_id");
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null && !str3.equals(this.c)) {
                this.a.b(str3);
                this.c = str3;
            }
        }
        int hashCode = str2.hashCode();
        if (hashCode != -579210487) {
            if (hashCode != 3127582) {
                if (hashCode != 96891546) {
                    if (hashCode == 2091030007 && str2.equals("session_handoff")) {
                        C0095a6.a.a(C0095a6.a, "Handoff to out of process");
                        this.a.a(linkedHashMap);
                        return;
                    }
                } else if (str2.equals(BreadcrumbHelper.Category.EVENT)) {
                    String str4 = (String) linkedHashMap.get("event_name");
                    if (str4 == null) {
                        str4 = "null";
                    }
                    String str5 = (String) linkedHashMap.get("queue_behavior");
                    if (str5 == null) {
                        str5 = "null";
                    }
                    String str6 = (String) linkedHashMap.get("delay_ms");
                    String str7 = str6 != null ? str6 : "null";
                    C0095a6.a aVar = C0095a6.a;
                    String concat = "Event name: ".concat(str4);
                    aVar.getClass();
                    C0095a6.a.a(concat, false);
                    C0095a6.a.a(aVar, "queue_behavior: " + str5 + ", delay_ms: " + str7);
                    F6.a.b(MapsKt__MapsKt.mapOf(new Pair("event_name", str4), new Pair("queue_behavior", str5), new Pair("delay_ms", str7)), "Received event: ".concat(str4));
                    C0095a6.a.a(aVar, build.url);
                    String str8 = (String) linkedHashMap.get("delay_ms");
                    try {
                        if (str8 != null) {
                            try {
                                parseInt = Integer.parseInt(str8);
                            } catch (NumberFormatException unused) {
                            }
                            EnumC0311v6[] values = EnumC0311v6.values();
                            length = values.length;
                            while (true) {
                                if (i3 < length) {
                                    break;
                                }
                                EnumC0311v6 enumC0311v62 = values[i3];
                                if (Intrinsics.areEqual(enumC0311v62.getProtoString(), str5)) {
                                    enumC0311v6 = enumC0311v62;
                                    break;
                                }
                                i3++;
                            }
                            if (enumC0311v6 == null) {
                                enumC0311v6 = EnumC0311v6.UNKNOWN;
                            }
                            i = b.a[enumC0311v6.ordinal()];
                            if (i != 1) {
                                i2 = I2.b.a;
                            } else if (i == 2) {
                                i2 = I2.c.a;
                            } else if (i == 3) {
                                i2 = I2.d.a;
                            } else {
                                if (i != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                i2 = parseInt > 0 ? new I2.a(parseInt) : I2.d.a;
                            }
                            this.a.a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkedHashMap), i2);
                            return;
                        }
                        this.a.a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkedHashMap), i2);
                        return;
                    } catch (NoSuchElementException unused2) {
                        this.a.a(new C0090a1("Failed to parse event"));
                        return;
                    }
                    parseInt = 0;
                    EnumC0311v6[] values2 = EnumC0311v6.values();
                    length = values2.length;
                    while (true) {
                        if (i3 < length) {
                        }
                        i3++;
                    }
                    if (enumC0311v6 == null) {
                    }
                    i = b.a[enumC0311v6.ordinal()];
                    if (i != 1) {
                    }
                }
            } else if (str2.equals("exit")) {
                C0095a6.a aVar2 = C0095a6.a;
                C0095a6.a.a(aVar2, "User status in flow: ", new Object[]{Boxes$$ExternalSyntheticOutline1.m("data: ", linkedHashMap.get("status"))});
                C0095a6.a.a(aVar2, "Link request ID: ", new Object[]{Boxes$$ExternalSyntheticOutline1.m("data: ", linkedHashMap.get("request_id"))});
                try {
                    this.a.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkedHashMap));
                    return;
                } catch (NoSuchElementException unused3) {
                    this.a.a(new C0090a1("Failed to parse exit"));
                    return;
                }
            }
        } else if (str2.equals("connected")) {
            C0095a6.a aVar3 = C0095a6.a;
            C0095a6.a.a(aVar3, "Institution id: " + linkedHashMap.get("institution_id"));
            C0095a6.a.a(aVar3, "Institution name:  " + linkedHashMap.get("institution_name"));
            a(linkedHashMap);
            return;
        }
        C0095a6.a.a(C0095a6.a, "Link action detected: ".concat(str2));
        this.a.a(str2, LinkEventMetadata.INSTANCE.fromMap(linkedHashMap, this.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final void a(LinkedHashMap linkedHashMap) {
        List list;
        ?? r0;
        String str = (String) linkedHashMap.get("accounts");
        if (str == null) {
            str = "";
        }
        try {
            try {
                Json json = this.b;
                D1.g.getClass();
                D1.b.a();
                D1.a aVar = D1.a.a;
                aVar.getClass();
                list = (List) json.decodeFromString(str, new HashSetSerializer(aVar, 1));
            } catch (SerializationException unused) {
                C0095a6.a.b(C0095a6.a, "Unable to parse accounts data: " + P4.a(str));
                list = null;
            }
            if (list != null) {
                r0 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r0.add(L2.a((D1) it.next()));
                }
            } else {
                r0 = EmptyList.INSTANCE;
            }
            this.a.a(L2.a(linkedHashMap, (List) r0));
        } catch (NoSuchElementException unused2) {
            this.a.a(new C0090a1("Failed to parse success"));
        }
    }
}
