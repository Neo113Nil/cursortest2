package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class r8 implements Parcelable {
    public static final c CREATOR = new c();
    public static final r8 e = new r8("unknown", "unknown", "unknown");
    public final String a;
    public final String b;
    public final String c;
    public final Lazy d;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("workflowId", false);
            pluginGeneratedSerialDescriptor.addElement("paneRenderingId", false);
            pluginGeneratedSerialDescriptor.addElement("paneNodeId", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                } else if (decodeElementIndex == 1) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new r8(i, str, str2, str3);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            r8 r8Var = (r8) obj;
            encoder.getClass();
            r8Var.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, r8Var.a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, r8Var.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, r8Var.c);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Recorder$$ExternalSyntheticOutline2.m(r8.this.b(), ":", r8.this.a());
        }
    }

    public static final class c implements Parcelable.Creator<r8> {
        public static r8 a(Pane$PaneRendering pane$PaneRendering, String str) {
            pane$PaneRendering.getClass();
            str.getClass();
            String id = pane$PaneRendering.getId();
            id.getClass();
            String paneNodeId = pane$PaneRendering.getPaneNodeId();
            paneNodeId.getClass();
            return new r8(str, id, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public final r8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.getClass();
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            readString2.getClass();
            String readString3 = parcel.readString();
            readString3.getClass();
            return new r8(readString, readString2, readString3);
        }

        @Override // android.os.Parcelable.Creator
        public final r8[] newArray(int i) {
            return new r8[i];
        }
    }

    @Deprecated
    public r8(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = LazyKt.lazy(new b());
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return Intrinsics.areEqual(this.a, r8Var.a) && Intrinsics.areEqual(this.b, r8Var.b) && Intrinsics.areEqual(this.c, r8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C0322x.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WorkflowPaneId(workflowId=", str, ", paneRenderingId=", str2, ", paneNodeId="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public r8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = LazyKt.lazy(new b());
    }
}
