package com.miteksystems.misnap.core;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.KeyValueSerializer;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonImpl;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonTransformingSerializer;
import okhttp3.Headers;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONException;
import org.json.JSONObject;
import papa.AppUpdateData;

/* loaded from: classes4.dex */
public abstract class MibiData {
    public static MiSnapCameraInfo c;
    public static MiSnapSettings g;
    public static MiSnapSettings h;
    public static String i;
    public static Integer j;
    public static final Uxp a = new Uxp();
    public static MetaData b = new MetaData(System.currentTimeMillis());
    public static final ArrayList e = new ArrayList();
    public static final HashMap f = new HashMap();
    public static final JsonImpl k = AppUpdateData.Json$default(MibiData$json$1.INSTANCE);
    public static final Object l = new Object();
    public static final Object m = new Object();

    public final class MiSnapSettingsSerializer extends JsonTransformingSerializer {
        public static final MiSnapSettingsSerializer INSTANCE = new MiSnapSettingsSerializer(MiSnapSettings.INSTANCE.serializer());

        @Override // kotlinx.serialization.json.JsonTransformingSerializer
        public final JsonElement transformSerialize(JsonElement jsonElement) {
            JsonElement jsonElement2;
            jsonElement.getClass();
            JsonObject jsonObject = JsonElementKt.getJsonObject(jsonElement);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : jsonObject.content.entrySet()) {
                if (!Intrinsics.areEqual((String) entry.getKey(), "license")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            Object obj = linkedHashMap2.get("nfc");
            obj.getClass();
            JsonElement jsonElement3 = (JsonElement) JsonElementKt.getJsonObject((JsonElement) obj).get("mrz");
            if (jsonElement3 != null && (jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement3).get("type")) != null) {
                Object obj2 = linkedHashMap2.get("nfc");
                obj2.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(JsonElementKt.getJsonObject((JsonElement) obj2));
                linkedHashMap3.put("mrz", new JsonObject(MapsKt__MapsJVMKt.mapOf(new Pair("type", jsonElement2))));
                linkedHashMap2.put("nfc", new JsonObject(linkedHashMap3));
            }
            return new JsonObject(linkedHashMap2);
        }
    }

    @Serializable
    public final class MicrophoneInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final Integer b;
        public final String c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$MicrophoneInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$MicrophoneInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$MicrophoneInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MicrophoneInfo(int i, String str, Integer num, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MicrophoneInfo)) {
                return false;
            }
            MicrophoneInfo microphoneInfo = (MicrophoneInfo) obj;
            return Intrinsics.areEqual(this.a, microphoneInfo.a) && Intrinsics.areEqual(this.b, microphoneInfo.b) && Intrinsics.areEqual(this.c, microphoneInfo.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MicrophoneInfo(type=");
            sb.append(this.a);
            sb.append(", sampleRate=");
            sb.append(this.b);
            sb.append(", encoding=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.c, ')');
        }
    }

    @Serializable
    public final class NfcChipAuthentication {
        public static final Companion Companion = new Companion();
        public final boolean a;
        public final boolean b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$NfcChipAuthentication$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$NfcChipAuthentication;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$NfcChipAuthentication$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NfcChipAuthentication(int i, boolean z, boolean z2) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, MibiData$NfcChipAuthentication$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NfcChipAuthentication)) {
                return false;
            }
            NfcChipAuthentication nfcChipAuthentication = (NfcChipAuthentication) obj;
            return this.a == nfcChipAuthentication.a && this.b == nfcChipAuthentication.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            boolean z = this.a;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = i * 31;
            boolean z2 = this.b;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NfcChipAuthentication(enabled=");
            sb.append(this.a);
            sb.append(", performed=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.b, ')');
        }
    }

    @Serializable
    public final class NfcSessionInfo extends SessionInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final NfcChipAuthentication f;
        public final List g;
        public final List h;
        public final Boolean i;
        public final long j;
        public final Integer k;
        public final String l;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$NfcSessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$NfcSessionInfo$$serializer.INSTANCE;
            }
        }

        public NfcSessionInfo(int i, String str, String str2, String str3, String str4, String str5, NfcChipAuthentication nfcChipAuthentication, List list, List list2, Boolean bool, long j, Integer num, String str6) {
            if (512 != (i & 512)) {
                TuplesKt.throwMissingFieldException(i, 512, MibiData$NfcSessionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = nfcChipAuthentication;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = list;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = list2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = bool;
            }
            this.j = j;
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = num;
            }
            this.l = (i & 2048) == 0 ? "NFC" : str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NfcSessionInfo)) {
                return false;
            }
            NfcSessionInfo nfcSessionInfo = (NfcSessionInfo) obj;
            return Intrinsics.areEqual(this.a, nfcSessionInfo.a) && Intrinsics.areEqual(this.b, nfcSessionInfo.b) && Intrinsics.areEqual(this.c, nfcSessionInfo.c) && Intrinsics.areEqual(this.d, nfcSessionInfo.d) && Intrinsics.areEqual(this.e, nfcSessionInfo.e) && Intrinsics.areEqual(this.f, nfcSessionInfo.f) && Intrinsics.areEqual(this.g, nfcSessionInfo.g) && Intrinsics.areEqual(this.h, nfcSessionInfo.h) && Intrinsics.areEqual(this.i, nfcSessionInfo.i) && this.j == nfcSessionInfo.j && Intrinsics.areEqual(this.k, nfcSessionInfo.k);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            NfcChipAuthentication nfcChipAuthentication = this.f;
            int hashCode6 = (hashCode5 + (nfcChipAuthentication == null ? 0 : nfcChipAuthentication.hashCode())) * 31;
            List list = this.g;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.h;
            int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool = this.i;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.j);
            Integer num = this.k;
            return m + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "NfcSessionInfo(documentCode=" + this.a + ", issuingCountry=" + this.b + ", nationality=" + this.c + ", issueDate=" + this.d + ", unlock=" + this.e + ", ca=" + this.f + ", warnings=" + this.g + ", dgs=" + this.h + ", optionalDataRedacted=" + this.i + ", totalDuration=" + this.j + ", tries=" + this.k + ')';
        }
    }

    public final class Session {
        public final Integer a;

        public Session(int i, Integer num) {
            switch (i) {
                case 1:
                    this.a = num;
                    break;
                default:
                    this.a = num;
                    Uxp uxp = MibiData.a;
                    MiSnapSettings miSnapSettings = MibiData.g;
                    if (miSnapSettings != null) {
                        miSnapSettings.m2165clone();
                        break;
                    }
                    break;
            }
        }

        public void addSessionInfo(SessionInfo sessionInfo) {
            if (isCurrentSession()) {
                MibiData.e.add(sessionInfo);
            }
        }

        public void addUxpEvent(String str, String... strArr) {
            if (isCurrentSession()) {
                Uxp uxp = MibiData.a;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                synchronized (MibiData.l) {
                    MibiData.a.addEvent(str, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                }
            }
        }

        public MetaData getMetaData() {
            if (isCurrentSession()) {
                Uxp uxp = MibiData.a;
                return MibiData.b;
            }
            Uxp uxp2 = MibiData.a;
            MetaData metaData = MibiData.b;
            long j = metaData.a;
            int i = metaData.b;
            int i2 = metaData.c;
            int i3 = metaData.d;
            int i4 = metaData.e;
            metaData.getClass();
            return new MetaData(i, i2, i3, i4, j);
        }

        public boolean isCurrentSession() {
            Uxp uxp = MibiData.a;
            return Intrinsics.areEqual(this.a, MibiData.j);
        }

        public void setErrorSessionInfo(SessionInfo sessionInfo, SessionInfo... sessionInfoArr) {
            if (isCurrentSession()) {
                Uxp uxp = MibiData.a;
                SessionInfo[] sessionInfoArr2 = (SessionInfo[]) Arrays.copyOf(sessionInfoArr, sessionInfoArr.length);
                HashMap hashMap = MibiData.f;
                String name = sessionInfo.getClass().getName();
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(sessionInfo);
                listOf.getClass();
                ArrayList arrayList = new ArrayList(listOf.size() + sessionInfoArr2.length);
                arrayList.addAll(listOf);
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, sessionInfoArr2);
                hashMap.put(name, arrayList);
            }
        }
    }

    @Serializable(with = SessionInfoSerializer.class)
    public abstract class SessionInfo {
        public static final Companion Companion = new Companion();

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$SessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$SessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SessionInfoSerializer.INSTANCE;
            }
        }
    }

    public final class SessionInfoSerializer extends KeyValueSerializer {
        public static final SessionInfoSerializer INSTANCE = new SessionInfoSerializer(Reflection.factory.getOrCreateKotlinClass(SessionInfo.class));

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public static KSerializer getSerializer(String str) {
            switch (str.hashCode()) {
                case 77195:
                    if (str.equals("NFC")) {
                        return NfcSessionInfo.Companion.serializer();
                    }
                    break;
                case 2181757:
                    if (str.equals("Face")) {
                        return FaceSessionInfo.Companion.serializer();
                    }
                    break;
                case 82833682:
                    if (str.equals("Voice")) {
                        return VoiceSessionInfo.Companion.serializer();
                    }
                    break;
                case 926364987:
                    if (str.equals("Document")) {
                        return DocumentSessionInfo.Companion.serializer();
                    }
                    break;
                case 1331069024:
                    if (str.equals("Barcode")) {
                        return BarcodeSessionInfo.Companion.serializer();
                    }
                    break;
            }
            return SessionInfo.Companion.serializer();
        }

        @Override // kotlinx.serialization.internal.KeyValueSerializer
        public final KSerializer selectDeserializer(JsonElement jsonElement) {
            jsonElement.getClass();
            return JsonElementKt.getJsonObject(jsonElement).containsKey("Document") ? getSerializer("Document") : JsonElementKt.getJsonObject(jsonElement).containsKey("Barcode") ? getSerializer("Barcode") : JsonElementKt.getJsonObject(jsonElement).containsKey("Face") ? getSerializer("Face") : JsonElementKt.getJsonObject(jsonElement).containsKey("NFC") ? getSerializer("NFC") : getSerializer("");
        }
    }

    @Serializable
    public final class VoiceSessionInfo extends SessionInfo {
        public static final Companion Companion = new Companion();
        public final Flow a;
        public final Float b;
        public final Integer c;
        public final List d;
        public final long e;
        public final Integer f;
        public final String g;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$VoiceSessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$VoiceSessionInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Flow {
            public static final /* synthetic */ Flow[] a = {new Flow("Enrollment", 0), new Flow("Verification", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            Flow EF5;

            public static Flow valueOf(String str) {
                return (Flow) Enum.valueOf(Flow.class, str);
            }

            public static Flow[] values() {
                return (Flow[]) a.clone();
            }
        }

        public VoiceSessionInfo(int i, Flow flow, Float f, Integer num, List list, long j, Integer num2, String str) {
            if (16 != (i & 16)) {
                TuplesKt.throwMissingFieldException(i, 16, MibiData$VoiceSessionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = flow;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = f;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = list;
            }
            this.e = j;
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = num2;
            }
            if ((i & 64) == 0) {
                this.g = "Voice";
            } else {
                this.g = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceSessionInfo)) {
                return false;
            }
            VoiceSessionInfo voiceSessionInfo = (VoiceSessionInfo) obj;
            return this.a == voiceSessionInfo.a && Intrinsics.areEqual((Object) this.b, (Object) voiceSessionInfo.b) && Intrinsics.areEqual(this.c, voiceSessionInfo.c) && Intrinsics.areEqual(this.d, voiceSessionInfo.d) && this.e == voiceSessionInfo.e && Intrinsics.areEqual(this.f, voiceSessionInfo.f);
        }

        public final int hashCode() {
            Flow flow = this.a;
            int hashCode = (flow == null ? 0 : flow.hashCode()) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            List list = this.d;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
            Integer num2 = this.f;
            return m + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "VoiceSessionInfo(flow=" + this.a + ", snr=" + this.b + ", speechDuration=" + this.c + ", warnings=" + this.d + ", totalDuration=" + this.e + ", tries=" + this.f + ')';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a() {
        StringBuilder sb;
        List<String> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.miteksystems.misnap.barcode.BarcodeAnalysisModuleInfo", "com.miteksystems.misnap.camera.CameraModuleInfo", "com.miteksystems.misnap.classifier.DocumentClassifierModuleInfo", "com.miteksystems.misnap.controller.ControllersModuleInfo", "com.miteksystems.misnap.detector.FeatureDetectorModuleInfo", "com.miteksystems.misnap.document.DocumentAnalysisModuleInfo", "com.miteksystems.misnap.face.FaceAnalysisModuleInfo", "com.miteksystems.misnap.nfc.NfcModuleInfo", "com.miteksystems.misnap.voice.VoiceProcessorModuleInfo", "com.miteksystems.misnap.workflow.WorkflowsModuleInfo"});
        ArrayList arrayList = new ArrayList();
        CoreModuleInfo coreModuleInfo = new CoreModuleInfo();
        arrayList.add(new SdkInfo.Module(coreModuleInfo.getName(), coreModuleInfo.getVersion()));
        for (String str : listOf) {
            ModuleInfo moduleInfo = null;
            try {
                Constructor<?>[] declaredConstructors = Class.forName(str).getDeclaredConstructors();
                declaredConstructors.getClass();
                Object newInstance = ((Constructor) ArraysKt___ArraysKt.first(declaredConstructors)).newInstance(null);
                if (newInstance instanceof ModuleInfo) {
                    moduleInfo = (ModuleInfo) newInstance;
                }
            } catch (ClassCastException unused) {
                sb = new StringBuilder("Unable to cast class ");
                sb.append(str);
                Log.e("MibiData", sb.toString());
                if (moduleInfo != null) {
                }
            } catch (ClassNotFoundException unused2) {
                sb = new StringBuilder("Unable to find class ");
                sb.append(str);
                Log.e("MibiData", sb.toString());
                if (moduleInfo != null) {
                }
            }
            if (moduleInfo != null) {
                arrayList.add(new SdkInfo.Module(moduleInfo.getName(), moduleInfo.getVersion()));
            }
        }
        return arrayList;
    }

    public static Session bindSession() {
        return new Session(0, j);
    }

    public static final void releaseSession(String str) {
        if (Intrinsics.areEqual(i, str)) {
            i = null;
            j = null;
        }
    }

    public static void reset$core_release(boolean z) {
        synchronized (l) {
            try {
                if (z) {
                    c = null;
                    h = null;
                    e.clear();
                    f.clear();
                } else {
                    c = null;
                    g = null;
                    h = null;
                    b = new MetaData(System.currentTimeMillis());
                    e.clear();
                    f.clear();
                    Uxp uxp = a;
                    uxp.a.clear();
                    uxp.b = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean startSession(MiSnapSettings miSnapSettings, String str) {
        int random;
        miSnapSettings.getClass();
        if (i == null) {
            i = str;
            IntRange intRange = new IntRange(0, 100000000, 1);
            while (true) {
                random = RangesKt___RangesKt.random(intRange, Random.Default);
                Integer num = j;
                if (num != null && random == num.intValue()) {
                    intRange = new IntRange(0, 100000000, 1);
                }
            }
            j = Integer.valueOf(random);
        }
        if (Intrinsics.areEqual(i, str)) {
            reset$core_release(false);
            g = miSnapSettings.m2165clone();
        }
        return Intrinsics.areEqual(i, str);
    }

    public static final String toJsonString(Context context) {
        String encodeToString;
        context.getClass();
        synchronized (l) {
            try {
                JsonImpl jsonImpl = k;
                Build.MANUFACTURER.getClass();
                Build.DEVICE.getClass();
                Build.MODEL.getClass();
                Build.VERSION.RELEASE.getClass();
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (string2 == null) {
                    string2 = "";
                }
                DeviceInfo deviceInfo = new DeviceInfo(string2);
                ArrayList a2 = a();
                MiSnapSettings miSnapSettings = g;
                SdkInfo sdkInfo = new SdkInfo(a2, miSnapSettings != null ? a(miSnapSettings) : null);
                PlatformPrivate platformPrivate = new PlatformPrivate(a, g, h, c);
                ArrayList arrayList = e;
                if (arrayList.isEmpty()) {
                    HashMap hashMap = f;
                    if (!hashMap.isEmpty()) {
                        arrayList = new ArrayList();
                        Iterator it = hashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Map.Entry) it.next()).getValue(), arrayList);
                        }
                    }
                }
                Mibi mibi = new Mibi(deviceInfo, sdkInfo, platformPrivate, arrayList);
                jsonImpl.getClass();
                encodeToString = jsonImpl.encodeToString(Mibi.Companion.serializer(), mibi);
            } catch (Throwable th) {
                throw th;
            }
        }
        return encodeToString;
    }

    public static final MiSnapMibiData toMiSnapMibiData(Context context) {
        MiSnapMibiData miSnapMibiData;
        context.getClass();
        synchronized (m) {
            try {
                String jsonString = toJsonString(context);
                Build.MANUFACTURER.getClass();
                Build.DEVICE.getClass();
                Build.MODEL.getClass();
                Build.VERSION.RELEASE.getClass();
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (string2 == null) {
                    string2 = "";
                }
                DeviceInfo deviceInfo = new DeviceInfo(string2);
                ArrayList arrayList = e;
                if (arrayList.isEmpty()) {
                    HashMap hashMap = f;
                    if (!hashMap.isEmpty()) {
                        arrayList = new ArrayList();
                        Iterator it = hashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Map.Entry) it.next()).getValue(), arrayList);
                        }
                    }
                }
                miSnapMibiData = new MiSnapMibiData(jsonString, deviceInfo, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return miSnapMibiData;
    }

    public final class MetaData {
        public final long a;
        public int b;
        public int c;
        public final int d;
        public int e;

        public MetaData(int i, int i2, int i3, int i4, long j) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.a == metaData.a && this.b == metaData.b && this.c == metaData.c && this.d == metaData.d && this.e == metaData.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.d, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.c, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MetaData(sessionStartTime=");
            sb.append(this.a);
            sb.append(", autoTries=");
            sb.append(this.b);
            sb.append(", manualTries=");
            sb.append(this.c);
            sb.append(", nfcTries=");
            sb.append(this.d);
            sb.append(", voiceTries=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.e, ')');
        }

        public /* synthetic */ MetaData(long j) {
            this(0, 0, 0, 0, j);
        }
    }

    @Serializable
    public final class SdkInfo {
        public static final Companion Companion = new Companion();
        public final List a;
        public final License b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$SdkInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$SdkInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$SdkInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SdkInfo(int i, List list, License license) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, MibiData$SdkInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = list;
            this.b = license;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SdkInfo)) {
                return false;
            }
            SdkInfo sdkInfo = (SdkInfo) obj;
            return Intrinsics.areEqual(this.a, sdkInfo.a) && Intrinsics.areEqual(this.b, sdkInfo.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            License license = this.b;
            return hashCode + (license == null ? 0 : license.hashCode());
        }

        public final String toString() {
            return "SdkInfo(modules=" + this.a + ", license=" + this.b + ')';
        }

        @Serializable
        public final class License {
            public static final Companion Companion = new Companion();
            public final String a;
            public final String b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$SdkInfo$License$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$SdkInfo$License;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MibiData$SdkInfo$License$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ License(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    TuplesKt.throwMissingFieldException(i, 3, MibiData$SdkInfo$License$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof License)) {
                    return false;
                }
                License license = (License) obj;
                return Intrinsics.areEqual(this.a, license.a) && Intrinsics.areEqual(this.b, license.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("License(gpo=");
                sb.append(this.a);
                sb.append(", expiryDate=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
            }

            public License(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }
        }

        @Serializable
        public final class Module {
            public static final Companion Companion = new Companion();
            public final String a;
            public final String b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$SdkInfo$Module$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$SdkInfo$Module;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MibiData$SdkInfo$Module$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Module(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    TuplesKt.throwMissingFieldException(i, 3, MibiData$SdkInfo$Module$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Module)) {
                    return false;
                }
                Module module = (Module) obj;
                return Intrinsics.areEqual(this.a, module.a) && Intrinsics.areEqual(this.b, module.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Module(name=");
                sb.append(this.a);
                sb.append(", version=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
            }

            public Module(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }
        }

        public SdkInfo(ArrayList arrayList, License license) {
            this.a = arrayList;
            this.b = license;
        }
    }

    @Serializable
    public final class Uxp {
        public static final Companion Companion = new Companion();
        public final ArrayList a;
        public long b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$Uxp$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$Uxp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$Uxp$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Uxp(int i, ArrayList arrayList) {
            if ((i & 1) == 0) {
                this.a = new ArrayList();
            } else {
                this.a = arrayList;
            }
            this.b = System.currentTimeMillis();
        }

        public final void addEvent(String str, String... strArr) {
            Headers.Builder builder = new Headers.Builder(3);
            builder.add(str);
            builder.add(String.valueOf(System.currentTimeMillis() - this.b));
            builder.addSpread(strArr);
            ArrayList arrayList = builder.namesAndValues;
            this.a.add(CollectionsKt__CollectionsKt.listOf(arrayList.toArray(new String[arrayList.size()])));
        }

        public Uxp() {
            this.a = new ArrayList();
            this.b = System.currentTimeMillis();
        }
    }

    @Serializable
    public final class DeviceInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$DeviceInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$DeviceInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$DeviceInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DeviceInfo(int i, String str, String str2, String str3, String str4, String str5) {
            if (31 != (i & 31)) {
                TuplesKt.throwMissingFieldException(i, 31, MibiData$DeviceInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return Intrinsics.areEqual(this.a, deviceInfo.a) && Intrinsics.areEqual(this.b, deviceInfo.b) && Intrinsics.areEqual(this.c, deviceInfo.c) && Intrinsics.areEqual(this.d, deviceInfo.d) && Intrinsics.areEqual(this.e, deviceInfo.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
            sb.append(this.a);
            sb.append(", device=");
            sb.append(this.b);
            sb.append(", model=");
            sb.append(this.c);
            sb.append(", os=");
            sb.append(this.d);
            sb.append(", id=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.e, ')');
        }

        public DeviceInfo(String str) {
            String str2 = Build.MANUFACTURER;
            String str3 = Build.DEVICE;
            String str4 = Build.MODEL;
            String str5 = Build.VERSION.RELEASE;
            Request$Priority$EnumUnboxingLocalUtility.m(str2, str3, str4, str5);
            this.a = str2;
            this.b = str3;
            this.c = str4;
            this.d = str5;
            this.e = str;
        }
    }

    @Serializable
    public final class Mibi {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final DeviceInfo c;
        public final SdkInfo d;
        public final PlatformPrivate e;
        public final List f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$Mibi$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$Mibi;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$Mibi$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Mibi(int i, String str, String str2, DeviceInfo deviceInfo, SdkInfo sdkInfo, PlatformPrivate platformPrivate, List list) {
            if (63 != (i & 63)) {
                TuplesKt.throwMissingFieldException(i, 63, MibiData$Mibi$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = deviceInfo;
            this.d = sdkInfo;
            this.e = platformPrivate;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mibi)) {
                return false;
            }
            Mibi mibi = (Mibi) obj;
            return Intrinsics.areEqual(this.a, mibi.a) && Intrinsics.areEqual(this.b, mibi.b) && Intrinsics.areEqual(this.c, mibi.c) && Intrinsics.areEqual(this.d, mibi.d) && Intrinsics.areEqual(this.e, mibi.e) && Intrinsics.areEqual(this.f, mibi.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Mibi(mibiVersion=");
            sb.append(this.a);
            sb.append(", platform=");
            sb.append(this.b);
            sb.append(", deviceInfo=");
            sb.append(this.c);
            sb.append(", sdkInfo=");
            sb.append(this.d);
            sb.append(", platformPrivate=");
            sb.append(this.e);
            sb.append(", sessionInfo=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.f, ')');
        }

        public Mibi(DeviceInfo deviceInfo, SdkInfo sdkInfo, PlatformPrivate platformPrivate, ArrayList arrayList) {
            this.a = "2.3";
            this.b = "Android";
            this.c = deviceInfo;
            this.d = sdkInfo;
            this.e = platformPrivate;
            this.f = arrayList;
        }
    }

    @Serializable
    public final class PlatformPrivate {
        public static final Companion Companion = new Companion();
        public final Uxp a;
        public final MiSnapSettings b;
        public final MiSnapSettings c;
        public final MiSnapCameraInfo d;
        public final MicrophoneInfo e;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$PlatformPrivate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$PlatformPrivate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$PlatformPrivate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PlatformPrivate(int i, Uxp uxp, MiSnapSettings miSnapSettings, MiSnapSettings miSnapSettings2, MiSnapCameraInfo miSnapCameraInfo, MicrophoneInfo microphoneInfo) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, MibiData$PlatformPrivate$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = uxp;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = miSnapSettings;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = miSnapSettings2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = miSnapCameraInfo;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = microphoneInfo;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformPrivate)) {
                return false;
            }
            PlatformPrivate platformPrivate = (PlatformPrivate) obj;
            return Intrinsics.areEqual(this.a, platformPrivate.a) && Intrinsics.areEqual(this.b, platformPrivate.b) && Intrinsics.areEqual(this.c, platformPrivate.c) && Intrinsics.areEqual(this.d, platformPrivate.d) && Intrinsics.areEqual(this.e, platformPrivate.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            MiSnapSettings miSnapSettings = this.b;
            int hashCode2 = (hashCode + (miSnapSettings == null ? 0 : miSnapSettings.hashCode())) * 31;
            MiSnapSettings miSnapSettings2 = this.c;
            int hashCode3 = (hashCode2 + (miSnapSettings2 == null ? 0 : miSnapSettings2.hashCode())) * 31;
            MiSnapCameraInfo miSnapCameraInfo = this.d;
            int hashCode4 = (hashCode3 + (miSnapCameraInfo == null ? 0 : miSnapCameraInfo.hashCode())) * 31;
            MicrophoneInfo microphoneInfo = this.e;
            return hashCode4 + (microphoneInfo != null ? microphoneInfo.hashCode() : 0);
        }

        public final String toString() {
            return "PlatformPrivate(uxp=" + this.a + ", originalSettings=" + this.b + ", finalSettings=" + this.c + ", cameraInfo=" + this.d + ", microphoneInfo=" + this.e + ')';
        }

        public PlatformPrivate(Uxp uxp, MiSnapSettings miSnapSettings, MiSnapSettings miSnapSettings2, MiSnapCameraInfo miSnapCameraInfo) {
            uxp.getClass();
            this.a = uxp;
            this.b = miSnapSettings;
            this.c = miSnapSettings2;
            this.d = miSnapCameraInfo;
            this.e = null;
        }
    }

    @Serializable
    public final class BarcodeSessionInfo extends SessionInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final String c;
        public final Integer d;
        public final long e;
        public final Integer f;
        public final Integer g;
        public final String h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$BarcodeSessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$BarcodeSessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$BarcodeSessionInfo$$serializer.INSTANCE;
            }
        }

        public BarcodeSessionInfo(int i, String str, String str2, String str3, Integer num, long j, Integer num2, Integer num3, String str4) {
            if (16 != (i & 16)) {
                TuplesKt.throwMissingFieldException(i, 16, MibiData$BarcodeSessionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            this.e = j;
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = num2;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num3;
            }
            if ((i & 128) == 0) {
                this.h = "Barcode";
            } else {
                this.h = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeSessionInfo)) {
                return false;
            }
            BarcodeSessionInfo barcodeSessionInfo = (BarcodeSessionInfo) obj;
            return Intrinsics.areEqual(this.a, barcodeSessionInfo.a) && Intrinsics.areEqual(this.b, barcodeSessionInfo.b) && Intrinsics.areEqual(this.c, barcodeSessionInfo.c) && Intrinsics.areEqual(this.d, barcodeSessionInfo.d) && this.e == barcodeSessionInfo.e && Intrinsics.areEqual(this.f, barcodeSessionInfo.f) && Intrinsics.areEqual(this.g, barcodeSessionInfo.g);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.d;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
            Integer num2 = this.f;
            int hashCode4 = (m + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.g;
            return hashCode4 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            return "BarcodeSessionInfo(barcodeType=" + this.a + ", deviceOrientation=" + this.b + ", documentOrientation=" + this.c + ", jpegQuality=" + this.d + ", totalDuration=" + this.e + ", autoTries=" + this.f + ", manualTries=" + this.g + ')';
        }

        public BarcodeSessionInfo(String str, String str2, String str3, Integer num, long j, Integer num2, Integer num3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = num;
            this.e = j;
            this.f = num2;
            this.g = num3;
            this.h = "Barcode";
        }
    }

    @Serializable
    public final class FaceSessionInfo extends SessionInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final Boolean b;
        public final String c;
        public final List d;
        public final Integer e;
        public final long f;
        public final Integer g;
        public final Integer h;
        public final String i;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$FaceSessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$FaceSessionInfo$$serializer.INSTANCE;
            }
        }

        public FaceSessionInfo(int i, String str, Boolean bool, String str2, List list, Integer num, long j, Integer num2, Integer num3, String str3) {
            if (32 != (i & 32)) {
                TuplesKt.throwMissingFieldException(i, 32, MibiData$FaceSessionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num;
            }
            this.f = j;
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = num3;
            }
            if ((i & 256) == 0) {
                this.i = "Face";
            } else {
                this.i = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FaceSessionInfo)) {
                return false;
            }
            FaceSessionInfo faceSessionInfo = (FaceSessionInfo) obj;
            return Intrinsics.areEqual(this.a, faceSessionInfo.a) && Intrinsics.areEqual(this.b, faceSessionInfo.b) && Intrinsics.areEqual(this.c, faceSessionInfo.c) && Intrinsics.areEqual(this.d, faceSessionInfo.d) && Intrinsics.areEqual(this.e, faceSessionInfo.e) && this.f == faceSessionInfo.f && Intrinsics.areEqual(this.g, faceSessionInfo.g) && Intrinsics.areEqual(this.h, faceSessionInfo.h);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.d;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.e;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
            Integer num2 = this.g;
            int hashCode5 = (m + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.h;
            return hashCode5 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            return "FaceSessionInfo(mode=" + this.a + ", smile=" + this.b + ", deviceOrientation=" + this.c + ", warnings=" + this.d + ", jpegQuality=" + this.e + ", totalDuration=" + this.f + ", autoTries=" + this.g + ", manualTries=" + this.h + ')';
        }

        public FaceSessionInfo(String str, Boolean bool, String str2, ArrayList arrayList, Integer num, long j, Integer num2, Integer num3) {
            this.a = str;
            this.b = bool;
            this.c = str2;
            this.d = arrayList;
            this.e = num;
            this.f = j;
            this.g = num2;
            this.h = num3;
            this.i = "Face";
        }
    }

    public static SdkInfo.License a(MiSnapSettings miSnapSettings) {
        try {
            byte[] decode = Base64.decode(miSnapSettings.b, 0);
            decode.getClass();
            JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8)).getJSONObject("signed");
            String string2 = jSONObject.getString("gpo");
            String string3 = jSONObject.getString("expiry");
            if (string2 != null && !StringsKt.isBlank(string2) && string3 != null && !StringsKt.isBlank(string3)) {
                return new SdkInfo.License(string2, string3);
            }
            return null;
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    @Serializable
    public final class DocumentSessionInfo extends SessionInfo {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final Boolean c;
        public final Boolean d;
        public final Boolean e;
        public final String f;
        public final int[][] g;
        public final String h;
        public final String i;
        public final List j;
        public final Integer k;
        public final long l;
        public final Integer m;
        public final Integer n;
        public final Boolean o;
        public final String p;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MibiData$DocumentSessionInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MibiData$DocumentSessionInfo$$serializer.INSTANCE;
            }
        }

        public DocumentSessionInfo(int i, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, int[][] iArr, String str4, String str5, List list, Integer num, long j, Integer num2, Integer num3, Boolean bool4, String str6) {
            if (2048 != (i & 2048)) {
                TuplesKt.throwMissingFieldException(i, 2048, MibiData$DocumentSessionInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bool2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = iArr;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str4;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str5;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = list;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = num;
            }
            this.l = j;
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = num2;
            }
            if ((i & PKIFailureInfo.certRevoked) == 0) {
                this.n = null;
            } else {
                this.n = num3;
            }
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = bool4;
            }
            this.p = (i & 32768) == 0 ? "Document" : str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentSessionInfo)) {
                return false;
            }
            DocumentSessionInfo documentSessionInfo = (DocumentSessionInfo) obj;
            return Intrinsics.areEqual(this.a, documentSessionInfo.a) && Intrinsics.areEqual(this.b, documentSessionInfo.b) && Intrinsics.areEqual(this.c, documentSessionInfo.c) && Intrinsics.areEqual(this.d, documentSessionInfo.d) && Intrinsics.areEqual(this.e, documentSessionInfo.e) && Intrinsics.areEqual(this.f, documentSessionInfo.f) && Intrinsics.areEqual(this.g, documentSessionInfo.g) && Intrinsics.areEqual(this.h, documentSessionInfo.h) && Intrinsics.areEqual(this.i, documentSessionInfo.i) && Intrinsics.areEqual(this.j, documentSessionInfo.j) && Intrinsics.areEqual(this.k, documentSessionInfo.k) && this.l == documentSessionInfo.l && Intrinsics.areEqual(this.m, documentSessionInfo.m) && Intrinsics.areEqual(this.n, documentSessionInfo.n) && Intrinsics.areEqual(this.o, documentSessionInfo.o);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.c;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.d;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.e;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            int[][] iArr = this.g;
            int hashCode7 = (hashCode6 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
            String str4 = this.h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List list = this.j;
            int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.k;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (num == null ? 0 : num.hashCode())) * 31, 31, this.l);
            Integer num2 = this.m;
            int hashCode11 = (m + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.n;
            int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool4 = this.o;
            return hashCode12 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final String toString() {
            return "DocumentSessionInfo(docType=" + this.a + ", classificationType=" + this.b + ", mrzExtracted=" + this.c + ", optionalDataRedacted=" + this.d + ", enhancedManual=" + this.e + ", mode=" + this.f + ", fourCorners=" + Arrays.toString(this.g) + ", deviceOrientation=" + this.h + ", documentOrientation=" + this.i + ", warnings=" + this.j + ", jpegQuality=" + this.k + ", totalDuration=" + this.l + ", autoTries=" + this.m + ", manualTries=" + this.n + ", iqasRequired=" + this.o + ')';
        }

        public DocumentSessionInfo(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, int[][] iArr, String str4, String str5, ArrayList arrayList, Integer num, long j, Integer num2, Integer num3, Boolean bool4) {
            this.a = str;
            this.b = str2;
            this.c = bool;
            this.d = bool2;
            this.e = bool3;
            this.f = str3;
            this.g = iArr;
            this.h = str4;
            this.i = str5;
            this.j = arrayList;
            this.k = num;
            this.l = j;
            this.m = num2;
            this.n = num3;
            this.o = bool4;
            this.p = "Document";
        }

        public /* synthetic */ DocumentSessionInfo(String str, Boolean bool, String str2, String str3, Integer num, long j, Integer num2, Integer num3) {
            this(str, null, null, null, bool, null, null, str2, str3, null, num, j, num2, num3, null);
        }
    }
}
