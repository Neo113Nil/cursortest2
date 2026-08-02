package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.A;
import com.plaid.internal.EnumC0151d7;
import com.plaid.internal.M0;
import com.plaid.internal.r8;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Polymorphic
@Serializable
/* loaded from: classes5.dex */
public abstract class N2 implements Parcelable {
    public static final Lazy<KSerializer> a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) c.a);

    public static final class c extends Lambda implements Function0<KSerializer> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.plaid.internal.workflow.model.LinkState", reflectionFactory.getOrCreateKotlinClass(N2.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(a.class), reflectionFactory.getOrCreateKotlinClass(b.class), reflectionFactory.getOrCreateKotlinClass(d.class), reflectionFactory.getOrCreateKotlinClass(e.class), reflectionFactory.getOrCreateKotlinClass(i.class), reflectionFactory.getOrCreateKotlinClass(j.class), reflectionFactory.getOrCreateKotlinClass(k.class), reflectionFactory.getOrCreateKotlinClass(l.class)}, new KSerializer[]{a.C0013a.a, b.a.a, d.a.a, e.a.a, i.a.a, new EnumSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.b, new Annotation[0]), k.a.a, l.a.a}, new Annotation[0]);
        }
    }

    public interface f {
        String b();

        List<r8> d();

        r8 e();
    }

    public interface g {
        String a();
    }

    public interface h {
        String c();
    }

    @Serializable
    public static final class j extends N2 {
        public static final Parcelable.Creator<j> CREATOR;
        public static final j b = new j();
        public static final String c = "";
        public static final String d = "";

        public static final class a extends Lambda implements Function0<KSerializer> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new EnumSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.b, new Annotation[0]);
            }
        }

        public static final class b implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return j.b;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i) {
                return new j[i];
            }
        }

        static {
            LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);
            CREATOR = new b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return c;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public N2() {
    }

    public final r8 f() {
        if (this instanceof a) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        if (this instanceof b) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        if (this instanceof l) {
            return ((l) this).f;
        }
        if (this instanceof i) {
            return ((i) this).c;
        }
        if (equals(j.b)) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        if (this instanceof e) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        if (this instanceof k) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        if (this instanceof d) {
            r8.CREATOR.getClass();
            return r8.e;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public abstract String g();

    public abstract String h();

    @Deprecated
    public /* synthetic */ N2(int i2) {
    }

    @Serializable
    public static final class d extends N2 implements h {
        public static final Parcelable.Creator<d> CREATOR = new b();
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.CompleteOutOfProcess", aVar, 4);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("userClosedOutOfProcess", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                boolean z = true;
                int i = 0;
                boolean z2 = false;
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
                    } else if (decodeElementIndex == 2) {
                        str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return null;
                        }
                        z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                        i |= 8;
                    }
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i, str, str2, str3, z2);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                encoder.getClass();
                dVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, dVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, dVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, dVar.d);
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, dVar.e);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public d(int i, String str, String str2, String str3, boolean z) {
            super(0);
            if (15 != (i & 15)) {
                TuplesKt.throwMissingFieldException(i, 15, a.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.c;
        }

        public final boolean i() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public d(String str, String str2, String str3, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }
    }

    @Serializable
    public static final class a extends N2 {
        public static final Parcelable.Creator<a> CREATOR = new b();
        public final M0 b;
        public final String c;
        public final String d;

        @Deprecated
        /* renamed from: com.plaid.internal.N2$a$a, reason: collision with other inner class name */
        public static final class C0013a implements GeneratedSerializer {
            public static final C0013a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                C0013a c0013a = new C0013a();
                a = c0013a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeEmbeddedTransition", c0013a, 3);
                pluginGeneratedSerialDescriptor.addElement("embeddedSessionInfo", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{M0.a.a, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                boolean z = true;
                int i = 0;
                M0 m0 = null;
                String str = null;
                String str2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        m0 = (M0) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, M0.a.a, m0);
                        i |= 1;
                    } else if (decodeElementIndex == 1) {
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return null;
                        }
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i |= 4;
                    }
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new a(i, m0, str, str2);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                a aVar = (a) obj;
                encoder.getClass();
                aVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Parcelable.Creator<a> creator = a.CREATOR;
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, M0.a.a, aVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(aVar.c, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, aVar.c);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(aVar.d, aVar.b.b)) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, aVar.d);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(M0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public a(int i, M0 m0, String str, String str2) {
            super(0);
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, C0013a.b);
                throw null;
            }
            this.b = m0;
            this.c = (i & 2) == 0 ? "" : str;
            if ((i & 4) == 0) {
                this.d = m0.b;
            } else {
                this.d = str2;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.d;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final M0 i() {
            return this.b;
        }

        public final String toString() {
            return "BeforeEmbeddedTransition(embeddedSessionInfo=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.b.writeToParcel(parcel, i);
        }

        public a(M0 m0) {
            m0.getClass();
            this.b = m0;
            this.c = "";
            this.d = m0.b;
        }
    }

    @Serializable
    public static final class l extends N2 implements f, h, g {
        public static final Parcelable.Creator<l> CREATOR = new b();
        public static final KSerializer[] j;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final r8 f;
        public final List<r8> g;
        public final List<r8> h;
        public final String i;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("additionalPanes", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                KSerializer[] kSerializerArr = l.j;
                KSerializer kSerializer = kSerializerArr[5];
                KSerializer kSerializer2 = kSerializerArr[6];
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, r8.a.a, kSerializer, kSerializer2, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer[] kSerializerArr = l.j;
                Object obj = null;
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                r8 r8Var = null;
                List list = null;
                List list2 = null;
                String str5 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            r8Var = (r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, r8.a.a, r8Var);
                            i |= 16;
                            break;
                        case 5:
                            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                            i |= 32;
                            break;
                        case 6:
                            list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list2);
                            i |= 64;
                            break;
                        case 7:
                            str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                            i |= 128;
                            continue;
                        default:
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return obj;
                    }
                    obj = null;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new l(i, str, str2, str3, str4, r8Var, list, list2, str5);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                l lVar = (l) obj;
                encoder.getClass();
                lVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer[] kSerializerArr = l.j;
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, lVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, lVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, lVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, lVar.e);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, r8.a.a, lVar.f);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], lVar.g);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], lVar.h);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, lVar.i);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                r8 r8Var = (r8) parcel.readParcelable(l.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(l.class, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                int i2 = 0;
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(l.class, parcel, arrayList2, i2, 1);
                }
                return new l(readString, readString2, readString3, readString4, r8Var, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        static {
            r8.a aVar = r8.a.a;
            j = new KSerializer[]{null, null, null, null, null, new HashSetSerializer(aVar, 1), new HashSetSerializer(aVar, 1), null};
        }

        public l(String str, String str2, String str3, String str4, r8 r8Var, List<r8> list, List<r8> list2, String str5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            r8Var.getClass();
            list.getClass();
            list2.getClass();
            str5.getClass();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = r8Var;
            this.g = list;
            this.h = list2;
            this.i = str5;
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.e;
        }

        @Override // com.plaid.internal.N2.f
        public final String b() {
            return this.d;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.i;
        }

        @Override // com.plaid.internal.N2.f
        public final List<r8> d() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final r8 e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.b, lVar.b) && Intrinsics.areEqual(this.c, lVar.c) && Intrinsics.areEqual(this.d, lVar.d) && Intrinsics.areEqual(this.e, lVar.e) && Intrinsics.areEqual(this.f, lVar.f) && Intrinsics.areEqual(this.g, lVar.g) && Intrinsics.areEqual(this.h, lVar.h) && Intrinsics.areEqual(this.i, lVar.i);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.c;
        }

        public final int hashCode() {
            return this.i.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.f.hashCode() + C0322x.a(this.e, C0322x.a(this.d, C0322x.a(this.c, this.b.hashCode() * 31, 31), 31), 31)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.d;
            String str4 = this.e;
            r8 r8Var = this.f;
            List<r8> list = this.g;
            List<r8> list2 = this.h;
            String str5 = this.i;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Workflow(linkOpenId=", str, ", workflowId=", str2, ", continuationToken=");
            Boxes$$ExternalSyntheticOutline1.m(m, str3, ", oauthNonce=", str4, ", currentPane=");
            m.append(r8Var);
            m.append(", additionalPanes=");
            m.append(list);
            m.append(", backstack=");
            m.append(list2);
            m.append(", requestId=");
            m.append(str5);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.g, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.h, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeString(this.i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public l(int i, String str, String str2, String str3, String str4, r8 r8Var, List list, List list2, String str5) {
            super(0);
            if (255 == (i & 255)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = r8Var;
                this.g = list;
                this.h = list2;
                this.i = str5;
                return;
            }
            TuplesKt.throwMissingFieldException(i, 255, a.b);
            throw null;
        }
    }

    @Serializable
    public static final class e extends N2 {
        public static final Parcelable.Creator<e> CREATOR = new b();
        public final String b;
        public final LinkExit c;
        public final String d;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer};
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
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return null;
                        }
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                    }
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new e(i, str, str2);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                encoder.getClass();
                eVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, eVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(eVar.d, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, eVar.d);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e(parcel.readString(), LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public e(int i, String str, String str2) {
            super(0);
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, a.b);
                throw null;
            }
            this.b = str;
            LinkExitMetadata a2 = L2.a(31, (String) null);
            a2.getClass();
            this.c = new LinkExit(null, a2);
            if ((i & 2) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.d;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final LinkExit i() {
            return this.c;
        }

        public final String toString() {
            return "Exit(workflowId=" + this.b + ", linkExit=" + this.c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }

        public e(String str, LinkExit linkExit) {
            str.getClass();
            linkExit.getClass();
            this.b = str;
            this.c = linkExit;
            this.d = "";
        }
    }

    @Serializable
    public static final class b extends N2 implements g {
        public static final Parcelable.Creator<b> CREATOR = new C0014b();
        public final String b;
        public final LinkTokenConfiguration c;
        public final String d;
        public final String e;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", aVar, 3);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
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
                return new b(i, str, str2, str3);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) == false) goto L13;
             */
            @Override // kotlinx.serialization.KSerializer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                encoder.getClass();
                bVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(bVar.d, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.d);
                }
                if (!beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor)) {
                    String str = bVar.e;
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                }
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, bVar.e);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        /* renamed from: com.plaid.internal.N2$b$b, reason: collision with other inner class name */
        public static final class C0014b implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), LinkTokenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public b(int i, String str, String str2, String str3) {
            super(0);
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, a.b);
                throw null;
            }
            this.b = str;
            this.c = new LinkTokenConfiguration.Builder().build();
            if ((i & 2) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 4) == 0) {
                this.e = Boxes$$ExternalSyntheticOutline1.m();
            } else {
                this.e = str3;
            }
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c);
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final LinkTokenConfiguration i() {
            return this.c;
        }

        public final String toString() {
            return "BeforeLinkOpen(linkOpenId=" + this.b + ", configuration=" + this.c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }

        public b(String str, LinkTokenConfiguration linkTokenConfiguration) {
            str.getClass();
            linkTokenConfiguration.getClass();
            this.b = str;
            this.c = linkTokenConfiguration;
            this.d = "";
            this.e = Boxes$$ExternalSyntheticOutline1.m();
        }
    }

    @Serializable
    public static final class i extends N2 implements f, g, h {
        public static final Parcelable.Creator<i> CREATOR = new b();
        public static final KSerializer[] l = {null, null, null, null, null, new HashSetSerializer(r8.a.a, 1), null, new EnumSerializer("com.plaid.internal.workflow.error.LocalErrorType", (Enum[]) H3.values()), null, null};
        public final String b;
        public final r8 c;
        public final String d;
        public final String e;
        public final String f;
        public final List<r8> g;
        public final String h;
        public final H3 i;
        public final String j;
        public final String k;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 10);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("errorMessage", false);
                pluginGeneratedSerialDescriptor.addElement("errorCode", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("errorType", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                KSerializer[] kSerializerArr = i.l;
                KSerializer kSerializer = kSerializerArr[5];
                KSerializer kSerializer2 = kSerializerArr[7];
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, r8.a.a, stringSerializer, stringSerializer, stringSerializer, kSerializer, stringSerializer, kSerializer2, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer[] kSerializerArr = i.l;
                Object obj = null;
                boolean z = true;
                H3 h3 = null;
                String str = null;
                r8 r8Var = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                List list = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                int i = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            r8Var = (r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, r8.a.a, r8Var);
                            i |= 2;
                            break;
                        case 2:
                            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i |= 16;
                            break;
                        case 5:
                            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                            i |= 32;
                            break;
                        case 6:
                            str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i |= 64;
                            break;
                        case 7:
                            h3 = (H3) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], h3);
                            i |= 128;
                            break;
                        case 8:
                            str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                            i |= 256;
                            break;
                        case 9:
                            str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                            i |= 512;
                            break;
                        default:
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return obj;
                    }
                    obj = null;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new i(i, str, r8Var, str2, str3, str4, list, str5, h3, str6, str7);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                i iVar = (i) obj;
                encoder.getClass();
                iVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                KSerializer[] kSerializerArr = i.l;
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, iVar.b);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, r8.a.a, iVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, iVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, iVar.e);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, iVar.f);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], iVar.g);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, iVar.h);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || iVar.i != H3.UNKNOWN_ERROR) {
                    beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], iVar.i);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(iVar.j, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, iVar.j);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(iVar.k, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, iVar.k);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                r8 r8Var = (r8) parcel.readParcelable(i.class.getClassLoader());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(i.class, parcel, arrayList, i, 1);
                }
                return new i(readString, r8Var, readString2, readString3, readString4, arrayList, parcel.readString(), H3.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public i(int i, String str, r8 r8Var, String str2, String str3, String str4, List list, String str5, H3 h3, String str6, String str7) {
            super(0);
            if (127 != (i & 127)) {
                TuplesKt.throwMissingFieldException(i, 127, a.b);
                throw null;
            }
            this.b = str;
            this.c = r8Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = list;
            this.h = str5;
            if ((i & 128) == 0) {
                this.i = H3.UNKNOWN_ERROR;
            } else {
                this.i = h3;
            }
            if ((i & 256) == 0) {
                this.j = "";
            } else {
                this.j = str6;
            }
            if ((i & 512) == 0) {
                this.k = "";
            } else {
                this.k = str7;
            }
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.k;
        }

        @Override // com.plaid.internal.N2.f
        public final String b() {
            return this.d;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.h;
        }

        @Override // com.plaid.internal.N2.f
        public final List<r8> d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final r8 e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.b, iVar.b) && Intrinsics.areEqual(this.c, iVar.c) && Intrinsics.areEqual(this.d, iVar.d) && Intrinsics.areEqual(this.e, iVar.e) && Intrinsics.areEqual(this.f, iVar.f) && Intrinsics.areEqual(this.g, iVar.g) && Intrinsics.areEqual(this.h, iVar.h) && this.i == iVar.i;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.j;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.b;
        }

        public final int hashCode() {
            return this.i.hashCode() + C0322x.a(this.h, Recorder$$ExternalSyntheticOutline2.m(C0322x.a(this.f, C0322x.a(this.e, C0322x.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31), 31), 31), 31, this.g), 31);
        }

        public final String toString() {
            String str = this.b;
            r8 r8Var = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            List<r8> list = this.g;
            String str5 = this.h;
            H3 h3 = this.i;
            StringBuilder sb = new StringBuilder("LocalError(workflowId=");
            sb.append(str);
            sb.append(", currentPane=");
            sb.append(r8Var);
            sb.append(", continuationToken=");
            Boxes$$ExternalSyntheticOutline1.m(sb, str2, ", errorMessage=", str3, ", errorCode=");
            NavAction$$ExternalSyntheticOutline0.m(str4, ", backstack=", ", requestId=", sb, list);
            sb.append(str5);
            sb.append(", errorType=");
            sb.append(h3);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.g, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.h);
            this.i.writeToParcel(parcel, i);
        }

        public i(String str, r8 r8Var, String str2, String str3, String str4, List<r8> list, String str5, H3 h3) {
            str.getClass();
            r8Var.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list.getClass();
            str5.getClass();
            h3.getClass();
            this.b = str;
            this.c = r8Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = list;
            this.h = str5;
            this.i = h3;
            this.j = "";
            this.k = "";
        }
    }

    @Serializable
    public static final class k extends N2 implements h, g {
        public static final Parcelable.Creator<k> CREATOR = new b();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final A h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final EnumC0151d7 l;

        @Deprecated
        public static final class a implements GeneratedSerializer {
            public static final a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 11);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("url", false);
                pluginGeneratedSerialDescriptor.addElement("webviewFallbackId", false);
                pluginGeneratedSerialDescriptor.addElement("channelInfo", true);
                pluginGeneratedSerialDescriptor.addElement("hasTransparentBackground", true);
                pluginGeneratedSerialDescriptor.addElement("isOutOfProcess", true);
                pluginGeneratedSerialDescriptor.addElement("shouldPreloadLink", false);
                pluginGeneratedSerialDescriptor.addElement("smsAutofillType", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                KSerializer nullable = BuiltinSerializersKt.getNullable(A.a.a);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, nullable, booleanSerializer, booleanSerializer, booleanSerializer, EnumC0151d7.a.a};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Object obj = null;
                boolean z = true;
                EnumC0151d7 enumC0151d7 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                A a2 = null;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i |= 16;
                            break;
                        case 5:
                            str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                            i |= 32;
                            break;
                        case 6:
                            a2 = (A) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, A.a.a, a2);
                            i |= 64;
                            break;
                        case 7:
                            z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 7);
                            i |= 128;
                            break;
                        case 8:
                            z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                            i |= 256;
                            break;
                        case 9:
                            z4 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                            i |= 512;
                            break;
                        case 10:
                            enumC0151d7 = (EnumC0151d7) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, EnumC0151d7.a.a, enumC0151d7);
                            i |= 1024;
                            break;
                        default:
                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                            return obj;
                    }
                    obj = null;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new k(i, str, str2, str3, str4, str5, str6, a2, z2, z3, z4, enumC0151d7);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                k kVar = (k) obj;
                encoder.getClass();
                kVar.getClass();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, kVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, kVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, kVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, kVar.e);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, kVar.f);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, kVar.g);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || kVar.h != null) {
                    beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, A.a.a, kVar.h);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || kVar.i) {
                    beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 7, kVar.i);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || kVar.j) {
                    beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 8, kVar.j);
                }
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 9, kVar.k);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || kVar.l != EnumC0151d7.NO_SMS_AUTOFILL) {
                    beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, EnumC0151d7.a.a, kVar.l);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        }

        public static final class b implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                A createFromParcel = parcel.readInt() == 0 ? null : A.CREATOR.createFromParcel(parcel);
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new k(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, z3, z4, z2, EnumC0151d7.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i) {
                return new k[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public k(int i, String str, String str2, String str3, String str4, String str5, String str6, A a2, boolean z, boolean z2, boolean z3, EnumC0151d7 enumC0151d7) {
            super(0);
            if (575 != (i & 575)) {
                TuplesKt.throwMissingFieldException(i, 575, a.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            if ((i & 64) == 0) {
                this.h = null;
            } else {
                this.h = a2;
            }
            if ((i & 128) == 0) {
                this.i = false;
            } else {
                this.i = z;
            }
            if ((i & 256) == 0) {
                this.j = false;
            } else {
                this.j = z2;
            }
            this.k = z3;
            if ((i & 1024) == 0) {
                this.l = EnumC0151d7.NO_SMS_AUTOFILL;
            } else {
                this.l = enumC0151d7;
            }
        }

        @Override // com.plaid.internal.N2.g
        public final String a() {
            return this.e;
        }

        @Override // com.plaid.internal.N2.h
        public final String c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final String h() {
            return this.c;
        }

        public final A i() {
            return this.h;
        }

        public final EnumC0151d7 j() {
            return this.l;
        }

        public final String k() {
            return this.f;
        }

        public final String l() {
            return this.g;
        }

        public final boolean m() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            A a2 = this.h;
            if (a2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(a2.a);
                parcel.writeString(a2.b);
                parcel.writeLong(a2.c);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            this.l.writeToParcel(parcel, i);
        }

        public k(String str, String str2, String str3, String str4, String str5, String str6, A a2, boolean z, boolean z2, boolean z3, EnumC0151d7 enumC0151d7) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            str6.getClass();
            enumC0151d7.getClass();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = a2;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.l = enumC0151d7;
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, A a2, boolean z, EnumC0151d7 enumC0151d7, int i) {
            this(str, str2, str3, str4, str5, str6, a2, false, true, z, (i & 1024) != 0 ? EnumC0151d7.NO_SMS_AUTOFILL : enumC0151d7);
        }
    }
}
