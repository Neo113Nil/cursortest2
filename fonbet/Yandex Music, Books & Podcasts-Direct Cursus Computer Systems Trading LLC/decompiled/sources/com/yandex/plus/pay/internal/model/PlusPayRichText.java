package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.arf;
import defpackage.b6e;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.ern;
import defpackage.eta;
import defpackage.f1d;
import defpackage.f9f;
import defpackage.k5r;
import defpackage.mhp;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tyo;
import defpackage.u7g;
import defpackage.v75;
import defpackage.vhp;
import defpackage.wq5;
import defpackage.xhp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00030/1B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class PlusPayRichText implements Parcelable {

    @NotNull
    private final List<Item> items;

    @NotNull
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PlusPayRichText> CREATOR = new Creator();

    @NotNull
    private static final arf[] $childSerializers = {null, btf.a(bwf.b, new a(15))};

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Companion;", "", "<init>", "()V", "", PListParser.TAG_STRING, "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "fromString", "(Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "legalsInfo", "fromLegalInfo", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "empty", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "Lt9f;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlusPayRichText empty() {
            return fromString("");
        }

        @NotNull
        public final PlusPayRichText fromLegalInfo(@NotNull PlusPayLegalInfo legalsInfo) {
            Item text;
            legalsInfo.getClass();
            String text2 = legalsInfo.getText();
            List<PlusPayLegalInfo.Item> items = legalsInfo.getItems();
            ArrayList arrayList = new ArrayList(v75.o(items, 10));
            for (PlusPayLegalInfo.Item item : items) {
                if (item instanceof PlusPayLegalInfo.Item.Link) {
                    PlusPayLegalInfo.Item.Link link = (PlusPayLegalInfo.Item.Link) item;
                    text = new Item.Link((String) null, link.getKey(), link.getText(), link.getLink(), 1, (DefaultConstructorMarker) null);
                } else {
                    if (!(item instanceof PlusPayLegalInfo.Item.Text)) {
                        b6e.s();
                        return null;
                    }
                    PlusPayLegalInfo.Item.Text text3 = (PlusPayLegalInfo.Item.Text) item;
                    text = new Item.Text((String) null, text3.getKey(), text3.getText(), 1, (DefaultConstructorMarker) null);
                }
                arrayList.add(text);
            }
            return new PlusPayRichText(text2, arrayList);
        }

        @NotNull
        public final PlusPayRichText fromString(@NotNull String string) {
            string.getClass();
            return new PlusPayRichText(string, c5b.a);
        }

        @NotNull
        public final t9f serializer() {
            return PlusPayRichText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayRichText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayRichText createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(PlusPayRichText.class.getClassLoader()));
            }
            return new PlusPayRichText(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayRichText[] newArray(int i) {
            return new PlusPayRichText[i];
        }
    }

    public /* synthetic */ PlusPayRichText(int i, String str, List list, xhp xhpVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, PlusPayRichText$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
        return new qy0(Item.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusPayRichText copy$default(PlusPayRichText plusPayRichText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayRichText.text;
        }
        if ((i & 2) != 0) {
            list = plusPayRichText.items;
        }
        return plusPayRichText.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayRichText self, wq5 output, mhp serialDesc) {
        arf[] arfVarArr = $childSerializers;
        output.p(serialDesc, 0, self.text);
        output.k(serialDesc, 1, (t9f) arfVarArr[1].getValue(), self.items);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Item> component2() {
        return this.items;
    }

    @NotNull
    public final PlusPayRichText copy(@NotNull String text, @NotNull List<? extends Item> items) {
        text.getClass();
        items.getClass();
        return new PlusPayRichText(text, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayRichText)) {
            return false;
        }
        PlusPayRichText plusPayRichText = (PlusPayRichText) other;
        return Intrinsics.d(this.text, plusPayRichText.text) && Intrinsics.d(this.items, plusPayRichText.items);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayRichText(text=");
        sb.append(this.text);
        sb.append(", items=");
        return eta.h(sb, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.text);
        Iterator n = f1d.n(dest, this.items);
        while (n.hasNext()) {
            dest.writeParcelable((Parcelable) n.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayRichText(@NotNull String str, @NotNull List<? extends Item> list) {
        str.getClass();
        list.getClass();
        this.text = str;
        this.items = list;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00102\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "Landroid/os/Parcelable;", "altText", "", "getAltText", "()Ljava/lang/String;", PListParser.TAG_KEY, "getKey", "data", "getData", "TextColor", "Icon", "Link", "Strikethrough", "Highlight", "Text", "Companion", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    public interface Item extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final t9f serializer() {
                return new tyo("com.yandex.plus.pay.internal.model.PlusPayRichText.Item", ern.a(Item.class), new f9f[]{ern.a(Highlight.class), ern.a(Icon.class), ern.a(Link.class), ern.a(Strikethrough.class), ern.a(Text.class), ern.a(TextColor.class)}, new t9f[]{PlusPayRichText$Item$Highlight$$serializer.INSTANCE, PlusPayRichText$Item$Icon$$serializer.INSTANCE, PlusPayRichText$Item$Link$$serializer.INSTANCE, PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE, PlusPayRichText$Item$Text$$serializer.INSTANCE, PlusPayRichText$Item$TextColor$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        String getAltText();

        String getData();

        @NotNull
        String getKey();

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J>\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010%¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "Lcom/yandex/plus/core/data/common/v;", "Lcom/yandex/plus/core/data/common/k;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/v;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/v;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/v;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/v;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/v;", "getColor", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class TextColor implements Item {

            @NotNull
            private final String altText;

            @NotNull
            private final v<k> color;

            @NotNull
            private final String data;

            @NotNull
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<TextColor> CREATOR = new Creator();

            @NotNull
            private static final arf[] $childSerializers = {null, null, null, btf.a(bwf.b, new a(16))};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$TextColor$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<TextColor> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextColor createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new TextColor(parcel.readString(), parcel.readString(), parcel.readString(), (v) parcel.readParcelable(TextColor.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextColor[] newArray(int i) {
                    return new TextColor[i];
                }
            }

            public /* synthetic */ TextColor(int i, String str, String str2, String str3, v vVar, xhp xhpVar) {
                if (15 != (i & 15)) {
                    u7g.V(i, 15, PlusPayRichText$Item$TextColor$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.color = vVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
                return v.Companion.serializer(k.Companion.serializer());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TextColor copy$default(TextColor textColor, String str, String str2, String str3, v vVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textColor.altText;
                }
                if ((i & 2) != 0) {
                    str2 = textColor.key;
                }
                if ((i & 4) != 0) {
                    str3 = textColor.data;
                }
                if ((i & 8) != 0) {
                    vVar = textColor.color;
                }
                return textColor.copy(str, str2, str3, vVar);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(TextColor self, wq5 output, mhp serialDesc) {
                arf[] arfVarArr = $childSerializers;
                output.p(serialDesc, 0, self.getAltText());
                output.p(serialDesc, 1, self.getKey());
                output.p(serialDesc, 2, self.getData());
                output.k(serialDesc, 3, (t9f) arfVarArr[3].getValue(), self.color);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final v<k> component4() {
                return this.color;
            }

            @NotNull
            public final TextColor copy(@NotNull String altText, @NotNull String key, @NotNull String data, @NotNull v<k> color) {
                altText.getClass();
                key.getClass();
                data.getClass();
                color.getClass();
                return new TextColor(altText, key, data, color);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextColor)) {
                    return false;
                }
                TextColor textColor = (TextColor) other;
                return Intrinsics.d(this.altText, textColor.altText) && Intrinsics.d(this.key, textColor.key) && Intrinsics.d(this.data, textColor.data) && Intrinsics.d(this.color, textColor.color);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getAltText() {
                return this.altText;
            }

            @NotNull
            public final v<k> getColor() {
                return this.color;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.color.hashCode() + k5r.c(k5r.c(this.altText.hashCode() * 31, 31, this.key), 31, this.data);
            }

            @NotNull
            public String toString() {
                return "TextColor(altText=" + this.altText + ", key=" + this.key + ", data=" + this.data + ", color=" + this.color + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeParcelable(this.color, flags);
            }

            public TextColor(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull v<k> vVar) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                vVar.getClass();
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.color = vVar;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Highlight implements Item {
            private final String altText;

            @NotNull
            private final String data;

            @NotNull
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Highlight> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$Highlight$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Highlight> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Highlight createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Highlight(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Highlight[] newArray(int i) {
                    return new Highlight[i];
                }
            }

            public /* synthetic */ Highlight(int i, String str, String str2, String str3, xhp xhpVar) {
                if (6 != (i & 6)) {
                    u7g.V(i, 6, PlusPayRichText$Item$Highlight$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = highlight.altText;
                }
                if ((i & 2) != 0) {
                    str2 = highlight.key;
                }
                if ((i & 4) != 0) {
                    str3 = highlight.data;
                }
                return highlight.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Highlight self, wq5 output, mhp serialDesc) {
                if (output.e(serialDesc) || self.getAltText() != null) {
                    output.q(serialDesc, 0, tkr.a, self.getAltText());
                }
                output.p(serialDesc, 1, self.getKey());
                output.p(serialDesc, 2, self.getData());
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final Highlight copy(String altText, @NotNull String key, @NotNull String data) {
                key.getClass();
                data.getClass();
                return new Highlight(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) other;
                return Intrinsics.d(this.altText, highlight.altText) && Intrinsics.d(this.key, highlight.key) && Intrinsics.d(this.data, highlight.data);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Highlight(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                return dfi.i(sb, this.data, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
            }

            public Highlight(String str, @NotNull String str2, @NotNull String str3) {
                str2.getClass();
                str3.getClass();
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Highlight(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Strikethrough implements Item {
            private final String altText;

            @NotNull
            private final String data;

            @NotNull
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Strikethrough> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Strikethrough> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Strikethrough createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Strikethrough(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Strikethrough[] newArray(int i) {
                    return new Strikethrough[i];
                }
            }

            public /* synthetic */ Strikethrough(int i, String str, String str2, String str3, xhp xhpVar) {
                if (6 != (i & 6)) {
                    u7g.V(i, 6, PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Strikethrough copy$default(Strikethrough strikethrough, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = strikethrough.altText;
                }
                if ((i & 2) != 0) {
                    str2 = strikethrough.key;
                }
                if ((i & 4) != 0) {
                    str3 = strikethrough.data;
                }
                return strikethrough.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Strikethrough self, wq5 output, mhp serialDesc) {
                if (output.e(serialDesc) || self.getAltText() != null) {
                    output.q(serialDesc, 0, tkr.a, self.getAltText());
                }
                output.p(serialDesc, 1, self.getKey());
                output.p(serialDesc, 2, self.getData());
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final Strikethrough copy(String altText, @NotNull String key, @NotNull String data) {
                key.getClass();
                data.getClass();
                return new Strikethrough(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strikethrough)) {
                    return false;
                }
                Strikethrough strikethrough = (Strikethrough) other;
                return Intrinsics.d(this.altText, strikethrough.altText) && Intrinsics.d(this.key, strikethrough.key) && Intrinsics.d(this.data, strikethrough.data);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Strikethrough(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                return dfi.i(sb, this.data, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
            }

            public Strikethrough(String str, @NotNull String str2, @NotNull String str3) {
                str2.getClass();
                str3.getClass();
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Strikethrough(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Text implements Item {
            private final String altText;

            @NotNull
            private final String data;

            @NotNull
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Text> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$Text$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Text> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Text(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i) {
                    return new Text[i];
                }
            }

            public /* synthetic */ Text(int i, String str, String str2, String str3, xhp xhpVar) {
                if (6 != (i & 6)) {
                    u7g.V(i, 6, PlusPayRichText$Item$Text$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.altText;
                }
                if ((i & 2) != 0) {
                    str2 = text.key;
                }
                if ((i & 4) != 0) {
                    str3 = text.data;
                }
                return text.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Text self, wq5 output, mhp serialDesc) {
                if (output.e(serialDesc) || self.getAltText() != null) {
                    output.q(serialDesc, 0, tkr.a, self.getAltText());
                }
                output.p(serialDesc, 1, self.getKey());
                output.p(serialDesc, 2, self.getData());
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final Text copy(String altText, @NotNull String key, @NotNull String data) {
                key.getClass();
                data.getClass();
                return new Text(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.altText, text.altText) && Intrinsics.d(this.key, text.key) && Intrinsics.d(this.data, text.data);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Text(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                return dfi.i(sb, this.data, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
            }

            public Text(String str, @NotNull String str2, @NotNull String str3) {
                str2.getClass();
                str3.getClass();
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Text(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$¨\u00066"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "Lcom/yandex/plus/core/data/common/y;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/y;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/y;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/y;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/y;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/y;", "getImage", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Icon implements Item {

            @NotNull
            private final String altText;
            private final String data;

            @NotNull
            private final y image;

            @NotNull
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Icon> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$Icon$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Icon> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Icon(parcel.readString(), parcel.readString(), parcel.readString(), (y) parcel.readParcelable(Icon.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public /* synthetic */ Icon(int i, String str, String str2, String str3, y yVar, xhp xhpVar) {
                if (11 != (i & 11)) {
                    u7g.V(i, 11, PlusPayRichText$Item$Icon$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                if ((i & 4) == 0) {
                    this.data = null;
                } else {
                    this.data = str3;
                }
                this.image = yVar;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, String str3, y yVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = icon.altText;
                }
                if ((i & 2) != 0) {
                    str2 = icon.key;
                }
                if ((i & 4) != 0) {
                    str3 = icon.data;
                }
                if ((i & 8) != 0) {
                    yVar = icon.image;
                }
                return icon.copy(str, str2, str3, yVar);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Icon self, wq5 output, mhp serialDesc) {
                output.p(serialDesc, 0, self.getAltText());
                output.p(serialDesc, 1, self.getKey());
                if (output.e(serialDesc) || self.getData() != null) {
                    output.q(serialDesc, 2, tkr.a, self.getData());
                }
                output.k(serialDesc, 3, w.a, self.image);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final y getImage() {
                return this.image;
            }

            @NotNull
            public final Icon copy(@NotNull String altText, @NotNull String key, String data, @NotNull y image) {
                altText.getClass();
                key.getClass();
                image.getClass();
                return new Icon(altText, key, data, image);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.altText, icon.altText) && Intrinsics.d(this.key, icon.key) && Intrinsics.d(this.data, icon.data) && Intrinsics.d(this.image, icon.image);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @NotNull
            public final y getImage() {
                return this.image;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                int c = k5r.c(this.altText.hashCode() * 31, 31, this.key);
                String str = this.data;
                return this.image.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return "Icon(altText=" + this.altText + ", key=" + this.key + ", data=" + this.data + ", image=" + this.image + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeParcelable(this.image, flags);
            }

            public Icon(@NotNull String str, @NotNull String str2, String str3, @NotNull y yVar) {
                str.getClass();
                str2.getClass();
                yVar.getClass();
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.image = yVar;
            }

            public /* synthetic */ Icon(String str, String str2, String str3, y yVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3, yVar);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ:\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", PListParser.TAG_KEY, "data", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "getLink", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Link implements Item {
            private final String altText;

            @NotNull
            private final String data;

            @NotNull
            private final String key;

            @NotNull
            private final String link;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Link> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayRichText$Item$Link$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Creator implements Parcelable.Creator<Link> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Link(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link[] newArray(int i) {
                    return new Link[i];
                }
            }

            public /* synthetic */ Link(int i, String str, String str2, String str3, String str4, xhp xhpVar) {
                if (14 != (i & 14)) {
                    u7g.V(i, 14, PlusPayRichText$Item$Link$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
                this.link = str4;
            }

            public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.altText;
                }
                if ((i & 2) != 0) {
                    str2 = link.key;
                }
                if ((i & 4) != 0) {
                    str3 = link.data;
                }
                if ((i & 8) != 0) {
                    str4 = link.link;
                }
                return link.copy(str, str2, str3, str4);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Link self, wq5 output, mhp serialDesc) {
                if (output.e(serialDesc) || self.getAltText() != null) {
                    output.q(serialDesc, 0, tkr.a, self.getAltText());
                }
                output.p(serialDesc, 1, self.getKey());
                output.p(serialDesc, 2, self.getData());
                output.p(serialDesc, 3, self.link);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final Link copy(String altText, @NotNull String key, @NotNull String data, @NotNull String link) {
                key.getClass();
                data.getClass();
                link.getClass();
                return new Link(altText, key, data, link);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Link)) {
                    return false;
                }
                Link link = (Link) other;
                return Intrinsics.d(this.altText, link.altText) && Intrinsics.d(this.key, link.key) && Intrinsics.d(this.data, link.data) && Intrinsics.d(this.link, link.link);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                String str = this.altText;
                return this.link.hashCode() + k5r.c(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.key), 31, this.data);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Link(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", link=");
                return dfi.i(sb, this.link, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeString(this.link);
            }

            public Link(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                dfi.s(str2, str3, str4);
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.link = str4;
            }

            public /* synthetic */ Link(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3, str4);
            }
        }
    }
}
