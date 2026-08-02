package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.protos.cash.ui.Color;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/resources/api/v2/Background$Builder;", "", "name", "Ljava/lang/String;", "main_url", "preview_url", "Lcom/squareup/protos/cash/ui/Color;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "default_text_format", "Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "", "priority", "Ljava/lang/Integer;", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "release_state", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "", "is_default", "Ljava/lang/Boolean;", "accessibility_description", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "media_type", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "", "Lcom/squareup/cash/mosaic/resources/api/v2/BackgroundEffect;", "effects", "Ljava/util/List;", "Lcom/squareup/cash/mosaic/resources/api/v2/Tag;", "tags", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Background extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Background> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String accessibility_description;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 3, tag = 4)
    public final Color background_color;

    @WireField(adapter = "com.squareup.cash.mosaic.models.v1.TextFormat#ADAPTER", schemaIndex = 4, tag = 5)
    public final TextFormat default_text_format;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.BackgroundEffect#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    public final List<BackgroundEffect> effects;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    public final Boolean is_default;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String main_url;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.MediaType#ADAPTER", schemaIndex = 11, tag = 12)
    public final MediaType media_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String preview_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 6, tag = 7)
    public final Integer priority;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.ReleaseState#ADAPTER", schemaIndex = 7, tag = 8)
    public final ReleaseState release_state;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.Tag#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    public final List<Tag> tags;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eJ\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Background$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "<init>", "()V", "name", "", "main_url", "preview_url", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "default_text_format", "Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "effects", "", "Lcom/squareup/cash/mosaic/resources/api/v2/BackgroundEffect;", "priority", "", "Ljava/lang/Integer;", "release_state", "Lcom/squareup/cash/mosaic/resources/api/v2/ReleaseState;", "tags", "Lcom/squareup/cash/mosaic/resources/api/v2/Tag;", "is_default", "", "Ljava/lang/Boolean;", "accessibility_description", "media_type", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "(Ljava/lang/Integer;)Lcom/squareup/cash/mosaic/resources/api/v2/Background$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/cash/mosaic/resources/api/v2/Background$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accessibility_description;
        public Color background_color;
        public TextFormat default_text_format;
        public List<? extends BackgroundEffect> effects;
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

        public final Builder background_color(Color background_color) {
            this.background_color = background_color;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Background build() {
            return new Background(this.name, this.main_url, this.preview_url, this.background_color, this.default_text_format, this.effects, this.priority, this.release_state, this.tags, this.is_default, this.accessibility_description, this.media_type, buildUnknownFields());
        }

        public final Builder default_text_format(TextFormat default_text_format) {
            this.default_text_format = default_text_format;
            return this;
        }

        public final Builder effects(List<? extends BackgroundEffect> effects) {
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
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Background.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.resources.api.v2.Background$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37 */
            /* JADX WARN: Type inference failed for: r0v38 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public Background decode(ProtoReader reader) {
                String str;
                Integer num;
                ReleaseState releaseState;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Object obj = null;
                Object obj2 = null;
                Integer num2 = null;
                ReleaseState releaseState2 = null;
                Boolean bool = null;
                String str5 = null;
                MediaType mediaType = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Background(str2, str3, str4, (Color) obj, (TextFormat) obj2, m, num2, releaseState2, arrayList, bool, str5, mediaType, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 3:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 4:
                            obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                            decode = str2;
                            break;
                        case 5:
                            obj2 = TransactorKt.decodeMessageOrMerge(TextFormat.ADAPTER, reader, obj2);
                            decode = str2;
                            break;
                        case 6:
                            str = str3;
                            num = num2;
                            releaseState = releaseState2;
                            try {
                                BackgroundEffect.ADAPTER.tryDecode(reader, m);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            releaseState2 = releaseState;
                            break;
                        case 7:
                            num2 = ProtoAdapter.INT32.decode(reader);
                            decode = str2;
                            break;
                        case 8:
                            str = str3;
                            num = num2;
                            releaseState = releaseState2;
                            try {
                                releaseState2 = ReleaseState.ADAPTER.decode(reader);
                                str3 = str;
                                num2 = num;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 9:
                            str = str3;
                            num = num2;
                            releaseState = releaseState2;
                            arrayList.add(Tag.ADAPTER.decode(reader));
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            releaseState2 = releaseState;
                            break;
                        case 10:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str2;
                            break;
                        case 11:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 12:
                            try {
                                mediaType = MediaType.ADAPTER.decode(reader);
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                str = str3;
                                num = num2;
                                releaseState = releaseState2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            str = str3;
                            num = num2;
                            releaseState = releaseState2;
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            releaseState2 = releaseState;
                            break;
                    }
                    str2 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Background value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.name);
                protoAdapter2.encodeWithTag(writer, 2, value.main_url);
                protoAdapter2.encodeWithTag(writer, 3, value.preview_url);
                Color.ADAPTER.encodeWithTag(writer, 4, value.background_color);
                TextFormat.ADAPTER.encodeWithTag(writer, 5, value.default_text_format);
                BackgroundEffect.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.effects);
                ProtoAdapter.INT32.encodeWithTag(writer, 7, value.priority);
                ReleaseState.ADAPTER.encodeWithTag(writer, 8, value.release_state);
                Tag.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.tags);
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.is_default);
                protoAdapter2.encodeWithTag(writer, 11, value.accessibility_description);
                MediaType.ADAPTER.encodeWithTag(writer, 12, value.media_type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Background value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return MediaType.ADAPTER.encodedSizeWithTag(12, value.media_type) + protoAdapter2.encodedSizeWithTag(11, value.accessibility_description) + ProtoAdapter.BOOL.encodedSizeWithTag(10, value.is_default) + Tag.ADAPTER.asRepeated().encodedSizeWithTag(9, value.tags) + ReleaseState.ADAPTER.encodedSizeWithTag(8, value.release_state) + ProtoAdapter.INT32.encodedSizeWithTag(7, value.priority) + BackgroundEffect.ADAPTER.asRepeated().encodedSizeWithTag(6, value.effects) + TextFormat.ADAPTER.encodedSizeWithTag(5, value.default_text_format) + Color.ADAPTER.encodedSizeWithTag(4, value.background_color) + protoAdapter2.encodedSizeWithTag(3, value.preview_url) + protoAdapter2.encodedSizeWithTag(2, value.main_url) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Background redact(Background value) {
                value.getClass();
                Color color = value.background_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                TextFormat textFormat = value.default_text_format;
                TextFormat textFormat2 = textFormat != null ? (TextFormat) TextFormat.ADAPTER.redact(textFormat) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.tags, Tag.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.name;
                String str2 = value.main_url;
                String str3 = value.preview_url;
                List<BackgroundEffect> list = value.effects;
                Integer num = value.priority;
                ReleaseState releaseState = value.release_state;
                Boolean bool = value.is_default;
                String str4 = value.accessibility_description;
                MediaType mediaType = value.media_type;
                list.getClass();
                byteString.getClass();
                return new Background(str, str2, str3, color2, textFormat2, list, num, releaseState, m1169redactElements, bool, str4, mediaType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Background value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                MediaType.ADAPTER.encodeWithTag(writer, 12, value.media_type);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 11, value.accessibility_description);
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.is_default);
                Tag.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.tags);
                ReleaseState.ADAPTER.encodeWithTag(writer, 8, value.release_state);
                ProtoAdapter.INT32.encodeWithTag(writer, 7, value.priority);
                BackgroundEffect.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.effects);
                TextFormat.ADAPTER.encodeWithTag(writer, 5, value.default_text_format);
                Color.ADAPTER.encodeWithTag(writer, 4, value.background_color);
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
    public Background(String str, String str2, String str3, Color color, TextFormat textFormat, List list, Integer num, ReleaseState releaseState, List list2, Boolean bool, String str4, MediaType mediaType, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.name = str;
        this.main_url = str2;
        this.preview_url = str3;
        this.background_color = color;
        this.default_text_format = textFormat;
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
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Intrinsics.areEqual(unknownFields(), background.unknownFields()) && Intrinsics.areEqual(this.name, background.name) && Intrinsics.areEqual(this.main_url, background.main_url) && Intrinsics.areEqual(this.preview_url, background.preview_url) && Intrinsics.areEqual(this.background_color, background.background_color) && Intrinsics.areEqual(this.default_text_format, background.default_text_format) && Intrinsics.areEqual(this.effects, background.effects) && Intrinsics.areEqual(this.priority, background.priority) && this.release_state == background.release_state && Intrinsics.areEqual(this.tags, background.tags) && Intrinsics.areEqual(this.is_default, background.is_default) && Intrinsics.areEqual(this.accessibility_description, background.accessibility_description) && this.media_type == background.media_type;
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
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        TextFormat textFormat = this.default_text_format;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (textFormat != null ? textFormat.hashCode() : 0)) * 37, 37, this.effects);
        Integer num = this.priority;
        int hashCode6 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ReleaseState releaseState = this.release_state;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (releaseState != null ? releaseState.hashCode() : 0)) * 37, 37, this.tags);
        Boolean bool = this.is_default;
        int hashCode7 = (m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.accessibility_description;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        MediaType mediaType = this.media_type;
        int hashCode9 = hashCode8 + (mediaType != null ? mediaType.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.main_url = this.main_url;
        builder.preview_url = this.preview_url;
        builder.background_color = this.background_color;
        builder.default_text_format = this.default_text_format;
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
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        TextFormat textFormat = this.default_text_format;
        if (textFormat != null) {
            arrayList.add("default_text_format=" + textFormat);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "Background{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Background$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/resources/api/v2/Background$Builder;", "", "body", "Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/resources/api/v2/Background;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Background build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
