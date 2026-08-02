package app.cash.zipline;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.internal.SerializersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b$$ExternalSyntheticLambda3;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonImpl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

@Serializable
/* loaded from: classes3.dex */
public final class ZiplineManifest {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String mainFunction;
    public final String mainModuleId;
    public final Map metadata;
    public final Map modules;
    public final Unsigned unsigned;
    public final String version;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/zipline/ZiplineManifest$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/zipline/ZiplineManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static ZiplineManifest decodeJson(String str) {
            if (str.length() > 655360) {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(str.length(), "manifest larger than 655360: "));
                return null;
            }
            JsonImpl jsonImpl = SerializersKt.jsonForManifest;
            jsonImpl.getClass();
            return (ZiplineManifest) jsonImpl.decodeFromString(str, ZiplineManifest.Companion.serializer());
        }

        public final KSerializer serializer() {
            return ZiplineManifest$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class Module {
        public final List dependsOnIds;
        public final ByteString sha256;
        public final String url;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(14))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/zipline/ZiplineManifest$Module$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/zipline/ZiplineManifest$Module;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ZiplineManifest$Module$$serializer.INSTANCE;
            }
        }

        public Module(int i, String str, ByteString byteString, List list) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, ZiplineManifest$Module$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.url = str;
            this.sha256 = byteString;
            if ((i & 4) == 0) {
                this.dependsOnIds = EmptyList.INSTANCE;
            } else {
                this.dependsOnIds = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Module)) {
                return false;
            }
            Module module = (Module) obj;
            return Intrinsics.areEqual(this.url, module.url) && Intrinsics.areEqual(this.sha256, module.sha256) && Intrinsics.areEqual(this.dependsOnIds, module.dependsOnIds);
        }

        public final int hashCode() {
            return this.dependsOnIds.hashCode() + ((this.sha256.hashCode() + (this.url.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Module(url=");
            sb.append(this.url);
            sb.append(", sha256=");
            sb.append(this.sha256);
            sb.append(", dependsOnIds=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.dependsOnIds, ")");
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b$$ExternalSyntheticLambda3(12)), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b$$ExternalSyntheticLambda3(13))};
    }

    public ZiplineManifest(int i, Unsigned unsigned, Map map, String str, String str2, String str3, Map map2) {
        if (4 != (i & 4)) {
            TuplesKt.throwMissingFieldException(i, 4, ZiplineManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.unsigned = (i & 1) == 0 ? new Unsigned() : unsigned;
        if ((i & 2) == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.modules = emptyMap;
        } else {
            this.modules = map;
        }
        this.mainModuleId = str;
        if ((i & 8) == 0) {
            this.mainFunction = null;
        } else {
            this.mainFunction = str2;
        }
        if ((i & 16) == 0) {
            this.version = null;
        } else {
            this.version = str3;
        }
        if ((i & 32) == 0) {
            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
            emptyMap2.getClass();
            this.metadata = emptyMap2;
        } else {
            this.metadata = map2;
        }
        List list = CollectionsKt.toList(this.modules.keySet());
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            String str4 = (String) obj;
            str4.getClass();
            Object obj2 = this.modules.get(str4);
            obj2.getClass();
            List list2 = ((Module) obj2).dependsOnIds;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(it.next())) {
                        a$$ExternalSyntheticBUOutline0.m$3("Modules are not topologically sorted and can not be loaded");
                        throw null;
                    }
                }
            }
            linkedHashSet.add(obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZiplineManifest)) {
            return false;
        }
        ZiplineManifest ziplineManifest = (ZiplineManifest) obj;
        return Intrinsics.areEqual(this.unsigned, ziplineManifest.unsigned) && Intrinsics.areEqual(this.modules, ziplineManifest.modules) && Intrinsics.areEqual(this.mainModuleId, ziplineManifest.mainModuleId) && Intrinsics.areEqual(this.mainFunction, ziplineManifest.mainFunction) && Intrinsics.areEqual(this.version, ziplineManifest.version) && Intrinsics.areEqual(this.metadata, ziplineManifest.metadata);
    }

    public final Map getMetadata() {
        return this.metadata;
    }

    public final Map getSignatures() {
        return this.unsigned.signatures;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.unsigned.hashCode() * 31, this.modules, 31), 31, this.mainModuleId);
        String str = this.mainFunction;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        return this.metadata.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZiplineManifest(unsigned=");
        sb.append(this.unsigned);
        sb.append(", modules=");
        sb.append(this.modules);
        sb.append(", mainModuleId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.mainModuleId, ", mainFunction=", this.mainFunction, ", version=");
        sb.append(this.version);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        return sb.toString();
    }

    @Serializable
    public final class Unsigned {
        public final String baseUrl;
        public final Long freshAtEpochMs;
        public final Map signatures;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(15)), null, null};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/zipline/ZiplineManifest$Unsigned$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/zipline/ZiplineManifest$Unsigned;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ZiplineManifest$Unsigned$$serializer.INSTANCE;
            }
        }

        public Unsigned(int i, Map map, Long l, String str) {
            if ((i & 1) == 0) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            this.signatures = map;
            if ((i & 2) == 0) {
                this.freshAtEpochMs = null;
            } else {
                this.freshAtEpochMs = l;
            }
            if ((i & 4) == 0) {
                this.baseUrl = null;
            } else {
                this.baseUrl = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unsigned)) {
                return false;
            }
            Unsigned unsigned = (Unsigned) obj;
            return Intrinsics.areEqual(this.signatures, unsigned.signatures) && Intrinsics.areEqual(this.freshAtEpochMs, unsigned.freshAtEpochMs) && Intrinsics.areEqual(this.baseUrl, unsigned.baseUrl);
        }

        public final int hashCode() {
            int hashCode = this.signatures.hashCode() * 31;
            Long l = this.freshAtEpochMs;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.baseUrl;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Unsigned(signatures=");
            sb.append(this.signatures);
            sb.append(", freshAtEpochMs=");
            sb.append(this.freshAtEpochMs);
            sb.append(", baseUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.baseUrl, ")");
        }

        public Unsigned() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.signatures = emptyMap;
            this.freshAtEpochMs = null;
            this.baseUrl = null;
        }
    }
}
