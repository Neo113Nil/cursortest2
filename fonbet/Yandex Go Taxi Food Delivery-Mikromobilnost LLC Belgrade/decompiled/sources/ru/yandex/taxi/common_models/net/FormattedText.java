package ru.yandex.taxi.common_models.net;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.nnm;
import defpackage.ogr;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.v5r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0017\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText;", "", "Companion", "ru/yandex/taxi/common_models/net/b", "ru/yandex/taxi/common_models/net/o", "ru/yandex/taxi/common_models/net/z", "h", "d", "e", "g", "a", "c", "ru/yandex/taxi/common_models/net/a", "Type", "ru/yandex/taxi/common_models/net/p", "FontStyle", "FontWeight", "VerticalAlignment", "b", "ru/yandex/taxi/common_models/net/f", "ru/yandex/taxi/common_models/net/a0", "ru/yandex/taxi/common_models/net/y", "f", "LineThroughStyle", "TextDecoration", "w7s", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FormattedText {
    public static final ru.yandex.taxi.common_models.net.b Companion = new ru.yandex.taxi.common_models.net.b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(24))};
    public static final FormattedText c = new FormattedText(0);
    public static final h d = new h(null, null, null, null, null, null, 2047);
    public final List a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$FontStyle;", "", "Companion", "ru/yandex/taxi/common_models/net/g", "NORMAL", "ITALIC", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FontStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ru.yandex.taxi.common_models.net.g Companion;
        public static final FontStyle ITALIC;
        public static final FontStyle NORMAL;

        static {
            FontStyle fontStyle = new FontStyle("NORMAL", 0);
            NORMAL = fontStyle;
            FontStyle fontStyle2 = new FontStyle("ITALIC", 1);
            ITALIC = fontStyle2;
            FontStyle[] fontStyleArr = {fontStyle, fontStyle2};
            $VALUES = fontStyleArr;
            $ENTRIES = kotlin.enums.a.a(fontStyleArr);
            Companion = new ru.yandex.taxi.common_models.net.g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(26));
        }

        public static FontStyle valueOf(String str) {
            return (FontStyle) Enum.valueOf(FontStyle.class, str);
        }

        public static FontStyle[] values() {
            return (FontStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$FontWeight;", "", "Companion", "ru/yandex/taxi/common_models/net/h", "LIGHT", "REGULAR", "MEDIUM", "BOLD", "HEAVY", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FontWeight {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontWeight[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final FontWeight BOLD;
        public static final ru.yandex.taxi.common_models.net.h Companion;
        public static final FontWeight HEAVY;
        public static final FontWeight LIGHT;
        public static final FontWeight MEDIUM;
        public static final FontWeight REGULAR;

        static {
            FontWeight fontWeight = new FontWeight("LIGHT", 0);
            LIGHT = fontWeight;
            FontWeight fontWeight2 = new FontWeight("REGULAR", 1);
            REGULAR = fontWeight2;
            FontWeight fontWeight3 = new FontWeight("MEDIUM", 2);
            MEDIUM = fontWeight3;
            FontWeight fontWeight4 = new FontWeight("BOLD", 3);
            BOLD = fontWeight4;
            FontWeight fontWeight5 = new FontWeight("HEAVY", 4);
            HEAVY = fontWeight5;
            FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5};
            $VALUES = fontWeightArr;
            $ENTRIES = kotlin.enums.a.a(fontWeightArr);
            Companion = new ru.yandex.taxi.common_models.net.h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(27));
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$LineThroughStyle;", "", "Companion", "ru/yandex/taxi/common_models/net/q", "DEFAULT", "DIAGONALLY", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class LineThroughStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LineThroughStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final q Companion;
        public static final LineThroughStyle DEFAULT;
        public static final LineThroughStyle DIAGONALLY;

        static {
            LineThroughStyle lineThroughStyle = new LineThroughStyle("DEFAULT", 0);
            DEFAULT = lineThroughStyle;
            LineThroughStyle lineThroughStyle2 = new LineThroughStyle("DIAGONALLY", 1);
            DIAGONALLY = lineThroughStyle2;
            LineThroughStyle[] lineThroughStyleArr = {lineThroughStyle, lineThroughStyle2};
            $VALUES = lineThroughStyleArr;
            $ENTRIES = kotlin.enums.a.a(lineThroughStyleArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(17));
        }

        public static LineThroughStyle valueOf(String str) {
            return (LineThroughStyle) Enum.valueOf(LineThroughStyle.class, str);
        }

        public static LineThroughStyle[] values() {
            return (LineThroughStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$TextDecoration;", "", "Companion", "ru/yandex/taxi/common_models/net/x", "UNDERLINE", "LINE_THROUGH", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @jxi
    @gsq0
    public static final class TextDecoration {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextDecoration[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final x Companion;
        public static final TextDecoration LINE_THROUGH;
        public static final TextDecoration UNDERLINE;

        static {
            TextDecoration textDecoration = new TextDecoration("UNDERLINE", 0);
            UNDERLINE = textDecoration;
            TextDecoration textDecoration2 = new TextDecoration("LINE_THROUGH", 1);
            LINE_THROUGH = textDecoration2;
            TextDecoration[] textDecorationArr = {textDecoration, textDecoration2};
            $VALUES = textDecorationArr;
            $ENTRIES = kotlin.enums.a.a(textDecorationArr);
            Companion = new x();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(6));
        }

        public static TextDecoration valueOf(String str) {
            return (TextDecoration) Enum.valueOf(TextDecoration.class, str);
        }

        public static TextDecoration[] values() {
            return (TextDecoration[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$Type;", "", "UNKNOWN", BaseDatabaseHelper.TYPE_TEXT, "IMAGE", "IMAGE_URL", "LINK", "CONTAINER", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CONTAINER;
        public static final Type IMAGE;
        public static final Type IMAGE_URL;
        public static final Type LINK;
        public static final Type TEXT;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("UNKNOWN", 0);
            UNKNOWN = type;
            Type type2 = new Type(BaseDatabaseHelper.TYPE_TEXT, 1);
            TEXT = type2;
            Type type3 = new Type("IMAGE", 2);
            IMAGE = type3;
            Type type4 = new Type("IMAGE_URL", 3);
            IMAGE_URL = type4;
            Type type5 = new Type("LINK", 4);
            LINK = type5;
            Type type6 = new Type("CONTAINER", 5);
            CONTAINER = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$VerticalAlignment;", "", "Companion", "ru/yandex/taxi/common_models/net/b0", "BASELINE", "CENTER", "BOTTOM", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class VerticalAlignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VerticalAlignment[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final VerticalAlignment BASELINE;
        public static final VerticalAlignment BOTTOM;
        public static final VerticalAlignment CENTER;
        public static final b0 Companion;

        static {
            VerticalAlignment verticalAlignment = new VerticalAlignment("BASELINE", 0);
            BASELINE = verticalAlignment;
            VerticalAlignment verticalAlignment2 = new VerticalAlignment("CENTER", 1);
            CENTER = verticalAlignment2;
            VerticalAlignment verticalAlignment3 = new VerticalAlignment("BOTTOM", 2);
            BOTTOM = verticalAlignment3;
            VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3};
            $VALUES = verticalAlignmentArr;
            $ENTRIES = kotlin.enums.a.a(verticalAlignmentArr);
            Companion = new b0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(10));
        }

        public static VerticalAlignment valueOf(String str) {
            return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
        }

        public static VerticalAlignment[] values() {
            return (VerticalAlignment[]) $VALUES.clone();
        }
    }

    @gsq0(with = ru.yandex.taxi.common_models.net.f.class)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$b;", "", "<init>", "()V", "Companion", "ru/yandex/taxi/common_models/net/e", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class b {
        public static final ru.yandex.taxi.common_models.net.e Companion = new ru.yandex.taxi.common_models.net.e();
    }

    public /* synthetic */ FormattedText(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final String a() {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o) obj) instanceof h) {
                break;
            }
        }
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar != null) {
            return hVar.a;
        }
        return null;
    }

    public final String b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof h) {
                arrayList.add(obj);
            }
        }
        h hVar = (h) kotlin.collections.a.R(arrayList);
        String str = hVar != null ? hVar.g : null;
        return str == null ? "" : str;
    }

    public final Integer c() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof h) {
                arrayList.add(obj);
            }
        }
        h hVar = (h) kotlin.collections.a.R(arrayList);
        if (hVar != null) {
            return hVar.d;
        }
        return null;
    }

    public final boolean d() {
        return !this.a.isEmpty();
    }

    public final boolean e() {
        List list = this.a;
        if (list.isEmpty()) {
            return false;
        }
        List<o> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (o oVar : list2) {
            if (!(oVar instanceof h) && !(oVar instanceof g)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (FormattedText.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((FormattedText) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$c;", "", "Companion", "ru/yandex/taxi/common_models/net/i", "ru/yandex/taxi/common_models/net/j", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class c {
        public static final j Companion = new j();
        public final String a;

        public /* synthetic */ c(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("GroupAttributes(metaColor=", this.a, Extension.C_BRAKE);
        }

        public c() {
            this.a = null;
        }
    }

    public FormattedText() {
        this(0);
    }

    public FormattedText(List list) {
        this.a = list;
    }

    public /* synthetic */ FormattedText(int i) {
        this(EmptyList.a);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$a;", "Lru/yandex/taxi/common_models/net/o;", "Companion", "ru/yandex/taxi/common_models/net/c", "ru/yandex/taxi/common_models/net/d", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a extends o {
        public static final ru.yandex.taxi.common_models.net.d Companion = new ru.yandex.taxi.common_models.net.d();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(25))};
        public final c a;
        public final List b;

        public a(int i, c cVar, List list) {
            this.a = (i & 1) == 0 ? null : cVar;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public static a e(a aVar, List list) {
            c cVar = aVar.a;
            aVar.getClass();
            return new a(cVar, list);
        }

        @Override // ru.yandex.taxi.common_models.net.o
        public final Type d() {
            return Type.CONTAINER;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            c cVar = this.a;
            return this.b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
        }

        public final String toString() {
            return "Container(groupAttributes=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
        }

        public a(c cVar, List list) {
            this.a = cVar;
            this.b = list;
        }

        public a() {
            this(null, EmptyList.a);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$f;", "Lru/yandex/taxi/common_models/net/FormattedText$b;", "Companion", "ru/yandex/taxi/common_models/net/r", "ru/yandex/taxi/common_models/net/s", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class f extends b {
        public static final s Companion = new s();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(0)), null};
        public final LineThroughStyle a;
        public final String b;

        public /* synthetic */ f(int i, LineThroughStyle lineThroughStyle, String str) {
            this.a = (i & 1) == 0 ? LineThroughStyle.DEFAULT : lineThroughStyle;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && jl40.l(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LineThroughTextDecoration(style=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
        }

        public f() {
            this(null, 3);
        }

        public f(LineThroughStyle lineThroughStyle, int i) {
            this.a = (i & 1) != 0 ? LineThroughStyle.DEFAULT : lineThroughStyle;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$g;", "Lru/yandex/taxi/common_models/net/o;", "Companion", "ru/yandex/taxi/common_models/net/t", "ru/yandex/taxi/common_models/net/u", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class g extends o {
        public static final u Companion = new u();
        public final String a;
        public final h b;

        public g(int i, String str, h hVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.d;
            } else {
                this.b = hVar;
            }
        }

        public static g e(g gVar, h hVar) {
            String str = gVar.a;
            gVar.getClass();
            return new g(str, hVar);
        }

        @Override // ru.yandex.taxi.common_models.net.o
        public final Type d() {
            return Type.LINK;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Link(link=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
        }

        public g(String str, h hVar) {
            this.a = str;
            this.b = hVar;
        }

        public g() {
            this("", FormattedText.d);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$e;", "Lru/yandex/taxi/common_models/net/o;", "Lru/yandex/taxi/common_models/net/a;", "Companion", "ru/yandex/taxi/common_models/net/m", "ru/yandex/taxi/common_models/net/n", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e extends o implements ru.yandex.taxi.common_models.net.a {
        public static final n Companion = new n();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(29)), null};
        public final String a;
        public final VerticalAlignment b;
        public final String c;
        public final boolean d;

        public e(int i, String str, VerticalAlignment verticalAlignment, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = VerticalAlignment.BASELINE;
            } else {
                this.b = verticalAlignment;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            this.d = true;
        }

        public static e e(e eVar, String str) {
            String str2 = eVar.a;
            VerticalAlignment verticalAlignment = eVar.b;
            boolean z = eVar.d;
            eVar.getClass();
            return new e(str2, verticalAlignment, str, z);
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: c, reason: from getter */
        public final VerticalAlignment getB() {
            return this.b;
        }

        @Override // ru.yandex.taxi.common_models.net.o
        public final Type d() {
            return Type.IMAGE_URL;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && this.b == eVar.b && jl40.l(this.c, eVar.c) && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageUrl(url=");
            sb.append(this.a);
            sb.append(", verticalAlignment=");
            sb.append(this.b);
            sb.append(", color=");
            return nnm.i(this.c, ", updateFontMetrics=", Extension.C_BRAKE, sb, this.d);
        }

        public e() {
            this(null, 15);
        }

        public e(String str, VerticalAlignment verticalAlignment, String str2, boolean z) {
            this.a = str;
            this.b = verticalAlignment;
            this.c = str2;
            this.d = z;
        }

        public /* synthetic */ e(String str, int i) {
            this((i & 1) != 0 ? "" : str, VerticalAlignment.BASELINE, "", true);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$d;", "Lru/yandex/taxi/common_models/net/o;", "Lru/yandex/taxi/common_models/net/a;", "Companion", "ru/yandex/taxi/common_models/net/k", "ru/yandex/taxi/common_models/net/l", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d extends o implements ru.yandex.taxi.common_models.net.a {
        public static final l Companion = new l();
        public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(28)), null, null, null};
        public final String a;
        public final VerticalAlignment b;
        public final String c;
        public final int d;
        public final int e;
        public final boolean f;

        public d(int i, String str, VerticalAlignment verticalAlignment, String str2, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = VerticalAlignment.BASELINE;
            } else {
                this.b = verticalAlignment;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i3;
            }
            this.f = true;
        }

        public static d e(d dVar, String str) {
            String str2 = dVar.a;
            VerticalAlignment verticalAlignment = dVar.b;
            int i = dVar.d;
            int i2 = dVar.e;
            boolean z = dVar.f;
            dVar.getClass();
            return new d(str2, verticalAlignment, str, i, i2, z);
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.f;
        }

        @Override // ru.yandex.taxi.common_models.net.a
        /* renamed from: c, reason: from getter */
        public final VerticalAlignment getB() {
            return this.b;
        }

        @Override // ru.yandex.taxi.common_models.net.o
        public final Type d() {
            return Type.IMAGE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && this.b == dVar.b && jl40.l(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
        }

        @Override // ru.yandex.taxi.common_models.net.a
        public final Integer getHeight() {
            return Integer.valueOf(this.e);
        }

        @Override // ru.yandex.taxi.common_models.net.a
        public final Integer getWidth() {
            return Integer.valueOf(this.d);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Image(tag=");
            sb.append(this.a);
            sb.append(", verticalAlignment=");
            sb.append(this.b);
            sb.append(", color=");
            b64.A(this.d, this.c, ", width=", ", height=", sb);
            sb.append(this.e);
            sb.append(", updateFontMetrics=");
            sb.append(this.f);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public d() {
            this(null, null, null, 0, 63);
        }

        public d(String str, VerticalAlignment verticalAlignment, String str2, int i, int i2, boolean z) {
            this.a = str;
            this.b = verticalAlignment;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = z;
        }

        public /* synthetic */ d(String str, VerticalAlignment verticalAlignment, String str2, int i, int i2) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? VerticalAlignment.BASELINE : verticalAlignment, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : 16, (i2 & 16) != 0 ? 0 : i, true);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText$h;", "Lru/yandex/taxi/common_models/net/o;", "Companion", "ru/yandex/taxi/common_models/net/v", "ru/yandex/taxi/common_models/net/w", "go-client-android.libs.formatted_text:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class h extends o {
        public static final w Companion = new w();
        public static final i3y[] l;
        public final String a;
        public final FontStyle b;
        public final FontWeight c;
        public final Integer d;
        public final jsq0 e;
        public final List f;
        public final String g;
        public final String h;
        public final TextMetaStyle i;
        public final String j;
        public final Float k;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new j8s(1)), kotlin.a.b(lazyThreadSafetyMode, new j8s(2)), null, kotlin.a.b(lazyThreadSafetyMode, new j8s(3)), kotlin.a.b(lazyThreadSafetyMode, new j8s(4)), null, null, kotlin.a.b(lazyThreadSafetyMode, new j8s(5)), null, null};
        }

        public h(int i, String str, FontStyle fontStyle, FontWeight fontWeight, Integer num, jsq0 jsq0Var, List list, String str2, String str3, TextMetaStyle textMetaStyle, String str4, Float f) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FontStyle.NORMAL;
            } else {
                this.b = fontStyle;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = fontWeight;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            if ((i & 16) == 0) {
                this.e = ksq0.a;
            } else {
                this.e = jsq0Var;
            }
            if ((i & 32) == 0) {
                this.f = EmptyList.a;
            } else {
                this.f = list;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str3;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = textMetaStyle;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = str4;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = f;
            }
        }

        public static h e(h hVar, String str, FontStyle fontStyle, String str2, int i) {
            jsq0 jsq0Var = ksq0.a;
            String str3 = (i & 1) != 0 ? hVar.a : str;
            FontStyle fontStyle2 = (i & 2) != 0 ? hVar.b : fontStyle;
            FontWeight fontWeight = (i & 4) != 0 ? hVar.c : null;
            Integer num = (i & 8) != 0 ? hVar.d : null;
            if ((i & 16) != 0) {
                jsq0Var = hVar.e;
            }
            jsq0 jsq0Var2 = jsq0Var;
            List list = (i & 32) != 0 ? hVar.f : EmptyList.a;
            String str4 = (i & 64) != 0 ? hVar.g : str2;
            String str5 = hVar.h;
            TextMetaStyle textMetaStyle = (i & 256) != 0 ? hVar.i : null;
            String str6 = (i & 512) != 0 ? hVar.j : null;
            Float f = (i & 1024) != 0 ? hVar.k : null;
            hVar.getClass();
            return new h(str3, fontStyle2, fontWeight, num, jsq0Var2, list, str4, str5, textMetaStyle, str6, f);
        }

        @Override // ru.yandex.taxi.common_models.net.o
        public final Type d() {
            return Type.TEXT;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return jl40.l(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && jl40.l(this.d, hVar.d) && jl40.l(this.e, hVar.e) && jl40.l(this.f, hVar.f) && jl40.l(this.g, hVar.g) && jl40.l(this.h, hVar.h) && this.i == hVar.i && jl40.l(this.j, hVar.j) && jl40.l(this.k, hVar.k);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            FontWeight fontWeight = this.c;
            int hashCode2 = (hashCode + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
            Integer num = this.d;
            int b = unr0.b(unr0.c(unr0.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e.a), 31, this.f), 31, this.g);
            String str = this.h;
            int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
            TextMetaStyle textMetaStyle = this.i;
            int hashCode4 = (hashCode3 + (textMetaStyle == null ? 0 : textMetaStyle.hashCode())) * 31;
            String str2 = this.j;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Float f = this.k;
            return hashCode5 + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(text=");
            sb.append(this.a);
            sb.append(", fontStyle=");
            sb.append(this.b);
            sb.append(", fontWeight=");
            sb.append(this.c);
            sb.append(", fontSize=");
            sb.append(this.d);
            sb.append(", textDecoration=");
            sb.append(this.e);
            sb.append(", detailedTextDecoration=");
            sb.append(this.f);
            sb.append(", color=");
            g8e.D(sb, this.g, ", metaColor=", this.h, ", metaStyle=");
            sb.append(this.i);
            sb.append(", strokeColor=");
            sb.append(this.j);
            sb.append(", strokeWidth=");
            sb.append(this.k);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public h() {
            this(null, null, null, null, null, null, 2047);
        }

        public h(String str, FontStyle fontStyle, FontWeight fontWeight, Integer num, jsq0 jsq0Var, List list, String str2, String str3, TextMetaStyle textMetaStyle, String str4, Float f) {
            this.a = str;
            this.b = fontStyle;
            this.c = fontWeight;
            this.d = num;
            this.e = jsq0Var;
            this.f = list;
            this.g = str2;
            this.h = str3;
            this.i = textMetaStyle;
            this.j = str4;
            this.k = f;
        }

        public /* synthetic */ h(String str, FontStyle fontStyle, FontWeight fontWeight, Integer num, List list, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FontStyle.NORMAL : fontStyle, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : num, ksq0.a, (i & 32) != 0 ? EmptyList.a : list, (i & 64) != 0 ? "" : str2, null, null, null, null);
        }
    }
}
