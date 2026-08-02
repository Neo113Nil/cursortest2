package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ListOrdered;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.RemoteImage;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RipplesKt ripplesKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBenefitLeafletResponse.BenefitLeafletElement(ripplesKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image((RemoteImage) RemoteImage.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader((PageHeader) PageHeader.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered((ListOrdered) ListOrdered.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup((ActionableButtonCtaGroup) ActionableButtonCtaGroup.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection((BetweenSection) BetweenSection.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    ripplesKt = new GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection((WithinSection) WithinSection.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBenefitLeafletResponse.BenefitLeafletElement benefitLeafletElement = (GetBenefitLeafletResponse.BenefitLeafletElement) obj;
        reverseProtoWriter.getClass();
        benefitLeafletElement.getClass();
        reverseProtoWriter.writeBytes(benefitLeafletElement.unknownFields());
        RipplesKt ripplesKt = benefitLeafletElement.element;
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) {
            RemoteImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) ripplesKt).value);
            return;
        }
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) ripplesKt).value);
            return;
        }
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) {
            ListOrdered.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) ripplesKt).value);
            return;
        }
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) {
            ActionableButtonCtaGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) ripplesKt).value);
            return;
        }
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) ripplesKt).value);
        } else {
            if (ripplesKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetBenefitLeafletResponse.BenefitLeafletElement benefitLeafletElement = (GetBenefitLeafletResponse.BenefitLeafletElement) obj;
        benefitLeafletElement.getClass();
        int size$okio = benefitLeafletElement.unknownFields().getSize$okio();
        RipplesKt ripplesKt = benefitLeafletElement.element;
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) {
            encodedSizeWithTag = RemoteImage.ADAPTER.encodedSizeWithTag(1, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) {
            encodedSizeWithTag = PageHeader.ADAPTER.encodedSizeWithTag(2, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) {
            encodedSizeWithTag = ListOrdered.ADAPTER.encodedSizeWithTag(3, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) {
            encodedSizeWithTag = ActionableButtonCtaGroup.ADAPTER.encodedSizeWithTag(4, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) {
            encodedSizeWithTag = BetweenSection.ADAPTER.encodedSizeWithTag(5, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) ripplesKt).value);
        } else {
            if (!(ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection)) {
                if (ripplesKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = WithinSection.ADAPTER.encodedSizeWithTag(6, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) ripplesKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBenefitLeafletResponse.BenefitLeafletElement benefitLeafletElement = (GetBenefitLeafletResponse.BenefitLeafletElement) obj;
        benefitLeafletElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        RipplesKt ripplesKt = benefitLeafletElement.element;
        byteString.getClass();
        return new GetBenefitLeafletResponse.BenefitLeafletElement(ripplesKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBenefitLeafletResponse.BenefitLeafletElement benefitLeafletElement = (GetBenefitLeafletResponse.BenefitLeafletElement) obj;
        benefitLeafletElement.getClass();
        RipplesKt ripplesKt = benefitLeafletElement.element;
        if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) {
            RemoteImage.ADAPTER.encodeWithTag(protoWriter, 1, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) {
            ListOrdered.ADAPTER.encodeWithTag(protoWriter, 3, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) {
            ActionableButtonCtaGroup.ADAPTER.encodeWithTag(protoWriter, 4, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(protoWriter, 5, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) ripplesKt).value);
        } else if (ripplesKt instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(protoWriter, 6, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) ripplesKt).value);
        } else if (ripplesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(benefitLeafletElement.unknownFields());
    }
}
