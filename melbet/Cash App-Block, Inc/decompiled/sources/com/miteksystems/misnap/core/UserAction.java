package com.miteksystems.misnap.core;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

@Serializable
/* loaded from: classes4.dex */
public abstract class UserAction {
    public static final Companion Companion = new Companion(null);
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"com/miteksystems/misnap/core/UserAction$Barcode", "Lcom/miteksystems/misnap/core/UserAction;", "Companion", "NOT_FOUND", "Lcom/miteksystems/misnap/core/UserAction$Barcode$NOT_FOUND;", "core_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public abstract class Barcode extends UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Barcode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Barcode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final KSerializer serializer() {
                return (KSerializer) Barcode.b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Barcode$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Barcode;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class NOT_FOUND extends Barcode {
            public static final NOT_FOUND INSTANCE = new NOT_FOUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(NOT_FOUND.class, new StringBuilder(), '.');
            }
        }

        public static final class a extends Lambda implements Function0 {
            public static final a a = new a(0);

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KSerializer invoke() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Barcode", reflectionFactory.getOrCreateKotlinClass(Barcode.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(NOT_FOUND.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public Barcode(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/UserAction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KSerializer serializer() {
            return (KSerializer) UserAction.a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"com/miteksystems/misnap/core/UserAction$Document", "Lcom/miteksystems/misnap/core/UserAction;", "Companion", "HOLD_STILL", "MRZ_NOT_FOUND", "NOT_FOUND", "PRESS_MANUAL_BUTTON", "REDUCE_GLARE", "STRAIGHTEN", "TOO_BRIGHT", "TOO_CLOSE", "TOO_DARK", "TOO_FAR", "USE_DARK_BACKGROUND", "USE_PLAIN_BACKGROUND", "WRONG_DOCUMENT", "Lcom/miteksystems/misnap/core/UserAction$Document$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Document$MRZ_NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Document$REDUCE_GLARE;", "Lcom/miteksystems/misnap/core/UserAction$Document$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_BRIGHT;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_DARK;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Document$USE_DARK_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$USE_PLAIN_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$WRONG_DOCUMENT;", "core_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public abstract class Document extends UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final KSerializer serializer() {
                return (KSerializer) Document.b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class HOLD_STILL extends Document {
            public static final HOLD_STILL INSTANCE = new HOLD_STILL(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", HOLD_STILL.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(HOLD_STILL.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$MRZ_NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class MRZ_NOT_FOUND extends Document {
            public static final MRZ_NOT_FOUND INSTANCE = new MRZ_NOT_FOUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", MRZ_NOT_FOUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(MRZ_NOT_FOUND.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class NOT_FOUND extends Document {
            public static final NOT_FOUND INSTANCE = new NOT_FOUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(NOT_FOUND.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class PRESS_MANUAL_BUTTON extends Document {
            public static final PRESS_MANUAL_BUTTON INSTANCE = new PRESS_MANUAL_BUTTON(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(PRESS_MANUAL_BUTTON.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$REDUCE_GLARE;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class REDUCE_GLARE extends Document {
            public static final REDUCE_GLARE INSTANCE = new REDUCE_GLARE(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", REDUCE_GLARE.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(REDUCE_GLARE.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class STRAIGHTEN extends Document {
            public static final STRAIGHTEN INSTANCE = new STRAIGHTEN(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", STRAIGHTEN.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(STRAIGHTEN.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_BRIGHT;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_BRIGHT extends Document {
            public static final TOO_BRIGHT INSTANCE = new TOO_BRIGHT(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", TOO_BRIGHT.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_BRIGHT.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_CLOSE extends Document {
            public static final TOO_CLOSE INSTANCE = new TOO_CLOSE(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", TOO_CLOSE.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_CLOSE.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_DARK;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_DARK extends Document {
            public static final TOO_DARK INSTANCE = new TOO_DARK(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", TOO_DARK.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_DARK.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_FAR extends Document {
            public static final TOO_FAR INSTANCE = new TOO_FAR(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", TOO_FAR.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_FAR.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$USE_DARK_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class USE_DARK_BACKGROUND extends Document {
            public static final USE_DARK_BACKGROUND INSTANCE = new USE_DARK_BACKGROUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", USE_DARK_BACKGROUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(USE_DARK_BACKGROUND.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$USE_PLAIN_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class USE_PLAIN_BACKGROUND extends Document {
            public static final USE_PLAIN_BACKGROUND INSTANCE = new USE_PLAIN_BACKGROUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", USE_PLAIN_BACKGROUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(USE_PLAIN_BACKGROUND.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$WRONG_DOCUMENT;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class WRONG_DOCUMENT extends Document {
            public static final WRONG_DOCUMENT INSTANCE = new WRONG_DOCUMENT(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", WRONG_DOCUMENT.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(WRONG_DOCUMENT.class, new StringBuilder(), '.');
            }
        }

        public static final class a extends Lambda implements Function0 {
            public static final a a = new a(0);

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KSerializer invoke() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Document", reflectionFactory.getOrCreateKotlinClass(Document.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(HOLD_STILL.class), reflectionFactory.getOrCreateKotlinClass(MRZ_NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(PRESS_MANUAL_BUTTON.class), reflectionFactory.getOrCreateKotlinClass(REDUCE_GLARE.class), reflectionFactory.getOrCreateKotlinClass(STRAIGHTEN.class), reflectionFactory.getOrCreateKotlinClass(TOO_BRIGHT.class), reflectionFactory.getOrCreateKotlinClass(TOO_CLOSE.class), reflectionFactory.getOrCreateKotlinClass(TOO_DARK.class), reflectionFactory.getOrCreateKotlinClass(TOO_FAR.class), reflectionFactory.getOrCreateKotlinClass(USE_DARK_BACKGROUND.class), reflectionFactory.getOrCreateKotlinClass(USE_PLAIN_BACKGROUND.class), reflectionFactory.getOrCreateKotlinClass(WRONG_DOCUMENT.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", HOLD_STILL.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", MRZ_NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", REDUCE_GLARE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", STRAIGHTEN.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", TOO_BRIGHT.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", TOO_CLOSE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", TOO_DARK.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", TOO_FAR.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", USE_DARK_BACKGROUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", USE_PLAIN_BACKGROUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", WRONG_DOCUMENT.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public Document(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"com/miteksystems/misnap/core/UserAction$Face", "Lcom/miteksystems/misnap/core/UserAction;", "Companion", "HOLD_STILL", "MULTIPLE_FACES", "NOT_FOUND", "OPEN_EYES", "PRESS_MANUAL_BUTTON", "SMILE", "STOP_SMILE", "STRAIGHTEN", "TOO_CLOSE", "TOO_FAR", "Lcom/miteksystems/misnap/core/UserAction$Face$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Face$MULTIPLE_FACES;", "Lcom/miteksystems/misnap/core/UserAction$Face$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Face$OPEN_EYES;", "Lcom/miteksystems/misnap/core/UserAction$Face$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Face$SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face$STOP_SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Face$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Face$TOO_FAR;", "core_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public abstract class Face extends UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final KSerializer serializer() {
                return (KSerializer) Face.b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class HOLD_STILL extends Face {
            public static final HOLD_STILL INSTANCE = new HOLD_STILL(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", HOLD_STILL.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(HOLD_STILL.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$MULTIPLE_FACES;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class MULTIPLE_FACES extends Face {
            public static final MULTIPLE_FACES INSTANCE = new MULTIPLE_FACES(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", MULTIPLE_FACES.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(MULTIPLE_FACES.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class NOT_FOUND extends Face {
            public static final NOT_FOUND INSTANCE = new NOT_FOUND(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(NOT_FOUND.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$OPEN_EYES;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class OPEN_EYES extends Face {
            public static final OPEN_EYES INSTANCE = new OPEN_EYES(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", OPEN_EYES.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(OPEN_EYES.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class PRESS_MANUAL_BUTTON extends Face {
            public static final PRESS_MANUAL_BUTTON INSTANCE = new PRESS_MANUAL_BUTTON(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(PRESS_MANUAL_BUTTON.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class SMILE extends Face {
            public static final SMILE INSTANCE = new SMILE(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", SMILE.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(SMILE.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$STOP_SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class STOP_SMILE extends Face {
            public static final STOP_SMILE INSTANCE = new STOP_SMILE(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", STOP_SMILE.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(STOP_SMILE.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class STRAIGHTEN extends Face {
            public static final STRAIGHTEN INSTANCE = new STRAIGHTEN(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", STRAIGHTEN.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(STRAIGHTEN.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_CLOSE extends Face {
            public static final TOO_CLOSE INSTANCE = new TOO_CLOSE(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", TOO_CLOSE.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_CLOSE.class, new StringBuilder(), '.');
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class TOO_FAR extends Face {
            public static final TOO_FAR INSTANCE = new TOO_FAR(null);
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

            public static final class a extends Lambda implements Function0 {
                public static final a a = new a(0);

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KSerializer invoke() {
                    return new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", TOO_FAR.INSTANCE, new Annotation[0]);
                }
            }

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }

            public String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(TOO_FAR.class, new StringBuilder(), '.');
            }
        }

        public static final class a extends Lambda implements Function0 {
            public static final a a = new a(0);

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KSerializer invoke() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Face", reflectionFactory.getOrCreateKotlinClass(Face.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(HOLD_STILL.class), reflectionFactory.getOrCreateKotlinClass(MULTIPLE_FACES.class), reflectionFactory.getOrCreateKotlinClass(NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(OPEN_EYES.class), reflectionFactory.getOrCreateKotlinClass(PRESS_MANUAL_BUTTON.class), reflectionFactory.getOrCreateKotlinClass(SMILE.class), reflectionFactory.getOrCreateKotlinClass(STOP_SMILE.class), reflectionFactory.getOrCreateKotlinClass(STRAIGHTEN.class), reflectionFactory.getOrCreateKotlinClass(TOO_CLOSE.class), reflectionFactory.getOrCreateKotlinClass(TOO_FAR.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", HOLD_STILL.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", MULTIPLE_FACES.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", OPEN_EYES.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", SMILE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", STOP_SMILE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", STRAIGHTEN.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", TOO_CLOSE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", TOO_FAR.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public Face(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/miteksystems/misnap/core/UserAction$NONE", "Lcom/miteksystems/misnap/core/UserAction;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$NONE;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class NONE extends UserAction {
        public static final NONE INSTANCE = new NONE();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

        public static final class a extends Lambda implements Function0 {
            public static final a a = new a(0);

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KSerializer invoke() {
                return new EnumSerializer("com.miteksystems.misnap.core.UserAction.NONE", NONE.INSTANCE, new Annotation[0]);
            }
        }

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public String toString() {
            return NONE.class.getSimpleName();
        }
    }

    final class a extends Lambda implements Function0 {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KSerializer invoke() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.miteksystems.misnap.core.UserAction", reflectionFactory.getOrCreateKotlinClass(UserAction.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Barcode.NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(Document.HOLD_STILL.class), reflectionFactory.getOrCreateKotlinClass(Document.MRZ_NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(Document.NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(Document.PRESS_MANUAL_BUTTON.class), reflectionFactory.getOrCreateKotlinClass(Document.REDUCE_GLARE.class), reflectionFactory.getOrCreateKotlinClass(Document.STRAIGHTEN.class), reflectionFactory.getOrCreateKotlinClass(Document.TOO_BRIGHT.class), reflectionFactory.getOrCreateKotlinClass(Document.TOO_CLOSE.class), reflectionFactory.getOrCreateKotlinClass(Document.TOO_DARK.class), reflectionFactory.getOrCreateKotlinClass(Document.TOO_FAR.class), reflectionFactory.getOrCreateKotlinClass(Document.USE_DARK_BACKGROUND.class), reflectionFactory.getOrCreateKotlinClass(Document.USE_PLAIN_BACKGROUND.class), reflectionFactory.getOrCreateKotlinClass(Document.WRONG_DOCUMENT.class), reflectionFactory.getOrCreateKotlinClass(Face.HOLD_STILL.class), reflectionFactory.getOrCreateKotlinClass(Face.MULTIPLE_FACES.class), reflectionFactory.getOrCreateKotlinClass(Face.NOT_FOUND.class), reflectionFactory.getOrCreateKotlinClass(Face.OPEN_EYES.class), reflectionFactory.getOrCreateKotlinClass(Face.PRESS_MANUAL_BUTTON.class), reflectionFactory.getOrCreateKotlinClass(Face.SMILE.class), reflectionFactory.getOrCreateKotlinClass(Face.STOP_SMILE.class), reflectionFactory.getOrCreateKotlinClass(Face.STRAIGHTEN.class), reflectionFactory.getOrCreateKotlinClass(Face.TOO_CLOSE.class), reflectionFactory.getOrCreateKotlinClass(Face.TOO_FAR.class), reflectionFactory.getOrCreateKotlinClass(NONE.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", Barcode.NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", Document.HOLD_STILL.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", Document.MRZ_NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", Document.NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", Document.PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", Document.REDUCE_GLARE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", Document.STRAIGHTEN.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", Document.TOO_BRIGHT.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", Document.TOO_CLOSE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", Document.TOO_DARK.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", Document.TOO_FAR.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", Document.USE_DARK_BACKGROUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", Document.USE_PLAIN_BACKGROUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", Document.WRONG_DOCUMENT.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", Face.HOLD_STILL.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", Face.MULTIPLE_FACES.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", Face.NOT_FOUND.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", Face.OPEN_EYES.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", Face.PRESS_MANUAL_BUTTON.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", Face.SMILE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", Face.STOP_SMILE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", Face.STRAIGHTEN.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", Face.TOO_CLOSE.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", Face.TOO_FAR.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.core.UserAction.NONE", NONE.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }
}
