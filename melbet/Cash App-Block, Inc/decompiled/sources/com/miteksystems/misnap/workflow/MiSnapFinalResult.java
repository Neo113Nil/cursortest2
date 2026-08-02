package com.miteksystems.misnap.workflow;

import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.MiSnapMibiData;
import com.miteksystems.misnap.core.MiSnapMibiData$$serializer;
import com.miteksystems.misnap.nfc.MiSnapNfcReader;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public abstract class MiSnapFinalResult {
    public static final Companion Companion = new Companion();
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$1);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) MiSnapFinalResult.a.getValue();
        }
    }

    @Serializable
    public final class NfcSession extends MiSnapFinalResult {
        public static final Companion Companion = new Companion();
        public final MiSnapNfcReader.ChipData b;
        public final MiSnapMibiData c;
        public final boolean d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapFinalResult$NfcSession$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NfcSession(int i, MiSnapNfcReader.ChipData chipData, MiSnapMibiData miSnapMibiData, boolean z) {
            if (7 != (i & 7)) {
                TuplesKt.throwMissingFieldException(i, 7, MiSnapFinalResult$NfcSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.b = chipData;
            this.c = miSnapMibiData;
            this.d = z;
        }

        public static final void write$Self(NfcSession nfcSession, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            nfcSession.getClass();
            compositeEncoder.getClass();
            serialDescriptor.getClass();
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, MiSnapNfcReader.ChipData.Companion.serializer(), nfcSession.b);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, MiSnapMibiData$$serializer.INSTANCE, nfcSession.c);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, nfcSession.d);
        }

        public NfcSession(MiSnapNfcReader.ChipData chipData, MiSnapMibiData miSnapMibiData, boolean z) {
            chipData.getClass();
            miSnapMibiData.getClass();
            this.b = chipData;
            this.c = miSnapMibiData;
            this.d = z;
        }
    }

    @Serializable
    public final class VoiceSession extends MiSnapFinalResult {
        public static final Companion Companion = new Companion();
        public final List b;
        public final String c;
        public final List d;
        public final boolean e;
        public final List f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapFinalResult$VoiceSession$$serializer.INSTANCE;
            }
        }

        public VoiceSession(int i, List list, String str, List list2, boolean z, List list3) {
            if (15 != (i & 15)) {
                TuplesKt.throwMissingFieldException(i, 15, MiSnapFinalResult$VoiceSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.b = list;
            this.c = str;
            this.d = list2;
            this.e = z;
            if ((i & 16) == 0) {
                this.f = EmptyList.INSTANCE;
            } else {
                this.f = list3;
            }
        }

        public VoiceSession(ArrayList arrayList, String str, ArrayList arrayList2, boolean z, ArrayList arrayList3) {
            str.getClass();
            this.b = arrayList;
            this.c = str;
            this.d = arrayList2;
            this.e = z;
            this.f = arrayList3;
        }
    }

    @Serializable
    public final class DocumentSession extends MiSnapFinalResult {
        public static final Companion Companion = new Companion();
        public final byte[] b;
        public final byte[] c;
        public final DocumentExtraction d;
        public final DocumentClassification e;
        public final Barcode f;
        public final List g;
        public final MiSnapMibiData h;
        public final boolean i;
        public final String j;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapFinalResult$DocumentSession$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DocumentSession(int i, byte[] bArr, byte[] bArr2, DocumentExtraction documentExtraction, DocumentClassification documentClassification, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
            if (253 != (i & EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE)) {
                TuplesKt.throwMissingFieldException(i, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, MiSnapFinalResult$DocumentSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.b = bArr;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = bArr2;
            }
            this.d = documentExtraction;
            this.e = documentClassification;
            this.f = barcode;
            this.g = list;
            this.h = miSnapMibiData;
            this.i = z;
            if ((i & 256) == 0) {
                this.j = null;
            } else {
                this.j = str;
            }
        }

        public DocumentSession(byte[] bArr, byte[] bArr2, DocumentExtraction documentExtraction, DocumentClassification documentClassification, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
            bArr.getClass();
            list.getClass();
            this.b = bArr;
            this.c = bArr2;
            this.d = documentExtraction;
            this.e = documentClassification;
            this.f = barcode;
            this.g = list;
            this.h = miSnapMibiData;
            this.i = z;
            this.j = str;
        }
    }

    @Serializable
    public final class BarcodeSession extends MiSnapFinalResult {
        public static final Companion Companion = new Companion();
        public final byte[] b;
        public final byte[] c;
        public final Barcode d;
        public final List e;
        public final MiSnapMibiData f;
        public final boolean g;
        public final String h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BarcodeSession(int i, byte[] bArr, byte[] bArr2, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
            if (57 != (i & 57)) {
                TuplesKt.throwMissingFieldException(i, 57, MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.b = bArr;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = bArr2;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = barcode;
            }
            this.e = list;
            this.f = miSnapMibiData;
            this.g = z;
            if ((i & 64) == 0) {
                this.h = null;
            } else {
                this.h = str;
            }
        }

        public BarcodeSession(byte[] bArr, byte[] bArr2, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
            bArr.getClass();
            list.getClass();
            this.b = bArr;
            this.c = bArr2;
            this.d = barcode;
            this.e = list;
            this.f = miSnapMibiData;
            this.g = z;
            this.h = str;
        }
    }

    @Serializable
    public final class FaceSession extends MiSnapFinalResult {
        public static final Companion Companion = new Companion();
        public final byte[] b;
        public final byte[] c;
        public final List d;
        public final MiSnapMibiData e;
        public final boolean f;
        public final String g;
        public final byte[] h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapFinalResult$FaceSession$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ FaceSession(int i, byte[] bArr, byte[] bArr2, List list, MiSnapMibiData miSnapMibiData, boolean z, String str, byte[] bArr3) {
            if (29 != (i & 29)) {
                TuplesKt.throwMissingFieldException(i, 29, MiSnapFinalResult$FaceSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.b = bArr;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = bArr2;
            }
            this.d = list;
            this.e = miSnapMibiData;
            this.f = z;
            if ((i & 32) == 0) {
                this.g = null;
            } else {
                this.g = str;
            }
            if ((i & 64) == 0) {
                this.h = null;
            } else {
                this.h = bArr3;
            }
        }

        public FaceSession(byte[] bArr, byte[] bArr2, ArrayList arrayList, MiSnapMibiData miSnapMibiData, boolean z, String str, byte[] bArr3) {
            bArr.getClass();
            this.b = bArr;
            this.c = bArr2;
            this.d = arrayList;
            this.e = miSnapMibiData;
            this.f = z;
            this.g = str;
            this.h = bArr3;
        }
    }
}
