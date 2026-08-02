package com.squareup.cash.mosaic.resources.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MEDIA_TYPE_UNSPECIFIED", "MEDIA_TYPE_SVG", "MEDIA_TYPE_PNG", "MEDIA_TYPE_GIF", "MEDIA_TYPE_OTF", "MEDIA_TYPE_TTF", "MEDIA_TYPE_WOFF", "MEDIA_TYPE_WOFF2", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MediaType MEDIA_TYPE_GIF;
    public static final MediaType MEDIA_TYPE_OTF;
    public static final MediaType MEDIA_TYPE_PNG;
    public static final MediaType MEDIA_TYPE_SVG;
    public static final MediaType MEDIA_TYPE_TTF;
    public static final MediaType MEDIA_TYPE_UNSPECIFIED;
    public static final MediaType MEDIA_TYPE_WOFF;
    public static final MediaType MEDIA_TYPE_WOFF2;
    private final int value;

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{MEDIA_TYPE_UNSPECIFIED, MEDIA_TYPE_SVG, MEDIA_TYPE_PNG, MEDIA_TYPE_GIF, MEDIA_TYPE_OTF, MEDIA_TYPE_TTF, MEDIA_TYPE_WOFF, MEDIA_TYPE_WOFF2};
    }

    static {
        final MediaType mediaType = new MediaType("MEDIA_TYPE_UNSPECIFIED", 0, 0);
        MEDIA_TYPE_UNSPECIFIED = mediaType;
        MEDIA_TYPE_SVG = new MediaType("MEDIA_TYPE_SVG", 1, 1);
        MEDIA_TYPE_PNG = new MediaType("MEDIA_TYPE_PNG", 2, 2);
        MEDIA_TYPE_GIF = new MediaType("MEDIA_TYPE_GIF", 3, 3);
        MEDIA_TYPE_OTF = new MediaType("MEDIA_TYPE_OTF", 4, 4);
        MEDIA_TYPE_TTF = new MediaType("MEDIA_TYPE_TTF", 5, 5);
        MEDIA_TYPE_WOFF = new MediaType("MEDIA_TYPE_WOFF", 6, 6);
        MEDIA_TYPE_WOFF2 = new MediaType("MEDIA_TYPE_WOFF2", 7, 7);
        MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MediaType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, mediaType) { // from class: com.squareup.cash.mosaic.resources.api.v2.MediaType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public MediaType fromValue(int value) {
                return MediaType.INSTANCE.fromValue(value);
            }
        };
    }

    private MediaType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final MediaType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/MediaType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/cash/mosaic/resources/api/v2/MediaType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType fromValue(int value) {
            switch (value) {
                case 0:
                    return MediaType.MEDIA_TYPE_UNSPECIFIED;
                case 1:
                    return MediaType.MEDIA_TYPE_SVG;
                case 2:
                    return MediaType.MEDIA_TYPE_PNG;
                case 3:
                    return MediaType.MEDIA_TYPE_GIF;
                case 4:
                    return MediaType.MEDIA_TYPE_OTF;
                case 5:
                    return MediaType.MEDIA_TYPE_TTF;
                case 6:
                    return MediaType.MEDIA_TYPE_WOFF;
                case 7:
                    return MediaType.MEDIA_TYPE_WOFF2;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
