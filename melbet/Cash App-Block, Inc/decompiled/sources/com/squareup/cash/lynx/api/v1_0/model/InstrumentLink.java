package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.appsflyer.AdRevenueScheme;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLink;
import com.squareup.protos.common.countries.Country;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00044563R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0005R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020%008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Builder;", "", "instrument_link_token", "Ljava/lang/String;", "owner_token", "instrument_token", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkStatusType;", "link_status", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkStatusType;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType;", "instrument_type", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType;", "fidelius_token", "Lcom/squareup/protos/common/countries/Country;", AdRevenueScheme.COUNTRY, "Lcom/squareup/protos/common/countries/Country;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "instrument", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "", "created_at_ms", "Ljava/lang/Long;", "updated_at_ms", "entity_version", "finplat_instrument_token", "unlinked_at_ms", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkVerificationMethod;", "link_verification_method", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkVerificationMethod;", "plaid_persistent_account_id", "", "linked_as_inactive", "Ljava/lang/Boolean;", "default_for_instrument_type", "persistent_account_reference", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope;", "instrument_scope", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope;", "getInstrument_scope$annotations", "()V", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "digital_wallet_payment_token", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "instrument_display_details", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "", "instrument_scopes", "Ljava/util/List;", "Companion", "Builder", "Instrument", "DigitalWalletPaymentToken", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLink> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 6, tag = 12)
    public final Country country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = 9)
    public final Long created_at_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 16, tag = 21)
    public final Boolean default_for_instrument_type;

    @WireSealedOneof(schemaIndex = 20)
    public final DigitalWalletPaymentToken digital_wallet_payment_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 10, tag = 11)
    public final Long entity_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String fidelius_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 14)
    public final String finplat_instrument_token;

    @WireSealedOneof(schemaIndex = 7)
    public final Instrument instrument;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.InstrumentDisplayDetails#ADAPTER", schemaIndex = 21, tag = 23)
    public final InstrumentDisplayDetails instrument_display_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String instrument_link_token;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.InstrumentScope#ADAPTER", schemaIndex = 18, tag = 24)
    public final InstrumentScope instrument_scope;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.InstrumentScope#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 25)
    public final List<InstrumentScope> instrument_scopes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String instrument_token;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.InstrumentType#ADAPTER", schemaIndex = 4, tag = 5)
    public final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.LinkStatusType#ADAPTER", schemaIndex = 3, tag = 4)
    public final LinkStatusType link_status;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.LinkVerificationMethod#ADAPTER", schemaIndex = 13, tag = 16)
    public final LinkVerificationMethod link_verification_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 15, tag = 20)
    public final Boolean linked_as_inactive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String owner_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 17, tag = 22)
    public final String persistent_account_reference;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 17)
    public final String plaid_persistent_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 12, tag = 15)
    public final Long unlinked_at_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 9, tag = 10)
    public final Long updated_at_ms;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010*J\u0015\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010*J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u0012\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0014\u0010#\u001a\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010+\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "<init>", "()V", "instrument_link_token", "", "owner_token", "instrument_token", "link_status", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkStatusType;", "instrument_type", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType;", "fidelius_token", AdRevenueScheme.COUNTRY, "Lcom/squareup/protos/common/countries/Country;", "instrument", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "created_at_ms", "", "Ljava/lang/Long;", "updated_at_ms", "entity_version", "finplat_instrument_token", "unlinked_at_ms", "link_verification_method", "Lcom/squareup/cash/lynx/api/v1_0/model/LinkVerificationMethod;", "plaid_persistent_account_id", "linked_as_inactive", "", "Ljava/lang/Boolean;", "default_for_instrument_type", "persistent_account_reference", "instrument_scope", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope;", "instrument_scopes", "", "digital_wallet_payment_token", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "instrument_display_details", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "(Ljava/lang/Long;)Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Country country;
        public Long created_at_ms;
        public Boolean default_for_instrument_type;
        public DigitalWalletPaymentToken digital_wallet_payment_token;
        public Long entity_version;
        public String fidelius_token;
        public String finplat_instrument_token;
        public Instrument instrument;
        public InstrumentDisplayDetails instrument_display_details;
        public String instrument_link_token;
        public InstrumentScope instrument_scope;
        public List<? extends InstrumentScope> instrument_scopes = EmptyList.INSTANCE;
        public String instrument_token;
        public InstrumentType instrument_type;
        public LinkStatusType link_status;
        public LinkVerificationMethod link_verification_method;
        public Boolean linked_as_inactive;
        public String owner_token;
        public String persistent_account_reference;
        public String plaid_persistent_account_id;
        public Long unlinked_at_ms;
        public Long updated_at_ms;

        @Override // com.squareup.wire.Message.Builder
        public InstrumentLink build() {
            return new InstrumentLink(this.instrument_link_token, this.owner_token, this.instrument_token, this.link_status, this.instrument_type, this.fidelius_token, this.country, this.instrument, this.created_at_ms, this.updated_at_ms, this.entity_version, this.finplat_instrument_token, this.unlinked_at_ms, this.link_verification_method, this.plaid_persistent_account_id, this.linked_as_inactive, this.default_for_instrument_type, this.persistent_account_reference, this.instrument_scope, this.instrument_scopes, this.digital_wallet_payment_token, this.instrument_display_details, buildUnknownFields());
        }

        public final Builder country(Country country) {
            this.country = country;
            return this;
        }

        public final Builder created_at_ms(Long created_at_ms) {
            this.created_at_ms = created_at_ms;
            return this;
        }

        public final Builder default_for_instrument_type(Boolean default_for_instrument_type) {
            this.default_for_instrument_type = default_for_instrument_type;
            return this;
        }

        public final Builder digital_wallet_payment_token(DigitalWalletPaymentToken digital_wallet_payment_token) {
            this.digital_wallet_payment_token = digital_wallet_payment_token;
            return this;
        }

        public final Builder entity_version(Long entity_version) {
            this.entity_version = entity_version;
            return this;
        }

        public final Builder fidelius_token(String fidelius_token) {
            this.fidelius_token = fidelius_token;
            return this;
        }

        public final Builder finplat_instrument_token(String finplat_instrument_token) {
            this.finplat_instrument_token = finplat_instrument_token;
            return this;
        }

        public final Builder instrument(Instrument instrument) {
            this.instrument = instrument;
            return this;
        }

        public final Builder instrument_display_details(InstrumentDisplayDetails instrument_display_details) {
            this.instrument_display_details = instrument_display_details;
            return this;
        }

        public final Builder instrument_link_token(String instrument_link_token) {
            this.instrument_link_token = instrument_link_token;
            return this;
        }

        @Deprecated
        public final Builder instrument_scope(InstrumentScope instrument_scope) {
            this.instrument_scope = instrument_scope;
            return this;
        }

        public final Builder instrument_scopes(List<? extends InstrumentScope> instrument_scopes) {
            instrument_scopes.getClass();
            TransactorKt.checkElementsNotNull(instrument_scopes);
            this.instrument_scopes = instrument_scopes;
            return this;
        }

        public final Builder instrument_token(String instrument_token) {
            this.instrument_token = instrument_token;
            return this;
        }

        public final Builder instrument_type(InstrumentType instrument_type) {
            this.instrument_type = instrument_type;
            return this;
        }

        public final Builder link_status(LinkStatusType link_status) {
            this.link_status = link_status;
            return this;
        }

        public final Builder link_verification_method(LinkVerificationMethod link_verification_method) {
            this.link_verification_method = link_verification_method;
            return this;
        }

        public final Builder linked_as_inactive(Boolean linked_as_inactive) {
            this.linked_as_inactive = linked_as_inactive;
            return this;
        }

        public final Builder owner_token(String owner_token) {
            this.owner_token = owner_token;
            return this;
        }

        public final Builder persistent_account_reference(String persistent_account_reference) {
            this.persistent_account_reference = persistent_account_reference;
            return this;
        }

        public final Builder plaid_persistent_account_id(String plaid_persistent_account_id) {
            this.plaid_persistent_account_id = plaid_persistent_account_id;
            return this;
        }

        public final Builder unlinked_at_ms(Long unlinked_at_ms) {
            this.unlinked_at_ms = unlinked_at_ms;
            return this;
        }

        public final Builder updated_at_ms(Long updated_at_ms) {
            this.updated_at_ms = updated_at_ms;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentLink.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.InstrumentLink$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v63 */
            /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v69 */
            /* JADX WARN: Type inference failed for: r0v70 */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentLink decode(ProtoReader reader) {
                ArrayList arrayList;
                String str;
                LinkStatusType linkStatusType;
                ?? decode;
                InstrumentLink.Instrument card;
                InstrumentLink.DigitalWalletPaymentToken applePayPaymentToken;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str2 = null;
                Object obj = null;
                String str3 = null;
                LinkStatusType linkStatusType2 = null;
                InstrumentType instrumentType = null;
                String str4 = null;
                Country country = null;
                InstrumentLink.Instrument instrument = null;
                Long l = null;
                Long l2 = null;
                Long l3 = null;
                String str5 = null;
                Long l4 = null;
                LinkVerificationMethod linkVerificationMethod = null;
                String str6 = null;
                Boolean bool = null;
                Boolean bool2 = null;
                String str7 = null;
                InstrumentScope instrumentScope = null;
                InstrumentLink.DigitalWalletPaymentToken digitalWalletPaymentToken = null;
                String str8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InstrumentLink(str2, str8, str3, linkStatusType2, instrumentType, str4, country, instrument, l, l2, l3, str5, l4, linkVerificationMethod, str6, bool, bool2, str7, instrumentScope, m, digitalWalletPaymentToken, (InstrumentDisplayDetails) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = m;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = m;
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 3:
                            arrayList = m;
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 4:
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            try {
                                linkStatusType2 = LinkStatusType.ADAPTER.decode(reader);
                                str3 = str;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            try {
                                instrumentType = InstrumentType.ADAPTER.decode(reader);
                                str3 = str;
                                linkStatusType2 = linkStatusType;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 6:
                            arrayList = m;
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 7:
                            arrayList = m;
                            card = new InstrumentLink.Instrument.Card((Card) Card.ADAPTER.decode(reader));
                            instrument = card;
                            decode = str2;
                            break;
                        case 8:
                            arrayList = m;
                            card = new InstrumentLink.Instrument.BankAccount((BankAccount) BankAccount.ADAPTER.decode(reader));
                            instrument = card;
                            decode = str2;
                            break;
                        case 9:
                            arrayList = m;
                            l = ProtoAdapter.INT64.decode(reader);
                            decode = str2;
                            break;
                        case 10:
                            arrayList = m;
                            l2 = ProtoAdapter.INT64.decode(reader);
                            decode = str2;
                            break;
                        case 11:
                            arrayList = m;
                            l3 = ProtoAdapter.INT64.decode(reader);
                            decode = str2;
                            break;
                        case 12:
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            try {
                                country = Country.ADAPTER.decode(reader);
                                str3 = str;
                                linkStatusType2 = linkStatusType;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 13:
                            arrayList = m;
                            card = new InstrumentLink.Instrument.StoredValueBalance((StoredValueBalance) StoredValueBalance.ADAPTER.decode(reader));
                            instrument = card;
                            decode = str2;
                            break;
                        case 14:
                            arrayList = m;
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 15:
                            arrayList = m;
                            l4 = ProtoAdapter.INT64.decode(reader);
                            decode = str2;
                            break;
                        case 16:
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            try {
                                linkVerificationMethod = LinkVerificationMethod.ADAPTER.decode(reader);
                                str3 = str;
                                linkStatusType2 = linkStatusType;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 17:
                            arrayList = m;
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 18:
                            arrayList = m;
                            applePayPaymentToken = new InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken((ApplePayPaymentToken) ApplePayPaymentToken.ADAPTER.decode(reader));
                            digitalWalletPaymentToken = applePayPaymentToken;
                            decode = str2;
                            break;
                        case 19:
                            arrayList = m;
                            applePayPaymentToken = new InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken((GooglePayPaymentToken) GooglePayPaymentToken.ADAPTER.decode(reader));
                            digitalWalletPaymentToken = applePayPaymentToken;
                            decode = str2;
                            break;
                        case 20:
                            arrayList = m;
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str2;
                            break;
                        case 21:
                            arrayList = m;
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str2;
                            break;
                        case 22:
                            arrayList = m;
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 23:
                            arrayList = m;
                            obj = TransactorKt.decodeMessageOrMerge(InstrumentDisplayDetails.ADAPTER, reader, obj);
                            decode = str2;
                            break;
                        case 24:
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            try {
                                instrumentScope = InstrumentScope.ADAPTER.decode(reader);
                                str3 = str;
                                linkStatusType2 = linkStatusType;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 25:
                            try {
                                InstrumentScope.ADAPTER.tryDecode(reader, m);
                                arrayList = m;
                                str = str3;
                                linkStatusType = linkStatusType2;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                arrayList = m;
                                str = str3;
                                linkStatusType = linkStatusType2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            decode = str2;
                            str3 = str;
                            linkStatusType2 = linkStatusType;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            arrayList = m;
                            str = str3;
                            linkStatusType = linkStatusType2;
                            decode = str2;
                            str3 = str;
                            linkStatusType2 = linkStatusType;
                            break;
                    }
                    str2 = decode;
                    m = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentLink value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.instrument_link_token);
                protoAdapter2.encodeWithTag(writer, 2, value.owner_token);
                protoAdapter2.encodeWithTag(writer, 3, value.instrument_token);
                LinkStatusType.ADAPTER.encodeWithTag(writer, 4, value.link_status);
                InstrumentType.ADAPTER.encodeWithTag(writer, 5, value.instrument_type);
                protoAdapter2.encodeWithTag(writer, 6, value.fidelius_token);
                Country.ADAPTER.encodeWithTag(writer, 12, value.country);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 9, value.created_at_ms);
                protoAdapter3.encodeWithTag(writer, 10, value.updated_at_ms);
                protoAdapter3.encodeWithTag(writer, 11, value.entity_version);
                protoAdapter2.encodeWithTag(writer, 14, value.finplat_instrument_token);
                protoAdapter3.encodeWithTag(writer, 15, value.unlinked_at_ms);
                LinkVerificationMethod.ADAPTER.encodeWithTag(writer, 16, value.link_verification_method);
                protoAdapter2.encodeWithTag(writer, 17, value.plaid_persistent_account_id);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 20, value.linked_as_inactive);
                protoAdapter4.encodeWithTag(writer, 21, value.default_for_instrument_type);
                protoAdapter2.encodeWithTag(writer, 22, value.persistent_account_reference);
                ProtoAdapter protoAdapter5 = InstrumentScope.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 24, value.instrument_scope);
                protoAdapter5.asRepeated().encodeWithTag(writer, 25, value.instrument_scopes);
                InstrumentDisplayDetails.ADAPTER.encodeWithTag(writer, 23, value.instrument_display_details);
                InstrumentLink.Instrument instrument = value.instrument;
                if (instrument instanceof InstrumentLink.Instrument.Card) {
                    Card.ADAPTER.encodeWithTag(writer, 7, ((InstrumentLink.Instrument.Card) instrument).getValue());
                } else if (instrument instanceof InstrumentLink.Instrument.BankAccount) {
                    BankAccount.ADAPTER.encodeWithTag(writer, 8, ((InstrumentLink.Instrument.BankAccount) instrument).getValue());
                } else if (instrument instanceof InstrumentLink.Instrument.StoredValueBalance) {
                    StoredValueBalance.ADAPTER.encodeWithTag(writer, 13, ((InstrumentLink.Instrument.StoredValueBalance) instrument).getValue());
                } else if (instrument != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InstrumentLink.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(writer, 18, ((InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(writer, 19, ((InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0108  */
            @Override // com.squareup.wire.ProtoAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int encodedSize(InstrumentLink value) {
                int encodedSizeWithTag;
                InstrumentLink.DigitalWalletPaymentToken digitalWalletPaymentToken;
                int encodedSizeWithTag2;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = Country.ADAPTER.encodedSizeWithTag(12, value.country) + protoAdapter2.encodedSizeWithTag(6, value.fidelius_token) + InstrumentType.ADAPTER.encodedSizeWithTag(5, value.instrument_type) + LinkStatusType.ADAPTER.encodedSizeWithTag(4, value.link_status) + protoAdapter2.encodedSizeWithTag(3, value.instrument_token) + protoAdapter2.encodedSizeWithTag(2, value.owner_token) + protoAdapter2.encodedSizeWithTag(1, value.instrument_link_token) + size$okio;
                InstrumentLink.Instrument instrument = value.instrument;
                if (instrument instanceof InstrumentLink.Instrument.Card) {
                    encodedSizeWithTag = Card.ADAPTER.encodedSizeWithTag(7, ((InstrumentLink.Instrument.Card) instrument).getValue());
                } else if (instrument instanceof InstrumentLink.Instrument.BankAccount) {
                    encodedSizeWithTag = BankAccount.ADAPTER.encodedSizeWithTag(8, ((InstrumentLink.Instrument.BankAccount) instrument).getValue());
                } else {
                    if (!(instrument instanceof InstrumentLink.Instrument.StoredValueBalance)) {
                        if (instrument != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(17, value.plaid_persistent_account_id) + LinkVerificationMethod.ADAPTER.encodedSizeWithTag(16, value.link_verification_method) + protoAdapter3.encodedSizeWithTag(15, value.unlinked_at_ms) + protoAdapter2.encodedSizeWithTag(14, value.finplat_instrument_token) + protoAdapter3.encodedSizeWithTag(11, value.entity_version) + protoAdapter3.encodedSizeWithTag(10, value.updated_at_ms) + protoAdapter3.encodedSizeWithTag(9, value.created_at_ms) + encodedSizeWithTag3;
                        ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                        int encodedSizeWithTag5 = protoAdapter2.encodedSizeWithTag(22, value.persistent_account_reference) + protoAdapter4.encodedSizeWithTag(21, value.default_for_instrument_type) + protoAdapter4.encodedSizeWithTag(20, value.linked_as_inactive) + encodedSizeWithTag4;
                        ProtoAdapter protoAdapter5 = InstrumentScope.ADAPTER;
                        int encodedSizeWithTag6 = protoAdapter5.asRepeated().encodedSizeWithTag(25, value.instrument_scopes) + protoAdapter5.encodedSizeWithTag(24, value.instrument_scope) + encodedSizeWithTag5;
                        digitalWalletPaymentToken = value.digital_wallet_payment_token;
                        if (!(digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken)) {
                            encodedSizeWithTag2 = ApplePayPaymentToken.ADAPTER.encodedSizeWithTag(18, ((InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                        } else {
                            if (!(digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken)) {
                                if (digitalWalletPaymentToken != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                return InstrumentDisplayDetails.ADAPTER.encodedSizeWithTag(23, value.instrument_display_details) + encodedSizeWithTag6;
                            }
                            encodedSizeWithTag2 = GooglePayPaymentToken.ADAPTER.encodedSizeWithTag(19, ((InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                        }
                        encodedSizeWithTag6 += encodedSizeWithTag2;
                        return InstrumentDisplayDetails.ADAPTER.encodedSizeWithTag(23, value.instrument_display_details) + encodedSizeWithTag6;
                    }
                    encodedSizeWithTag = StoredValueBalance.ADAPTER.encodedSizeWithTag(13, ((InstrumentLink.Instrument.StoredValueBalance) instrument).getValue());
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                ProtoAdapter protoAdapter32 = ProtoAdapter.INT64;
                int encodedSizeWithTag42 = protoAdapter2.encodedSizeWithTag(17, value.plaid_persistent_account_id) + LinkVerificationMethod.ADAPTER.encodedSizeWithTag(16, value.link_verification_method) + protoAdapter32.encodedSizeWithTag(15, value.unlinked_at_ms) + protoAdapter2.encodedSizeWithTag(14, value.finplat_instrument_token) + protoAdapter32.encodedSizeWithTag(11, value.entity_version) + protoAdapter32.encodedSizeWithTag(10, value.updated_at_ms) + protoAdapter32.encodedSizeWithTag(9, value.created_at_ms) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter42 = ProtoAdapter.BOOL;
                int encodedSizeWithTag52 = protoAdapter2.encodedSizeWithTag(22, value.persistent_account_reference) + protoAdapter42.encodedSizeWithTag(21, value.default_for_instrument_type) + protoAdapter42.encodedSizeWithTag(20, value.linked_as_inactive) + encodedSizeWithTag42;
                ProtoAdapter protoAdapter52 = InstrumentScope.ADAPTER;
                int encodedSizeWithTag62 = protoAdapter52.asRepeated().encodedSizeWithTag(25, value.instrument_scopes) + protoAdapter52.encodedSizeWithTag(24, value.instrument_scope) + encodedSizeWithTag52;
                digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (!(digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken)) {
                }
                encodedSizeWithTag62 += encodedSizeWithTag2;
                return InstrumentDisplayDetails.ADAPTER.encodedSizeWithTag(23, value.instrument_display_details) + encodedSizeWithTag62;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentLink redact(InstrumentLink value) {
                value.getClass();
                InstrumentDisplayDetails instrumentDisplayDetails = value.instrument_display_details;
                InstrumentDisplayDetails instrumentDisplayDetails2 = instrumentDisplayDetails != null ? (InstrumentDisplayDetails) InstrumentDisplayDetails.ADAPTER.redact(instrumentDisplayDetails) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.instrument_link_token;
                String str2 = value.owner_token;
                String str3 = value.instrument_token;
                LinkStatusType linkStatusType = value.link_status;
                InstrumentType instrumentType = value.instrument_type;
                String str4 = value.fidelius_token;
                Country country = value.country;
                InstrumentLink.Instrument instrument = value.instrument;
                Long l = value.created_at_ms;
                Long l2 = value.updated_at_ms;
                Long l3 = value.entity_version;
                String str5 = value.finplat_instrument_token;
                Long l4 = value.unlinked_at_ms;
                LinkVerificationMethod linkVerificationMethod = value.link_verification_method;
                String str6 = value.plaid_persistent_account_id;
                Boolean bool = value.linked_as_inactive;
                Boolean bool2 = value.default_for_instrument_type;
                String str7 = value.persistent_account_reference;
                InstrumentScope instrumentScope = value.instrument_scope;
                List<InstrumentScope> list = value.instrument_scopes;
                InstrumentLink.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                list.getClass();
                byteString.getClass();
                return new InstrumentLink(str, str2, str3, linkStatusType, instrumentType, str4, country, instrument, l, l2, l3, str5, l4, linkVerificationMethod, str6, bool, bool2, str7, instrumentScope, list, digitalWalletPaymentToken, instrumentDisplayDetails2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentLink value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InstrumentLink.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(writer, 18, ((InstrumentLink.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken instanceof InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(writer, 19, ((InstrumentLink.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InstrumentLink.Instrument instrument = value.instrument;
                if (instrument instanceof InstrumentLink.Instrument.Card) {
                    Card.ADAPTER.encodeWithTag(writer, 7, ((InstrumentLink.Instrument.Card) instrument).getValue());
                } else if (instrument instanceof InstrumentLink.Instrument.BankAccount) {
                    BankAccount.ADAPTER.encodeWithTag(writer, 8, ((InstrumentLink.Instrument.BankAccount) instrument).getValue());
                } else if (instrument instanceof InstrumentLink.Instrument.StoredValueBalance) {
                    StoredValueBalance.ADAPTER.encodeWithTag(writer, 13, ((InstrumentLink.Instrument.StoredValueBalance) instrument).getValue());
                } else if (instrument != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InstrumentDisplayDetails.ADAPTER.encodeWithTag(writer, 23, value.instrument_display_details);
                ProtoAdapter protoAdapter2 = InstrumentScope.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 25, value.instrument_scopes);
                protoAdapter2.encodeWithTag(writer, 24, value.instrument_scope);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 22, value.persistent_account_reference);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 21, value.default_for_instrument_type);
                protoAdapter4.encodeWithTag(writer, 20, value.linked_as_inactive);
                protoAdapter3.encodeWithTag(writer, 17, value.plaid_persistent_account_id);
                LinkVerificationMethod.ADAPTER.encodeWithTag(writer, 16, value.link_verification_method);
                ProtoAdapter protoAdapter5 = ProtoAdapter.INT64;
                protoAdapter5.encodeWithTag(writer, 15, value.unlinked_at_ms);
                protoAdapter3.encodeWithTag(writer, 14, value.finplat_instrument_token);
                protoAdapter5.encodeWithTag(writer, 11, value.entity_version);
                protoAdapter5.encodeWithTag(writer, 10, value.updated_at_ms);
                protoAdapter5.encodeWithTag(writer, 9, value.created_at_ms);
                Country.ADAPTER.encodeWithTag(writer, 12, value.country);
                protoAdapter3.encodeWithTag(writer, 6, value.fidelius_token);
                InstrumentType.ADAPTER.encodeWithTag(writer, 5, value.instrument_type);
                LinkStatusType.ADAPTER.encodeWithTag(writer, 4, value.link_status);
                protoAdapter3.encodeWithTag(writer, 3, value.instrument_token);
                protoAdapter3.encodeWithTag(writer, 2, value.owner_token);
                protoAdapter3.encodeWithTag(writer, 1, value.instrument_link_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLink(String str, String str2, String str3, LinkStatusType linkStatusType, InstrumentType instrumentType, String str4, Country country, Instrument instrument, Long l, Long l2, Long l3, String str5, Long l4, LinkVerificationMethod linkVerificationMethod, String str6, Boolean bool, Boolean bool2, String str7, InstrumentScope instrumentScope, List list, DigitalWalletPaymentToken digitalWalletPaymentToken, InstrumentDisplayDetails instrumentDisplayDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.instrument_link_token = str;
        this.owner_token = str2;
        this.instrument_token = str3;
        this.link_status = linkStatusType;
        this.instrument_type = instrumentType;
        this.fidelius_token = str4;
        this.country = country;
        this.instrument = instrument;
        this.created_at_ms = l;
        this.updated_at_ms = l2;
        this.entity_version = l3;
        this.finplat_instrument_token = str5;
        this.unlinked_at_ms = l4;
        this.link_verification_method = linkVerificationMethod;
        this.plaid_persistent_account_id = str6;
        this.linked_as_inactive = bool;
        this.default_for_instrument_type = bool2;
        this.persistent_account_reference = str7;
        this.instrument_scope = instrumentScope;
        this.digital_wallet_payment_token = digitalWalletPaymentToken;
        this.instrument_display_details = instrumentDisplayDetails;
        this.instrument_scopes = TransactorKt.immutableCopyOf("instrument_scopes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLink)) {
            return false;
        }
        InstrumentLink instrumentLink = (InstrumentLink) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLink.unknownFields()) && Intrinsics.areEqual(this.instrument_link_token, instrumentLink.instrument_link_token) && Intrinsics.areEqual(this.owner_token, instrumentLink.owner_token) && Intrinsics.areEqual(this.instrument_token, instrumentLink.instrument_token) && this.link_status == instrumentLink.link_status && this.instrument_type == instrumentLink.instrument_type && Intrinsics.areEqual(this.fidelius_token, instrumentLink.fidelius_token) && this.country == instrumentLink.country && Intrinsics.areEqual(this.instrument, instrumentLink.instrument) && Intrinsics.areEqual(this.created_at_ms, instrumentLink.created_at_ms) && Intrinsics.areEqual(this.updated_at_ms, instrumentLink.updated_at_ms) && Intrinsics.areEqual(this.entity_version, instrumentLink.entity_version) && Intrinsics.areEqual(this.finplat_instrument_token, instrumentLink.finplat_instrument_token) && Intrinsics.areEqual(this.unlinked_at_ms, instrumentLink.unlinked_at_ms) && this.link_verification_method == instrumentLink.link_verification_method && Intrinsics.areEqual(this.plaid_persistent_account_id, instrumentLink.plaid_persistent_account_id) && Intrinsics.areEqual(this.linked_as_inactive, instrumentLink.linked_as_inactive) && Intrinsics.areEqual(this.default_for_instrument_type, instrumentLink.default_for_instrument_type) && Intrinsics.areEqual(this.persistent_account_reference, instrumentLink.persistent_account_reference) && this.instrument_scope == instrumentLink.instrument_scope && Intrinsics.areEqual(this.instrument_scopes, instrumentLink.instrument_scopes) && Intrinsics.areEqual(this.digital_wallet_payment_token, instrumentLink.digital_wallet_payment_token) && Intrinsics.areEqual(this.instrument_display_details, instrumentLink.instrument_display_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_link_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.owner_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.instrument_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LinkStatusType linkStatusType = this.link_status;
        int hashCode5 = (hashCode4 + (linkStatusType != null ? linkStatusType.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode6 = (hashCode5 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str4 = this.fidelius_token;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Country country = this.country;
        int hashCode8 = (hashCode7 + (country != null ? country.hashCode() : 0)) * 37;
        Instrument instrument = this.instrument;
        int hashCode9 = (hashCode8 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Long l = this.created_at_ms;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at_ms;
        int hashCode11 = (hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.entity_version;
        int hashCode12 = (hashCode11 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str5 = this.finplat_instrument_token;
        int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l4 = this.unlinked_at_ms;
        int hashCode14 = (hashCode13 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        LinkVerificationMethod linkVerificationMethod = this.link_verification_method;
        int hashCode15 = (hashCode14 + (linkVerificationMethod != null ? linkVerificationMethod.hashCode() : 0)) * 37;
        String str6 = this.plaid_persistent_account_id;
        int hashCode16 = (hashCode15 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.linked_as_inactive;
        int hashCode17 = (hashCode16 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.default_for_instrument_type;
        int hashCode18 = (hashCode17 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str7 = this.persistent_account_reference;
        int hashCode19 = (hashCode18 + (str7 != null ? str7.hashCode() : 0)) * 37;
        InstrumentScope instrumentScope = this.instrument_scope;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode19 + (instrumentScope != null ? instrumentScope.hashCode() : 0)) * 37, 37, this.instrument_scopes);
        DigitalWalletPaymentToken digitalWalletPaymentToken = this.digital_wallet_payment_token;
        int hashCode20 = (m + (digitalWalletPaymentToken != null ? digitalWalletPaymentToken.hashCode() : 0)) * 37;
        InstrumentDisplayDetails instrumentDisplayDetails = this.instrument_display_details;
        int hashCode21 = hashCode20 + (instrumentDisplayDetails != null ? instrumentDisplayDetails.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.instrument_link_token = this.instrument_link_token;
        builder.owner_token = this.owner_token;
        builder.instrument_token = this.instrument_token;
        builder.link_status = this.link_status;
        builder.instrument_type = this.instrument_type;
        builder.fidelius_token = this.fidelius_token;
        builder.country = this.country;
        builder.instrument = this.instrument;
        builder.created_at_ms = this.created_at_ms;
        builder.updated_at_ms = this.updated_at_ms;
        builder.entity_version = this.entity_version;
        builder.finplat_instrument_token = this.finplat_instrument_token;
        builder.unlinked_at_ms = this.unlinked_at_ms;
        builder.link_verification_method = this.link_verification_method;
        builder.plaid_persistent_account_id = this.plaid_persistent_account_id;
        builder.linked_as_inactive = this.linked_as_inactive;
        builder.default_for_instrument_type = this.default_for_instrument_type;
        builder.persistent_account_reference = this.persistent_account_reference;
        builder.instrument_scope = this.instrument_scope;
        builder.instrument_scopes = this.instrument_scopes;
        builder.digital_wallet_payment_token = this.digital_wallet_payment_token;
        builder.instrument_display_details = this.instrument_display_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_link_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_link_token=", arrayList);
        }
        String str2 = this.owner_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "owner_token=", arrayList);
        }
        String str3 = this.instrument_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_token=", arrayList);
        }
        LinkStatusType linkStatusType = this.link_status;
        if (linkStatusType != null) {
            arrayList.add("link_status=" + linkStatusType);
        }
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        String str4 = this.fidelius_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "fidelius_token=", arrayList);
        }
        Country country = this.country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            arrayList.add("instrument=" + instrument);
        }
        Long l = this.created_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_ms=", l, arrayList);
        }
        Long l2 = this.updated_at_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_ms=", l2, arrayList);
        }
        Long l3 = this.entity_version;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("entity_version=", l3, arrayList);
        }
        String str5 = this.finplat_instrument_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "finplat_instrument_token=", arrayList);
        }
        Long l4 = this.unlinked_at_ms;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unlinked_at_ms=", l4, arrayList);
        }
        LinkVerificationMethod linkVerificationMethod = this.link_verification_method;
        if (linkVerificationMethod != null) {
            arrayList.add("link_verification_method=" + linkVerificationMethod);
        }
        String str6 = this.plaid_persistent_account_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "plaid_persistent_account_id=", arrayList);
        }
        Boolean bool = this.linked_as_inactive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("linked_as_inactive=", bool, arrayList);
        }
        Boolean bool2 = this.default_for_instrument_type;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("default_for_instrument_type=", bool2, arrayList);
        }
        String str7 = this.persistent_account_reference;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "persistent_account_reference=", arrayList);
        }
        InstrumentScope instrumentScope = this.instrument_scope;
        if (instrumentScope != null) {
            arrayList.add("instrument_scope=" + instrumentScope);
        }
        if (!this.instrument_scopes.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_scopes=", arrayList, this.instrument_scopes);
        }
        DigitalWalletPaymentToken digitalWalletPaymentToken = this.digital_wallet_payment_token;
        if (digitalWalletPaymentToken != null) {
            arrayList.add("digital_wallet_payment_token=" + digitalWalletPaymentToken);
        }
        InstrumentDisplayDetails instrumentDisplayDetails = this.instrument_display_details;
        if (instrumentDisplayDetails != null) {
            arrayList.add("instrument_display_details=" + instrumentDisplayDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLink{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InstrumentLink build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "", "<init>", "()V", "ApplePayPaymentToken", "GooglePayPaymentToken", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken$ApplePayPaymentToken;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken$GooglePayPaymentToken;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DigitalWalletPaymentToken {

        @WireOneofField(adapter = "com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken#ADAPTER", declaredName = "apple_pay_payment_token", tag = 18)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken$ApplePayPaymentToken;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "value", "Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentToken;", "<init>", "(Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentToken;)V", "getValue", "()Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentToken;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApplePayPaymentToken extends DigitalWalletPaymentToken {
            private final com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplePayPaymentToken(com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken applePayPaymentToken) {
                super(null);
                applePayPaymentToken.getClass();
                this.value = applePayPaymentToken;
            }

            public static /* synthetic */ ApplePayPaymentToken copy$default(ApplePayPaymentToken applePayPaymentToken, com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken applePayPaymentToken2, int i, Object obj) {
                if ((i & 1) != 0) {
                    applePayPaymentToken2 = applePayPaymentToken.value;
                }
                return applePayPaymentToken.copy(applePayPaymentToken2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken getValue() {
                return this.value;
            }

            public final ApplePayPaymentToken copy(com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken value) {
                value.getClass();
                return new ApplePayPaymentToken(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApplePayPaymentToken) && Intrinsics.areEqual(this.value, ((ApplePayPaymentToken) other).value);
            }

            public final com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ApplePayPaymentToken(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken#ADAPTER", declaredName = "google_pay_payment_token", tag = 19)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken$GooglePayPaymentToken;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$DigitalWalletPaymentToken;", "value", "Lcom/squareup/cash/lynx/api/v1_0/model/GooglePayPaymentToken;", "<init>", "(Lcom/squareup/cash/lynx/api/v1_0/model/GooglePayPaymentToken;)V", "getValue", "()Lcom/squareup/cash/lynx/api/v1_0/model/GooglePayPaymentToken;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GooglePayPaymentToken extends DigitalWalletPaymentToken {
            private final com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GooglePayPaymentToken(com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken googlePayPaymentToken) {
                super(null);
                googlePayPaymentToken.getClass();
                this.value = googlePayPaymentToken;
            }

            public static /* synthetic */ GooglePayPaymentToken copy$default(GooglePayPaymentToken googlePayPaymentToken, com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken googlePayPaymentToken2, int i, Object obj) {
                if ((i & 1) != 0) {
                    googlePayPaymentToken2 = googlePayPaymentToken.value;
                }
                return googlePayPaymentToken.copy(googlePayPaymentToken2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken getValue() {
                return this.value;
            }

            public final GooglePayPaymentToken copy(com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken value) {
                value.getClass();
                return new GooglePayPaymentToken(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GooglePayPaymentToken) && Intrinsics.areEqual(this.value, ((GooglePayPaymentToken) other).value);
            }

            public final com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GooglePayPaymentToken(value=" + this.value + ")";
            }
        }

        public /* synthetic */ DigitalWalletPaymentToken(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DigitalWalletPaymentToken() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "", "<init>", "()V", "Card", "BankAccount", "StoredValueBalance", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$BankAccount;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$Card;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$StoredValueBalance;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Instrument {

        @WireOneofField(adapter = "com.squareup.cash.lynx.api.v1_0.model.BankAccount#ADAPTER", declaredName = "bank_account", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$BankAccount;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "value", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "<init>", "(Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;)V", "getValue", "()Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BankAccount extends Instrument {
            private final com.squareup.cash.lynx.api.v1_0.model.BankAccount value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BankAccount(com.squareup.cash.lynx.api.v1_0.model.BankAccount bankAccount) {
                super(null);
                bankAccount.getClass();
                this.value = bankAccount;
            }

            public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, com.squareup.cash.lynx.api.v1_0.model.BankAccount bankAccount2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bankAccount2 = bankAccount.value;
                }
                return bankAccount.copy(bankAccount2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.cash.lynx.api.v1_0.model.BankAccount getValue() {
                return this.value;
            }

            public final BankAccount copy(com.squareup.cash.lynx.api.v1_0.model.BankAccount value) {
                value.getClass();
                return new BankAccount(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BankAccount) && Intrinsics.areEqual(this.value, ((BankAccount) other).value);
            }

            public final com.squareup.cash.lynx.api.v1_0.model.BankAccount getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BankAccount(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.cash.lynx.api.v1_0.model.Card#ADAPTER", declaredName = "card", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$Card;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "value", "Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "<init>", "(Lcom/squareup/cash/lynx/api/v1_0/model/Card;)V", "getValue", "()Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Card extends Instrument {
            private final com.squareup.cash.lynx.api.v1_0.model.Card value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(com.squareup.cash.lynx.api.v1_0.model.Card card) {
                super(null);
                card.getClass();
                this.value = card;
            }

            public static /* synthetic */ Card copy$default(Card card, com.squareup.cash.lynx.api.v1_0.model.Card card2, int i, Object obj) {
                if ((i & 1) != 0) {
                    card2 = card.value;
                }
                return card.copy(card2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.cash.lynx.api.v1_0.model.Card getValue() {
                return this.value;
            }

            public final Card copy(com.squareup.cash.lynx.api.v1_0.model.Card value) {
                value.getClass();
                return new Card(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Card) && Intrinsics.areEqual(this.value, ((Card) other).value);
            }

            public final com.squareup.cash.lynx.api.v1_0.model.Card getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Card(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance#ADAPTER", declaredName = "stored_value_balance", tag = 13)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument$StoredValueBalance;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink$Instrument;", "value", "Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "<init>", "(Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;)V", "getValue", "()Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StoredValueBalance extends Instrument {
            private final com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoredValueBalance(com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance storedValueBalance) {
                super(null);
                storedValueBalance.getClass();
                this.value = storedValueBalance;
            }

            public static /* synthetic */ StoredValueBalance copy$default(StoredValueBalance storedValueBalance, com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance storedValueBalance2, int i, Object obj) {
                if ((i & 1) != 0) {
                    storedValueBalance2 = storedValueBalance.value;
                }
                return storedValueBalance.copy(storedValueBalance2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance getValue() {
                return this.value;
            }

            public final StoredValueBalance copy(com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance value) {
                value.getClass();
                return new StoredValueBalance(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StoredValueBalance) && Intrinsics.areEqual(this.value, ((StoredValueBalance) other).value);
            }

            public final com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StoredValueBalance(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Instrument(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Instrument() {
        }
    }
}
