package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Builder;", "", "name", "Ljava/lang/String;", "main_url", "preview_url", "", "priority", "Ljava/lang/Integer;", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "release_state", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "", "is_default", "Ljava/lang/Boolean;", "accessibility_description", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "media_type", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "", "Lcom/squareup/cash/mosaic/resources/api/v2/StickerEffect;", "effects", "Ljava/util/List;", "Lcom/squareup/cash/mosaic/resources/api/v2/Tag;", "tags", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Sticker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Sticker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String accessibility_description;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.StickerEffect#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<StickerEffect> effects;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean is_default;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String main_url;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.MediaType#ADAPTER", schemaIndex = 9, tag = 10)
    public final MediaType media_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String preview_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer priority;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.ReleaseState#ADAPTER", schemaIndex = 5, tag = 6)
    public final ReleaseState release_state;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.Tag#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<Tag> tags;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0019J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "<init>", "()V", "name", "", "main_url", "preview_url", "effects", "", "Lcom/squareup/cash/mosaic/resources/api/v2/StickerEffect;", "priority", "", "Ljava/lang/Integer;", "release_state", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "tags", "Lcom/squareup/cash/mosaic/resources/api/v2/Tag;", "is_default", "", "Ljava/lang/Boolean;", "accessibility_description", "media_type", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "(Ljava/lang/Integer;)Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accessibility_description;
        public List<? extends StickerEffect> effects;
        public Boolean is_default;
        public String main_url;
        public MediaType media_type;
        public String name;
        public String preview_url;
        public Integer priority;
        public ReleaseState release_state;
        public List<Tag> tags;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.effects = emptyList;
            this.tags = emptyList;
        }

        public final Builder accessibility_description(String accessibility_description) {
            this.accessibility_description = accessibility_description;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Sticker build() {
            return new Sticker(this.name, this.main_url, this.preview_url, this.effects, this.priority, this.release_state, this.tags, this.is_default, this.accessibility_description, this.media_type, buildUnknownFields());
        }

        public final Builder effects(List<? extends StickerEffect> effects) {
            effects.getClass();
            TransactorKt.checkElementsNotNull(effects);
            this.effects = effects;
            return this;
        }

        public final Builder is_default(Boolean is_default) {
            this.is_default = is_default;
            return this;
        }

        public final Builder main_url(String main_url) {
            this.main_url = main_url;
            return this;
        }

        public final Builder media_type(MediaType media_type) {
            this.media_type = media_type;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder preview_url(String preview_url) {
            this.preview_url = preview_url;
            return this;
        }

        public final Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        public final Builder release_state(ReleaseState release_state) {
            this.release_state = release_state;
            return this;
        }

        public final Builder tags(List<Tag> tags) {
            tags.getClass();
            TransactorKt.checkElementsNotNull(tags);
            this.tags = tags;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Sticker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.resources.api.v2.Sticker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Sticker decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                ArrayList arrayList;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Sticker((String) obj3, (String) obj4, (String) obj5, m, (Integer) obj6, (ReleaseState) obj7, arrayList2, (Boolean) obj8, (String) obj9, (MediaType) obj10, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = arrayList2;
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = arrayList2;
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            arrayList = arrayList2;
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj = obj3;
                            obj2 = obj4;
                            arrayList = arrayList2;
                            try {
                                StickerEffect.ADAPTER.tryDecode(reader, m);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                        case 5:
                            arrayList = arrayList2;
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 6:
                            obj = obj3;
                            obj2 = obj4;
                            try {
                                obj3 = obj;
                                obj7 = ReleaseState.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                arrayList = arrayList2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            obj4 = obj2;
                            break;
                        case 7:
                            obj = obj3;
                            obj2 = obj4;
                            arrayList2.add(Tag.ADAPTER.decode(reader));
                            arrayList = arrayList2;
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                        case 8:
                            obj8 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 9:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 10:
                            try {
                                obj10 = MediaType.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            arrayList = arrayList2;
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                    }
                    arrayList2 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Sticker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.name);
                protoAdapter2.encodeWithTag(writer, 2, value.main_url);
                protoAdapter2.encodeWithTag(writer, 3, value.preview_url);
                StickerEffect.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.effects);
                ProtoAdapter.INT32.encodeWithTag(writer, 5, value.priority);
                ReleaseState.ADAPTER.encodeWithTag(writer, 6, value.release_state);
                Tag.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.tags);
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.is_default);
                protoAdapter2.encodeWithTag(writer, 9, value.accessibility_description);
                MediaType.ADAPTER.encodeWithTag(writer, 10, value.media_type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Sticker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return MediaType.ADAPTER.encodedSizeWithTag(10, value.media_type) + protoAdapter2.encodedSizeWithTag(9, value.accessibility_description) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.is_default) + Tag.ADAPTER.asRepeated().encodedSizeWithTag(7, value.tags) + ReleaseState.ADAPTER.encodedSizeWithTag(6, value.release_state) + ProtoAdapter.INT32.encodedSizeWithTag(5, value.priority) + StickerEffect.ADAPTER.asRepeated().encodedSizeWithTag(4, value.effects) + protoAdapter2.encodedSizeWithTag(3, value.preview_url) + protoAdapter2.encodedSizeWithTag(2, value.main_url) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Sticker redact(Sticker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.tags, Tag.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.name;
                String str2 = value.main_url;
                String str3 = value.preview_url;
                List<StickerEffect> list = value.effects;
                Integer num = value.priority;
                ReleaseState releaseState = value.release_state;
                Boolean bool = value.is_default;
                String str4 = value.accessibility_description;
                MediaType mediaType = value.media_type;
                list.getClass();
                byteString.getClass();
                return new Sticker(str, str2, str3, list, num, releaseState, m1169redactElements, bool, str4, mediaType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Sticker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                MediaType.ADAPTER.encodeWithTag(writer, 10, value.media_type);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.accessibility_description);
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.is_default);
                Tag.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.tags);
                ReleaseState.ADAPTER.encodeWithTag(writer, 6, value.release_state);
                ProtoAdapter.INT32.encodeWithTag(writer, 5, value.priority);
                StickerEffect.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.effects);
                protoAdapter2.encodeWithTag(writer, 3, value.preview_url);
                protoAdapter2.encodeWithTag(writer, 2, value.main_url);
                protoAdapter2.encodeWithTag(writer, 1, value.name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sticker(String str, String str2, String str3, List list, Integer num, ReleaseState releaseState, List list2, Boolean bool, String str4, MediaType mediaType, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.name = str;
        this.main_url = str2;
        this.preview_url = str3;
        this.priority = num;
        this.release_state = releaseState;
        this.is_default = bool;
        this.accessibility_description = str4;
        this.media_type = mediaType;
        this.effects = TransactorKt.immutableCopyOf("effects", list);
        this.tags = TransactorKt.immutableCopyOf("tags", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return Intrinsics.areEqual(unknownFields(), sticker.unknownFields()) && Intrinsics.areEqual(this.name, sticker.name) && Intrinsics.areEqual(this.main_url, sticker.main_url) && Intrinsics.areEqual(this.preview_url, sticker.preview_url) && Intrinsics.areEqual(this.effects, sticker.effects) && Intrinsics.areEqual(this.priority, sticker.priority) && this.release_state == sticker.release_state && Intrinsics.areEqual(this.tags, sticker.tags) && Intrinsics.areEqual(this.is_default, sticker.is_default) && Intrinsics.areEqual(this.accessibility_description, sticker.accessibility_description) && this.media_type == sticker.media_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.main_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.preview_url;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.effects);
        Integer num = this.priority;
        int hashCode4 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ReleaseState releaseState = this.release_state;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (releaseState != null ? releaseState.hashCode() : 0)) * 37, 37, this.tags);
        Boolean bool = this.is_default;
        int hashCode5 = (m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.accessibility_description;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        MediaType mediaType = this.media_type;
        int hashCode7 = hashCode6 + (mediaType != null ? mediaType.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.main_url = this.main_url;
        builder.preview_url = this.preview_url;
        builder.effects = this.effects;
        builder.priority = this.priority;
        builder.release_state = this.release_state;
        builder.tags = this.tags;
        builder.is_default = this.is_default;
        builder.accessibility_description = this.accessibility_description;
        builder.media_type = this.media_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.main_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_url=", arrayList);
        }
        String str3 = this.preview_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preview_url=", arrayList);
        }
        if (!this.effects.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("effects=", arrayList, this.effects);
        }
        Integer num = this.priority;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("priority=", num, arrayList);
        }
        ReleaseState releaseState = this.release_state;
        if (releaseState != null) {
            arrayList.add("release_state=" + releaseState);
        }
        if (!this.tags.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tags=", arrayList, this.tags);
        }
        Boolean bool = this.is_default;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_default=", bool, arrayList);
        }
        String str4 = this.accessibility_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "accessibility_description=", arrayList);
        }
        MediaType mediaType = this.media_type;
        if (mediaType != null) {
            arrayList.add("media_type=" + mediaType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Sticker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker$Builder;", "", "body", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Sticker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
