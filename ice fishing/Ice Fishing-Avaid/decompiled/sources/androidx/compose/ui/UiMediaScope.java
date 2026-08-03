package androidx.compose.ui;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaQuery.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/UiMediaScope;", "", "windowPosture", "Landroidx/compose/ui/UiMediaScope$Posture;", "getWindowPosture-m18o9QQ", "()Ljava/lang/String;", "windowWidth", "Landroidx/compose/ui/unit/Dp;", "getWindowWidth-D9Ej5fM", "()F", "windowHeight", "getWindowHeight-D9Ej5fM", "pointerPrecision", "Landroidx/compose/ui/UiMediaScope$PointerPrecision;", "getPointerPrecision-fpxItnM", "keyboardKind", "Landroidx/compose/ui/UiMediaScope$KeyboardKind;", "getKeyboardKind-J9_QTjY", "hasMicrophone", "", "getHasMicrophone", "()Z", "hasCamera", "getHasCamera", "viewingDistance", "Landroidx/compose/ui/UiMediaScope$ViewingDistance;", "getViewingDistance-tKro-MQ", "Posture", "PointerPrecision", "KeyboardKind", "ViewingDistance", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public interface UiMediaScope {
    boolean getHasCamera();

    boolean getHasMicrophone();

    /* renamed from: getKeyboardKind-J9_QTjY, reason: not valid java name */
    String mo6210getKeyboardKindJ9_QTjY();

    /* renamed from: getPointerPrecision-fpxItnM, reason: not valid java name */
    String mo6211getPointerPrecisionfpxItnM();

    /* renamed from: getViewingDistance-tKro-MQ, reason: not valid java name */
    String mo6212getViewingDistancetKroMQ();

    /* renamed from: getWindowHeight-D9Ej5fM, reason: not valid java name */
    float mo6213getWindowHeightD9Ej5fM();

    /* renamed from: getWindowPosture-m18o9QQ, reason: not valid java name */
    String mo6214getWindowPosturem18o9QQ();

    /* renamed from: getWindowWidth-D9Ej5fM, reason: not valid java name */
    float mo6215getWindowWidthD9Ej5fM();

    /* compiled from: MediaQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/UiMediaScope$Posture;", "", "description", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "hashCode", "", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @JvmInline
    public static final class Posture {
        private final String description;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String Flat = m6238constructorimpl("Flat");
        private static final String Tabletop = m6238constructorimpl("Tabletop");
        private static final String Book = m6238constructorimpl("Book");

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Posture m6237boximpl(String str) {
            return new Posture(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m6238constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6239equalsimpl(String str, Object obj) {
            return (obj instanceof Posture) && Intrinsics.areEqual(str, ((Posture) obj).getDescription());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6240equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6241hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6242toStringimpl(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return m6239equalsimpl(this.description, other);
        }

        public int hashCode() {
            return m6241hashCodeimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        private /* synthetic */ Posture(String str) {
            this.description = str;
        }

        public String toString() {
            return m6242toStringimpl(this.description);
        }

        /* compiled from: MediaQuery.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/UiMediaScope$Posture$Companion;", "", "<init>", "()V", "Flat", "Landroidx/compose/ui/UiMediaScope$Posture;", "getFlat-m18o9QQ", "()Ljava/lang/String;", "Ljava/lang/String;", "Tabletop", "getTabletop-m18o9QQ", "Book", "getBook-m18o9QQ", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getFlat-m18o9QQ, reason: not valid java name */
            public final String m6245getFlatm18o9QQ() {
                return Posture.Flat;
            }

            /* renamed from: getTabletop-m18o9QQ, reason: not valid java name */
            public final String m6246getTabletopm18o9QQ() {
                return Posture.Tabletop;
            }

            /* renamed from: getBook-m18o9QQ, reason: not valid java name */
            public final String m6244getBookm18o9QQ() {
                return Posture.Book;
            }
        }
    }

    /* compiled from: MediaQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/UiMediaScope$PointerPrecision;", "", "description", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "hashCode", "", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @JvmInline
    public static final class PointerPrecision {
        private final String description;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String Fine = m6227constructorimpl("Fine");
        private static final String Coarse = m6227constructorimpl("Coarse");
        private static final String Blunt = m6227constructorimpl("Blunt");
        private static final String None = m6227constructorimpl("None");

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PointerPrecision m6226boximpl(String str) {
            return new PointerPrecision(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m6227constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6228equalsimpl(String str, Object obj) {
            return (obj instanceof PointerPrecision) && Intrinsics.areEqual(str, ((PointerPrecision) obj).getDescription());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6229equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6230hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6231toStringimpl(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return m6228equalsimpl(this.description, other);
        }

        public int hashCode() {
            return m6230hashCodeimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        private /* synthetic */ PointerPrecision(String str) {
            this.description = str;
        }

        public String toString() {
            return m6231toStringimpl(this.description);
        }

        /* compiled from: MediaQuery.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/UiMediaScope$PointerPrecision$Companion;", "", "<init>", "()V", "Fine", "Landroidx/compose/ui/UiMediaScope$PointerPrecision;", "getFine-fpxItnM", "()Ljava/lang/String;", "Ljava/lang/String;", "Coarse", "getCoarse-fpxItnM", "Blunt", "getBlunt-fpxItnM", "None", "getNone-fpxItnM", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getFine-fpxItnM, reason: not valid java name */
            public final String m6235getFinefpxItnM() {
                return PointerPrecision.Fine;
            }

            /* renamed from: getCoarse-fpxItnM, reason: not valid java name */
            public final String m6234getCoarsefpxItnM() {
                return PointerPrecision.Coarse;
            }

            /* renamed from: getBlunt-fpxItnM, reason: not valid java name */
            public final String m6233getBluntfpxItnM() {
                return PointerPrecision.Blunt;
            }

            /* renamed from: getNone-fpxItnM, reason: not valid java name */
            public final String m6236getNonefpxItnM() {
                return PointerPrecision.None;
            }
        }
    }

    /* compiled from: MediaQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/UiMediaScope$KeyboardKind;", "", "description", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "hashCode", "", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @JvmInline
    public static final class KeyboardKind {
        private final String description;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String Physical = m6217constructorimpl("Physical");
        private static final String Virtual = m6217constructorimpl("Virtual");
        private static final String None = m6217constructorimpl("None");

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ KeyboardKind m6216boximpl(String str) {
            return new KeyboardKind(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m6217constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6218equalsimpl(String str, Object obj) {
            return (obj instanceof KeyboardKind) && Intrinsics.areEqual(str, ((KeyboardKind) obj).getDescription());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6219equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6220hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6221toStringimpl(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return m6218equalsimpl(this.description, other);
        }

        public int hashCode() {
            return m6220hashCodeimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        private /* synthetic */ KeyboardKind(String str) {
            this.description = str;
        }

        public String toString() {
            return m6221toStringimpl(this.description);
        }

        /* compiled from: MediaQuery.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/UiMediaScope$KeyboardKind$Companion;", "", "<init>", "()V", "Physical", "Landroidx/compose/ui/UiMediaScope$KeyboardKind;", "getPhysical-J9_QTjY", "()Ljava/lang/String;", "Ljava/lang/String;", "Virtual", "getVirtual-J9_QTjY", "None", "getNone-J9_QTjY", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getPhysical-J9_QTjY, reason: not valid java name */
            public final String m6224getPhysicalJ9_QTjY() {
                return KeyboardKind.Physical;
            }

            /* renamed from: getVirtual-J9_QTjY, reason: not valid java name */
            public final String m6225getVirtualJ9_QTjY() {
                return KeyboardKind.Virtual;
            }

            /* renamed from: getNone-J9_QTjY, reason: not valid java name */
            public final String m6223getNoneJ9_QTjY() {
                return KeyboardKind.None;
            }
        }
    }

    /* compiled from: MediaQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/UiMediaScope$ViewingDistance;", "", "description", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "hashCode", "", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @JvmInline
    public static final class ViewingDistance {
        private final String description;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String Near = m6248constructorimpl("Near");
        private static final String Medium = m6248constructorimpl("Medium");
        private static final String Far = m6248constructorimpl("Far");

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ViewingDistance m6247boximpl(String str) {
            return new ViewingDistance(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m6248constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6249equalsimpl(String str, Object obj) {
            return (obj instanceof ViewingDistance) && Intrinsics.areEqual(str, ((ViewingDistance) obj).getDescription());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6250equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6251hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6252toStringimpl(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return m6249equalsimpl(this.description, other);
        }

        public int hashCode() {
            return m6251hashCodeimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        private /* synthetic */ ViewingDistance(String str) {
            this.description = str;
        }

        public String toString() {
            return m6252toStringimpl(this.description);
        }

        /* compiled from: MediaQuery.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/UiMediaScope$ViewingDistance$Companion;", "", "<init>", "()V", "Near", "Landroidx/compose/ui/UiMediaScope$ViewingDistance;", "getNear-tKro-MQ", "()Ljava/lang/String;", "Ljava/lang/String;", "Medium", "getMedium-tKro-MQ", "Far", "getFar-tKro-MQ", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getNear-tKro-MQ, reason: not valid java name */
            public final String m6256getNeartKroMQ() {
                return ViewingDistance.Near;
            }

            /* renamed from: getMedium-tKro-MQ, reason: not valid java name */
            public final String m6255getMediumtKroMQ() {
                return ViewingDistance.Medium;
            }

            /* renamed from: getFar-tKro-MQ, reason: not valid java name */
            public final String m6254getFartKroMQ() {
                return ViewingDistance.Far;
            }
        }
    }
}
