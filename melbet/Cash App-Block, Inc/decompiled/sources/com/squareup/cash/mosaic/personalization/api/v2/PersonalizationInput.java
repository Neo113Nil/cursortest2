package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\u000f\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background;", "background", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background;", "", "selected_music_id", "Ljava/lang/String;", "", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "elements", "Ljava/util/List;", "Companion", "Builder", "Background", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalizationInput extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizationInput> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Background background;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<PersonalizationInputElement> elements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String selected_music_id;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "<init>", "()V", "background", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background;", "elements", "", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "selected_music_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Background background;
        public List<PersonalizationInputElement> elements = EmptyList.INSTANCE;
        public String selected_music_id;

        public final Builder background(Background background) {
            this.background = background;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonalizationInput build() {
            return new PersonalizationInput(this.background, this.elements, this.selected_music_id, buildUnknownFields());
        }

        public final Builder elements(List<PersonalizationInputElement> elements) {
            elements.getClass();
            TransactorKt.checkElementsNotNull(elements);
            this.elements = elements;
            return this;
        }

        public final Builder selected_music_id(String selected_music_id) {
            this.selected_music_id = selected_music_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PersonalizationInput.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInput decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                PersonalizationInput.Background.SelectedBackgroundId selectedBackgroundId = null;
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PersonalizationInput(selectedBackgroundId, m, (String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        selectedBackgroundId = new PersonalizationInput.Background.SelectedBackgroundId((String) ProtoAdapter.STRING.decode(reader));
                    } else if (nextTag == 2) {
                        m.add(PersonalizationInputElement.ADAPTER.decode(reader));
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PersonalizationInput value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PersonalizationInput.Background background = value.background;
                if (background instanceof PersonalizationInput.Background.SelectedBackgroundId) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, ((PersonalizationInput.Background.SelectedBackgroundId) background).getValue());
                } else if (background != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.selected_music_id);
                PersonalizationInputElement.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.elements);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PersonalizationInput value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                PersonalizationInput.Background background = value.background;
                if (background instanceof PersonalizationInput.Background.SelectedBackgroundId) {
                    size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, ((PersonalizationInput.Background.SelectedBackgroundId) background).getValue());
                } else if (background != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.selected_music_id) + PersonalizationInputElement.ADAPTER.asRepeated().encodedSizeWithTag(2, value.elements) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInput redact(PersonalizationInput value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.elements, PersonalizationInputElement.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                PersonalizationInput.Background background = value.background;
                String str = value.selected_music_id;
                byteString.getClass();
                return new PersonalizationInput(background, m1169redactElements, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PersonalizationInput value) {
                writer.getClass();
                value.getClass();
                PersonalizationInputElement.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.elements);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.selected_music_id);
                PersonalizationInput.Background background = value.background;
                if (background instanceof PersonalizationInput.Background.SelectedBackgroundId) {
                    protoAdapter2.encodeWithTag(writer, 1, ((PersonalizationInput.Background.SelectedBackgroundId) background).getValue());
                } else if (background != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizationInput(Background background, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.background = background;
        this.selected_music_id = str;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizationInput)) {
            return false;
        }
        PersonalizationInput personalizationInput = (PersonalizationInput) obj;
        return Intrinsics.areEqual(unknownFields(), personalizationInput.unknownFields()) && Intrinsics.areEqual(this.background, personalizationInput.background) && Intrinsics.areEqual(this.elements, personalizationInput.elements) && Intrinsics.areEqual(this.selected_music_id, personalizationInput.selected_music_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Background background = this.background;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (background != null ? background.hashCode() : 0)) * 37, 37, this.elements);
        String str = this.selected_music_id;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.background = this.background;
        builder.elements = this.elements;
        builder.selected_music_id = this.selected_music_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Background background = this.background;
        if (background != null) {
            arrayList.add("background=" + background);
        }
        if (!this.elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
        }
        String str = this.selected_music_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_music_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizationInput{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background;", "", "<init>", "()V", "SelectedBackgroundId", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background$SelectedBackgroundId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Background {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "selected_background_id", tag = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background$SelectedBackgroundId;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Background;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectedBackgroundId extends Background {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectedBackgroundId(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ SelectedBackgroundId copy$default(SelectedBackgroundId selectedBackgroundId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selectedBackgroundId.value;
                }
                return selectedBackgroundId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final SelectedBackgroundId copy(String value) {
                value.getClass();
                return new SelectedBackgroundId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectedBackgroundId) && Intrinsics.areEqual(this.value, ((SelectedBackgroundId) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectedBackgroundId(value=", this.value, ")");
            }
        }

        public /* synthetic */ Background(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Background() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PersonalizationInput build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public PersonalizationInput(Background.SelectedBackgroundId selectedBackgroundId, ArrayList arrayList, String str) {
        this(selectedBackgroundId, arrayList, str, ByteString.EMPTY);
    }
}
