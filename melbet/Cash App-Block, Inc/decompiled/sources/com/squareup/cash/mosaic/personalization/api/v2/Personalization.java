package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v2.Background;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization$Builder;", "", "selected_background_id", "Ljava/lang/String;", "Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "hydrated_selected_background", "Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "selected_music_id", "Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "hydrated_selected_music", "Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationPreview;", "preview", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationPreview;", "", "Lcom/squareup/cash/mosaic/personalization/api/v2/Element;", "elements", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Personalization extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Personalization> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Element> elements;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.Background#ADAPTER", schemaIndex = 1, tag = 2)
    public final Background hydrated_selected_background;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.Music#ADAPTER", schemaIndex = 4, tag = 5)
    public final Music hydrated_selected_music;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationPreview#ADAPTER", schemaIndex = 5, tag = 6)
    public final PersonalizationPreview preview;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String selected_background_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String selected_music_id;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "<init>", "()V", "selected_background_id", "", "hydrated_selected_background", "Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "elements", "", "Lcom/squareup/cash/mosaic/personalization/api/v2/Element;", "selected_music_id", "hydrated_selected_music", "Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "preview", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationPreview;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Element> elements = EmptyList.INSTANCE;
        public Background hydrated_selected_background;
        public Music hydrated_selected_music;
        public PersonalizationPreview preview;
        public String selected_background_id;
        public String selected_music_id;

        @Override // com.squareup.wire.Message.Builder
        public Personalization build() {
            return new Personalization(this.selected_background_id, this.hydrated_selected_background, this.elements, this.selected_music_id, this.hydrated_selected_music, this.preview, buildUnknownFields());
        }

        public final Builder elements(List<Element> elements) {
            elements.getClass();
            TransactorKt.checkElementsNotNull(elements);
            this.elements = elements;
            return this;
        }

        public final Builder hydrated_selected_background(Background hydrated_selected_background) {
            this.hydrated_selected_background = hydrated_selected_background;
            return this;
        }

        public final Builder hydrated_selected_music(Music hydrated_selected_music) {
            this.hydrated_selected_music = hydrated_selected_music;
            return this;
        }

        public final Builder preview(PersonalizationPreview preview) {
            this.preview = preview;
            return this;
        }

        public final Builder selected_background_id(String selected_background_id) {
            this.selected_background_id = selected_background_id;
            return this;
        }

        public final Builder selected_music_id(String selected_music_id) {
            this.selected_music_id = selected_music_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Personalization.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v2.Personalization$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Personalization decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Personalization((String) obj, (Background) obj2, m, (String) obj3, (Music) obj4, (PersonalizationPreview) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(Background.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            m.add(Element.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(Music.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(PersonalizationPreview.ADAPTER, reader, obj5);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Personalization value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.selected_background_id);
                Background.ADAPTER.encodeWithTag(writer, 2, value.hydrated_selected_background);
                Element.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.elements);
                protoAdapter2.encodeWithTag(writer, 4, value.selected_music_id);
                Music.ADAPTER.encodeWithTag(writer, 5, value.hydrated_selected_music);
                PersonalizationPreview.ADAPTER.encodeWithTag(writer, 6, value.preview);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Personalization value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return PersonalizationPreview.ADAPTER.encodedSizeWithTag(6, value.preview) + Music.ADAPTER.encodedSizeWithTag(5, value.hydrated_selected_music) + protoAdapter2.encodedSizeWithTag(4, value.selected_music_id) + Element.ADAPTER.asRepeated().encodedSizeWithTag(3, value.elements) + Background.ADAPTER.encodedSizeWithTag(2, value.hydrated_selected_background) + protoAdapter2.encodedSizeWithTag(1, value.selected_background_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Personalization redact(Personalization value) {
                value.getClass();
                Background background = value.hydrated_selected_background;
                Background background2 = background != null ? (Background) Background.ADAPTER.redact(background) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.elements, Element.ADAPTER);
                Music music = value.hydrated_selected_music;
                Music music2 = music != null ? (Music) Music.ADAPTER.redact(music) : null;
                PersonalizationPreview personalizationPreview = value.preview;
                PersonalizationPreview personalizationPreview2 = personalizationPreview != null ? (PersonalizationPreview) PersonalizationPreview.ADAPTER.redact(personalizationPreview) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.selected_background_id;
                String str2 = value.selected_music_id;
                byteString.getClass();
                return new Personalization(str, background2, m1169redactElements, str2, music2, personalizationPreview2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Personalization value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PersonalizationPreview.ADAPTER.encodeWithTag(writer, 6, value.preview);
                Music.ADAPTER.encodeWithTag(writer, 5, value.hydrated_selected_music);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.selected_music_id);
                Element.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.elements);
                Background.ADAPTER.encodeWithTag(writer, 2, value.hydrated_selected_background);
                protoAdapter2.encodeWithTag(writer, 1, value.selected_background_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Personalization(String str, Background background, List list, String str2, Music music, PersonalizationPreview personalizationPreview, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.selected_background_id = str;
        this.hydrated_selected_background = background;
        this.selected_music_id = str2;
        this.hydrated_selected_music = music;
        this.preview = personalizationPreview;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Personalization)) {
            return false;
        }
        Personalization personalization = (Personalization) obj;
        return Intrinsics.areEqual(unknownFields(), personalization.unknownFields()) && Intrinsics.areEqual(this.selected_background_id, personalization.selected_background_id) && Intrinsics.areEqual(this.hydrated_selected_background, personalization.hydrated_selected_background) && Intrinsics.areEqual(this.elements, personalization.elements) && Intrinsics.areEqual(this.selected_music_id, personalization.selected_music_id) && Intrinsics.areEqual(this.hydrated_selected_music, personalization.hydrated_selected_music) && Intrinsics.areEqual(this.preview, personalization.preview);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.selected_background_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Background background = this.hydrated_selected_background;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (background != null ? background.hashCode() : 0)) * 37, 37, this.elements);
        String str2 = this.selected_music_id;
        int hashCode3 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        Music music = this.hydrated_selected_music;
        int hashCode4 = (hashCode3 + (music != null ? music.hashCode() : 0)) * 37;
        PersonalizationPreview personalizationPreview = this.preview;
        int hashCode5 = hashCode4 + (personalizationPreview != null ? personalizationPreview.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.selected_background_id = this.selected_background_id;
        builder.hydrated_selected_background = this.hydrated_selected_background;
        builder.elements = this.elements;
        builder.selected_music_id = this.selected_music_id;
        builder.hydrated_selected_music = this.hydrated_selected_music;
        builder.preview = this.preview;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.selected_background_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_background_id=", arrayList);
        }
        Background background = this.hydrated_selected_background;
        if (background != null) {
            arrayList.add("hydrated_selected_background=" + background);
        }
        if (!this.elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
        }
        String str2 = this.selected_music_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "selected_music_id=", arrayList);
        }
        Music music = this.hydrated_selected_music;
        if (music != null) {
            arrayList.add("hydrated_selected_music=" + music);
        }
        PersonalizationPreview personalizationPreview = this.preview;
        if (personalizationPreview != null) {
            arrayList.add("preview=" + personalizationPreview);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Personalization{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Personalization build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
