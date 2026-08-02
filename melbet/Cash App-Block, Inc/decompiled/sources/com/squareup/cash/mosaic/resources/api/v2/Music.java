package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/resources/api/v2/Music$Builder;", "", "music_id", "Ljava/lang/String;", "title", "artist", "track_preview_url", "album_art_url", "", "duration_seconds", "Ljava/lang/Integer;", "", "spotlighted", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Music extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Music> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String album_art_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String artist;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    public final Integer duration_seconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String music_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    public final Boolean spotlighted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String track_preview_url;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Music$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "<init>", "()V", "music_id", "", "title", "artist", "track_preview_url", "album_art_url", "duration_seconds", "", "Ljava/lang/Integer;", "spotlighted", "", "Ljava/lang/Boolean;", "(Ljava/lang/Integer;)Lcom/squareup/cash/mosaic/resources/api/v2/Music$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/cash/mosaic/resources/api/v2/Music$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String album_art_url;
        public String artist;
        public Integer duration_seconds;
        public String music_id;
        public Boolean spotlighted;
        public String title;
        public String track_preview_url;

        public final Builder album_art_url(String album_art_url) {
            this.album_art_url = album_art_url;
            return this;
        }

        public final Builder artist(String artist) {
            this.artist = artist;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Music build() {
            return new Music(this.music_id, this.title, this.artist, this.track_preview_url, this.album_art_url, this.duration_seconds, this.spotlighted, buildUnknownFields());
        }

        public final Builder duration_seconds(Integer duration_seconds) {
            this.duration_seconds = duration_seconds;
            return this;
        }

        public final Builder music_id(String music_id) {
            this.music_id = music_id;
            return this;
        }

        public final Builder spotlighted(Boolean spotlighted) {
            this.spotlighted = spotlighted;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder track_preview_url(String track_preview_url) {
            this.track_preview_url = track_preview_url;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Music.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.resources.api.v2.Music$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Music decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Music((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Integer) obj6, (Boolean) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Music value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.music_id);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.artist);
                protoAdapter2.encodeWithTag(writer, 4, value.track_preview_url);
                protoAdapter2.encodeWithTag(writer, 5, value.album_art_url);
                ProtoAdapter.INT32.encodeWithTag(writer, 6, value.duration_seconds);
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.spotlighted);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Music value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(7, value.spotlighted) + ProtoAdapter.INT32.encodedSizeWithTag(6, value.duration_seconds) + protoAdapter2.encodedSizeWithTag(5, value.album_art_url) + protoAdapter2.encodedSizeWithTag(4, value.track_preview_url) + protoAdapter2.encodedSizeWithTag(3, value.artist) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.music_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Music redact(Music value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.music_id;
                String str2 = value.title;
                String str3 = value.artist;
                String str4 = value.track_preview_url;
                String str5 = value.album_art_url;
                Integer num = value.duration_seconds;
                Boolean bool = value.spotlighted;
                value.getClass();
                byteString.getClass();
                return new Music(str, str2, str3, str4, str5, num, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Music value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.spotlighted);
                ProtoAdapter.INT32.encodeWithTag(writer, 6, value.duration_seconds);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.album_art_url);
                protoAdapter2.encodeWithTag(writer, 4, value.track_preview_url);
                protoAdapter2.encodeWithTag(writer, 3, value.artist);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 1, value.music_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Music(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.music_id = str;
        this.title = str2;
        this.artist = str3;
        this.track_preview_url = str4;
        this.album_art_url = str5;
        this.duration_seconds = num;
        this.spotlighted = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        return Intrinsics.areEqual(unknownFields(), music.unknownFields()) && Intrinsics.areEqual(this.music_id, music.music_id) && Intrinsics.areEqual(this.title, music.title) && Intrinsics.areEqual(this.artist, music.artist) && Intrinsics.areEqual(this.track_preview_url, music.track_preview_url) && Intrinsics.areEqual(this.album_art_url, music.album_art_url) && Intrinsics.areEqual(this.duration_seconds, music.duration_seconds) && Intrinsics.areEqual(this.spotlighted, music.spotlighted);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.music_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.artist;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.track_preview_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.album_art_url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num = this.duration_seconds;
        int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.spotlighted;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.music_id = this.music_id;
        builder.title = this.title;
        builder.artist = this.artist;
        builder.track_preview_url = this.track_preview_url;
        builder.album_art_url = this.album_art_url;
        builder.duration_seconds = this.duration_seconds;
        builder.spotlighted = this.spotlighted;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.music_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "music_id=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.artist;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "artist=", arrayList);
        }
        String str4 = this.track_preview_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "track_preview_url=", arrayList);
        }
        String str5 = this.album_art_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "album_art_url=", arrayList);
        }
        Integer num = this.duration_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("duration_seconds=", num, arrayList);
        }
        Boolean bool = this.spotlighted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("spotlighted=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Music{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/Music$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/resources/api/v2/Music$Builder;", "", "body", "Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/resources/api/v2/Music;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Music build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
