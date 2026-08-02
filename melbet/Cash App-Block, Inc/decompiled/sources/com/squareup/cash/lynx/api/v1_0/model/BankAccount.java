package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.BankAccount;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$Builder;", "", "routing_number", "Ljava/lang/String;", "suffix", "bankbook_token", "gringotts_account_token", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "third_party_id", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "type", "subtype", "external_id", "Lcom/squareup/cash/lynx/api/v1_0/model/AccountDataSource;", "data_source", "Lcom/squareup/cash/lynx/api/v1_0/model/AccountDataSource;", "normalized_bank_account_token", "Companion", "Builder", "ThirdPartyId", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankAccount> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String bankbook_token;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.AccountDataSource#ADAPTER", schemaIndex = 8, tag = 10)
    public final AccountDataSource data_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 9)
    public final String external_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String gringotts_account_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 11)
    public final String normalized_bank_account_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String routing_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 8)
    public final String subtype;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String suffix;

    @WireSealedOneof(schemaIndex = 4)
    public final ThirdPartyId third_party_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 7)
    public final String type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "<init>", "()V", "routing_number", "", "suffix", "bankbook_token", "gringotts_account_token", "third_party_id", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "type", "subtype", "external_id", "data_source", "Lcom/squareup/cash/lynx/api/v1_0/model/AccountDataSource;", "normalized_bank_account_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String bankbook_token;
        public AccountDataSource data_source;
        public String external_id;
        public String gringotts_account_token;
        public String normalized_bank_account_token;
        public String routing_number;
        public String subtype;
        public String suffix;
        public ThirdPartyId third_party_id;
        public String type;

        public final Builder bankbook_token(String bankbook_token) {
            this.bankbook_token = bankbook_token;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BankAccount build() {
            return new BankAccount(this.routing_number, this.suffix, this.bankbook_token, this.gringotts_account_token, this.third_party_id, this.type, this.subtype, this.external_id, this.data_source, this.normalized_bank_account_token, buildUnknownFields());
        }

        public final Builder data_source(AccountDataSource data_source) {
            this.data_source = data_source;
            return this;
        }

        public final Builder external_id(String external_id) {
            this.external_id = external_id;
            return this;
        }

        public final Builder gringotts_account_token(String gringotts_account_token) {
            this.gringotts_account_token = gringotts_account_token;
            return this;
        }

        public final Builder normalized_bank_account_token(String normalized_bank_account_token) {
            this.normalized_bank_account_token = normalized_bank_account_token;
            return this;
        }

        public final Builder routing_number(String routing_number) {
            this.routing_number = routing_number;
            return this;
        }

        public final Builder subtype(String subtype) {
            this.subtype = subtype;
            return this;
        }

        public final Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public final Builder third_party_id(ThirdPartyId third_party_id) {
            this.third_party_id = third_party_id;
            return this;
        }

        public final Builder type(String type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankAccount.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.BankAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BankAccount decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                BankAccount.ThirdPartyId plaidAccountId;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                BankAccount.ThirdPartyId thirdPartyId = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BankAccount((String) obj4, (String) obj5, (String) obj6, (String) obj7, thirdPartyId, (String) obj8, (String) obj9, (String) obj10, (AccountDataSource) obj11, (String) obj12, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj3 = obj4;
                            plaidAccountId = new BankAccount.ThirdPartyId.PlaidAccountId((String) ProtoAdapter.STRING.decode(reader));
                            obj4 = obj3;
                            thirdPartyId = plaidAccountId;
                            break;
                        case 6:
                            obj3 = obj4;
                            plaidAccountId = new BankAccount.ThirdPartyId.YodleeAccountId((String) ProtoAdapter.STRING.decode(reader));
                            obj4 = obj3;
                            thirdPartyId = plaidAccountId;
                            break;
                        case 7:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            try {
                                obj11 = AccountDataSource.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj4;
                                obj2 = obj5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            obj12 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            obj2 = obj5;
                            obj4 = obj;
                            obj5 = obj2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BankAccount value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BankAccount.ThirdPartyId thirdPartyId = value.third_party_id;
                if (thirdPartyId instanceof BankAccount.ThirdPartyId.PlaidAccountId) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, ((BankAccount.ThirdPartyId.PlaidAccountId) thirdPartyId).getValue());
                } else if (thirdPartyId instanceof BankAccount.ThirdPartyId.YodleeAccountId) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, ((BankAccount.ThirdPartyId.YodleeAccountId) thirdPartyId).getValue());
                } else if (thirdPartyId != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 11, value.normalized_bank_account_token);
                AccountDataSource.ADAPTER.encodeWithTag(writer, 10, value.data_source);
                protoAdapter2.encodeWithTag(writer, 9, value.external_id);
                protoAdapter2.encodeWithTag(writer, 8, value.subtype);
                protoAdapter2.encodeWithTag(writer, 7, value.type);
                protoAdapter2.encodeWithTag(writer, 4, value.gringotts_account_token);
                protoAdapter2.encodeWithTag(writer, 3, value.bankbook_token);
                protoAdapter2.encodeWithTag(writer, 2, value.suffix);
                protoAdapter2.encodeWithTag(writer, 1, value.routing_number);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BankAccount value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.gringotts_account_token) + protoAdapter2.encodedSizeWithTag(3, value.bankbook_token) + protoAdapter2.encodedSizeWithTag(2, value.suffix) + protoAdapter2.encodedSizeWithTag(1, value.routing_number) + size$okio;
                BankAccount.ThirdPartyId thirdPartyId = value.third_party_id;
                if (thirdPartyId instanceof BankAccount.ThirdPartyId.PlaidAccountId) {
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, ((BankAccount.ThirdPartyId.PlaidAccountId) thirdPartyId).getValue());
                } else {
                    if (!(thirdPartyId instanceof BankAccount.ThirdPartyId.YodleeAccountId)) {
                        if (thirdPartyId != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(11, value.normalized_bank_account_token) + AccountDataSource.ADAPTER.encodedSizeWithTag(10, value.data_source) + protoAdapter2.encodedSizeWithTag(9, value.external_id) + protoAdapter2.encodedSizeWithTag(8, value.subtype) + protoAdapter2.encodedSizeWithTag(7, value.type) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(6, ((BankAccount.ThirdPartyId.YodleeAccountId) thirdPartyId).getValue());
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(11, value.normalized_bank_account_token) + AccountDataSource.ADAPTER.encodedSizeWithTag(10, value.data_source) + protoAdapter2.encodedSizeWithTag(9, value.external_id) + protoAdapter2.encodedSizeWithTag(8, value.subtype) + protoAdapter2.encodedSizeWithTag(7, value.type) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BankAccount redact(BankAccount value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                BankAccount.ThirdPartyId thirdPartyId = value.third_party_id;
                String str = value.type;
                String str2 = value.subtype;
                AccountDataSource accountDataSource = value.data_source;
                String str3 = value.normalized_bank_account_token;
                value.getClass();
                byteString.getClass();
                return new BankAccount(null, null, null, null, thirdPartyId, str, str2, null, accountDataSource, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BankAccount value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.routing_number);
                protoAdapter2.encodeWithTag(writer, 2, value.suffix);
                protoAdapter2.encodeWithTag(writer, 3, value.bankbook_token);
                protoAdapter2.encodeWithTag(writer, 4, value.gringotts_account_token);
                protoAdapter2.encodeWithTag(writer, 7, value.type);
                protoAdapter2.encodeWithTag(writer, 8, value.subtype);
                protoAdapter2.encodeWithTag(writer, 9, value.external_id);
                AccountDataSource.ADAPTER.encodeWithTag(writer, 10, value.data_source);
                protoAdapter2.encodeWithTag(writer, 11, value.normalized_bank_account_token);
                BankAccount.ThirdPartyId thirdPartyId = value.third_party_id;
                if (thirdPartyId instanceof BankAccount.ThirdPartyId.PlaidAccountId) {
                    protoAdapter2.encodeWithTag(writer, 5, ((BankAccount.ThirdPartyId.PlaidAccountId) thirdPartyId).getValue());
                } else if (thirdPartyId instanceof BankAccount.ThirdPartyId.YodleeAccountId) {
                    protoAdapter2.encodeWithTag(writer, 6, ((BankAccount.ThirdPartyId.YodleeAccountId) thirdPartyId).getValue());
                } else if (thirdPartyId != null) {
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
    public BankAccount(String str, String str2, String str3, String str4, ThirdPartyId thirdPartyId, String str5, String str6, String str7, AccountDataSource accountDataSource, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.routing_number = str;
        this.suffix = str2;
        this.bankbook_token = str3;
        this.gringotts_account_token = str4;
        this.third_party_id = thirdPartyId;
        this.type = str5;
        this.subtype = str6;
        this.external_id = str7;
        this.data_source = accountDataSource;
        this.normalized_bank_account_token = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        return Intrinsics.areEqual(unknownFields(), bankAccount.unknownFields()) && Intrinsics.areEqual(this.routing_number, bankAccount.routing_number) && Intrinsics.areEqual(this.suffix, bankAccount.suffix) && Intrinsics.areEqual(this.bankbook_token, bankAccount.bankbook_token) && Intrinsics.areEqual(this.gringotts_account_token, bankAccount.gringotts_account_token) && Intrinsics.areEqual(this.third_party_id, bankAccount.third_party_id) && Intrinsics.areEqual(this.type, bankAccount.type) && Intrinsics.areEqual(this.subtype, bankAccount.subtype) && Intrinsics.areEqual(this.external_id, bankAccount.external_id) && this.data_source == bankAccount.data_source && Intrinsics.areEqual(this.normalized_bank_account_token, bankAccount.normalized_bank_account_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.routing_number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.suffix;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.bankbook_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.gringotts_account_token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ThirdPartyId thirdPartyId = this.third_party_id;
        int hashCode6 = (hashCode5 + (thirdPartyId != null ? thirdPartyId.hashCode() : 0)) * 37;
        String str5 = this.type;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.subtype;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.external_id;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        AccountDataSource accountDataSource = this.data_source;
        int hashCode10 = (hashCode9 + (accountDataSource != null ? accountDataSource.hashCode() : 0)) * 37;
        String str8 = this.normalized_bank_account_token;
        int hashCode11 = hashCode10 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.routing_number = this.routing_number;
        builder.suffix = this.suffix;
        builder.bankbook_token = this.bankbook_token;
        builder.gringotts_account_token = this.gringotts_account_token;
        builder.third_party_id = this.third_party_id;
        builder.type = this.type;
        builder.subtype = this.subtype;
        builder.external_id = this.external_id;
        builder.data_source = this.data_source;
        builder.normalized_bank_account_token = this.normalized_bank_account_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        if (this.suffix != null) {
            arrayList.add("suffix=██");
        }
        if (this.bankbook_token != null) {
            arrayList.add("bankbook_token=██");
        }
        if (this.gringotts_account_token != null) {
            arrayList.add("gringotts_account_token=██");
        }
        ThirdPartyId thirdPartyId = this.third_party_id;
        if (thirdPartyId != null) {
            arrayList.add("third_party_id=" + thirdPartyId);
        }
        String str = this.type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "type=", arrayList);
        }
        String str2 = this.subtype;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtype=", arrayList);
        }
        if (this.external_id != null) {
            arrayList.add("external_id=██");
        }
        AccountDataSource accountDataSource = this.data_source;
        if (accountDataSource != null) {
            arrayList.add("data_source=" + accountDataSource);
        }
        String str3 = this.normalized_bank_account_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "normalized_bank_account_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankAccount{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BankAccount build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "", "<init>", "()V", "PlaidAccountId", "YodleeAccountId", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId$PlaidAccountId;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId$YodleeAccountId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ThirdPartyId {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "plaid_account_id", tag = 5)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId$PlaidAccountId;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PlaidAccountId extends ThirdPartyId {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidAccountId(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ PlaidAccountId copy$default(PlaidAccountId plaidAccountId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plaidAccountId.value;
                }
                return plaidAccountId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final PlaidAccountId copy(String value) {
                value.getClass();
                return new PlaidAccountId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidAccountId) && Intrinsics.areEqual(this.value, ((PlaidAccountId) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PlaidAccountId(value=", this.value, ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "yodlee_account_id", tag = 6)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId$YodleeAccountId;", "Lcom/squareup/cash/lynx/api/v1_0/model/BankAccount$ThirdPartyId;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class YodleeAccountId extends ThirdPartyId {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public YodleeAccountId(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ YodleeAccountId copy$default(YodleeAccountId yodleeAccountId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = yodleeAccountId.value;
                }
                return yodleeAccountId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final YodleeAccountId copy(String value) {
                value.getClass();
                return new YodleeAccountId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof YodleeAccountId) && Intrinsics.areEqual(this.value, ((YodleeAccountId) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("YodleeAccountId(value=", this.value, ")");
            }
        }

        public /* synthetic */ ThirdPartyId(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ThirdPartyId() {
        }
    }
}
