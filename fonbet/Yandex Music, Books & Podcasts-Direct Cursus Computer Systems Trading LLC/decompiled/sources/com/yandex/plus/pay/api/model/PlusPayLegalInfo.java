package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.repository.api.model.webconfig.q;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.ern;
import defpackage.eta;
import defpackage.f1d;
import defpackage.f9f;
import defpackage.k5r;
import defpackage.mhp;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.tyo;
import defpackage.u7g;
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

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000301/B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class PlusPayLegalInfo implements Parcelable {

    @NotNull
    private final List<Item> items;

    @NotNull
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PlusPayLegalInfo> CREATOR = new Creator();

    @NotNull
    private static final arf[] $childSerializers = {null, btf.a(bwf.b, new q(25))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final t9f serializer() {
            return PlusPayLegalInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayLegalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayLegalInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(PlusPayLegalInfo.class.getClassLoader()));
            }
            return new PlusPayLegalInfo(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayLegalInfo[] newArray(int i) {
            return new PlusPayLegalInfo[i];
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;Lwq5;Lmhp;)V", "", "getKey", "()Ljava/lang/String;", PListParser.TAG_KEY, "Companion", "Link", "Text", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    public static abstract class Item implements Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final arf $cachedSerializer$delegate = btf.a(bwf.b, new q(26));

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ t9f get$cachedSerializer() {
                return (t9f) Item.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final t9f serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ t9f _init_$_anonymous_() {
            return new tyo("com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item", ern.a(Item.class), new f9f[]{ern.a(Link.class), ern.a(Text.class)}, new t9f[]{PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE}, new Annotation[0]);
        }

        @NotNull
        public abstract String getKey();

        private Item() {
        }

        public /* synthetic */ Item(int i, xhp xhpVar) {
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "", PListParser.TAG_KEY, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Text extends Item {

            @NotNull
            private final String key;

            @NotNull
            private final String text;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Text> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayLegalInfo$Item$Text$$serializer.INSTANCE;
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
                    return new Text(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i) {
                    return new Text[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Text(int i, String str, String str2, xhp xhpVar) {
                super(i, xhpVar);
                if (3 != (i & 3)) {
                    u7g.V(i, 3, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.key = str;
                this.text = str2;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.key;
                }
                if ((i & 2) != 0) {
                    str2 = text.text;
                }
                return text.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Text self, wq5 output, mhp serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.p(serialDesc, 0, self.getKey());
                output.p(serialDesc, 1, self.text);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final Text copy(@NotNull String key, @NotNull String text) {
                key.getClass();
                text.getClass();
                return new Text(key, text);
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
                return Intrinsics.d(this.key, text.key) && Intrinsics.d(this.text, text.text);
            }

            @Override // com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Text(key=");
                sb.append(this.key);
                sb.append(", text=");
                return dfi.i(sb, this.text, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeString(this.text);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(@NotNull String str, @NotNull String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.key = str;
                this.text = str2;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "", PListParser.TAG_KEY, "text", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getText", "getLink", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        @vhp
        public static final /* data */ class Link extends Item {

            @NotNull
            private final String key;

            @NotNull
            private final String link;

            @NotNull
            private final String text;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Parcelable.Creator<Link> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final t9f serializer() {
                    return PlusPayLegalInfo$Item$Link$$serializer.INSTANCE;
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
                    return new Link(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link[] newArray(int i) {
                    return new Link[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Link(int i, String str, String str2, String str3, xhp xhpVar) {
                super(i, xhpVar);
                if (7 != (i & 7)) {
                    u7g.V(i, 7, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.key = str;
                this.text = str2;
                this.link = str3;
            }

            public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.key;
                }
                if ((i & 2) != 0) {
                    str2 = link.text;
                }
                if ((i & 4) != 0) {
                    str3 = link.link;
                }
                return link.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Link self, wq5 output, mhp serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.p(serialDesc, 0, self.getKey());
                output.p(serialDesc, 1, self.text);
                output.p(serialDesc, 2, self.link);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final Link copy(@NotNull String key, @NotNull String text, @NotNull String link) {
                key.getClass();
                text.getClass();
                link.getClass();
                return new Link(key, text, link);
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
                return Intrinsics.d(this.key, link.key) && Intrinsics.d(this.text, link.text) && Intrinsics.d(this.link, link.link);
            }

            @Override // com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item
            @NotNull
            public String getKey() {
                return this.key;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.link.hashCode() + k5r.c(this.key.hashCode() * 31, 31, this.text);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Link(key=");
                sb.append(this.key);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", link=");
                return dfi.i(sb, this.link, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeString(this.text);
                dest.writeString(this.link);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                super(null);
                dfi.s(str, str2, str3);
                this.key = str;
                this.text = str2;
                this.link = str3;
            }
        }

        public static final /* synthetic */ void write$Self(Item self, wq5 output, mhp serialDesc) {
        }
    }

    public /* synthetic */ PlusPayLegalInfo(int i, String str, List list, xhp xhpVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, PlusPayLegalInfo$$serializer.INSTANCE.getDescriptor());
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
    public static /* synthetic */ PlusPayLegalInfo copy$default(PlusPayLegalInfo plusPayLegalInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayLegalInfo.text;
        }
        if ((i & 2) != 0) {
            list = plusPayLegalInfo.items;
        }
        return plusPayLegalInfo.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayLegalInfo self, wq5 output, mhp serialDesc) {
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
    public final PlusPayLegalInfo copy(@NotNull String text, @NotNull List<? extends Item> items) {
        text.getClass();
        items.getClass();
        return new PlusPayLegalInfo(text, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayLegalInfo)) {
            return false;
        }
        PlusPayLegalInfo plusPayLegalInfo = (PlusPayLegalInfo) other;
        return Intrinsics.d(this.text, plusPayLegalInfo.text) && Intrinsics.d(this.items, plusPayLegalInfo.items);
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
        StringBuilder sb = new StringBuilder("PlusPayLegalInfo(text=");
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
    public PlusPayLegalInfo(@NotNull String str, @NotNull List<? extends Item> list) {
        str.getClass();
        list.getClass();
        this.text = str;
        this.items = list;
    }
}
