package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ImageResourcesKt imageResourcesKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Section((String) obj, imageResourcesKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    imageResourcesKt = new BenefitsHub$Section$Body_$Insights((BenefitsHub.Insights) BenefitsHub.Insights.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    imageResourcesKt = new BenefitsHub$Section$Body_$Benefits((BenefitsHub.Benefits) BenefitsHub.Benefits.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    imageResourcesKt = new BenefitsHub$Section$Body_$DefaultPerks((BenefitsHub.DefaultPerks) BenefitsHub.DefaultPerks.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    imageResourcesKt = new BenefitsHub$Section$Body_$CommonQuestions((BenefitsHub.CommonQuestions) BenefitsHub.CommonQuestions.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    imageResourcesKt = new BenefitsHub$Section$Body_$Disclosures((BenefitsHub.Disclosures) BenefitsHub.Disclosures.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    imageResourcesKt = new BenefitsHub$Section$Body_$CallToActions((BenefitsHub.CallToActions) BenefitsHub.CallToActions.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    imageResourcesKt = new BenefitsHub$Section$Body_$BenefitsBreakdown((BenefitsHub.BenefitsBreakdown) BenefitsHub.BenefitsBreakdown.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Section section = (BenefitsHub.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        ImageResourcesKt imageResourcesKt = section.Body;
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Insights) {
            BenefitsHub.Insights.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BenefitsHub$Section$Body_$Insights) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Benefits) {
            BenefitsHub.Benefits.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((BenefitsHub$Section$Body_$Benefits) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$DefaultPerks) {
            BenefitsHub.DefaultPerks.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CommonQuestions) {
            BenefitsHub.CommonQuestions.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Disclosures) {
            BenefitsHub.Disclosures.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((BenefitsHub$Section$Body_$Disclosures) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CallToActions) {
            BenefitsHub.CallToActions.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((BenefitsHub$Section$Body_$CallToActions) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) {
            BenefitsHub.BenefitsBreakdown.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt).value);
        } else if (imageResourcesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.heading);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Section section = (BenefitsHub.Section) obj;
        section.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, section.heading) + section.unknownFields().getSize$okio();
        ImageResourcesKt imageResourcesKt = section.Body;
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Insights) {
            return BenefitsHub.Insights.ADAPTER.encodedSizeWithTag(2, ((BenefitsHub$Section$Body_$Insights) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Benefits) {
            return BenefitsHub.Benefits.ADAPTER.encodedSizeWithTag(3, ((BenefitsHub$Section$Body_$Benefits) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$DefaultPerks) {
            return BenefitsHub.DefaultPerks.ADAPTER.encodedSizeWithTag(4, ((BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CommonQuestions) {
            return BenefitsHub.CommonQuestions.ADAPTER.encodedSizeWithTag(5, ((BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Disclosures) {
            return BenefitsHub.Disclosures.ADAPTER.encodedSizeWithTag(6, ((BenefitsHub$Section$Body_$Disclosures) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CallToActions) {
            return BenefitsHub.CallToActions.ADAPTER.encodedSizeWithTag(7, ((BenefitsHub$Section$Body_$CallToActions) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) {
            return BenefitsHub.BenefitsBreakdown.ADAPTER.encodedSizeWithTag(8, ((BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt).value) + encodedSizeWithTag;
        }
        if (imageResourcesKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Section section = (BenefitsHub.Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = section.heading;
        ImageResourcesKt imageResourcesKt = section.Body;
        byteString.getClass();
        return new BenefitsHub.Section(str, imageResourcesKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Section section = (BenefitsHub.Section) obj;
        section.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, section.heading);
        ImageResourcesKt imageResourcesKt = section.Body;
        if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Insights) {
            BenefitsHub.Insights.ADAPTER.encodeWithTag(protoWriter, 2, ((BenefitsHub$Section$Body_$Insights) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Benefits) {
            BenefitsHub.Benefits.ADAPTER.encodeWithTag(protoWriter, 3, ((BenefitsHub$Section$Body_$Benefits) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$DefaultPerks) {
            BenefitsHub.DefaultPerks.ADAPTER.encodeWithTag(protoWriter, 4, ((BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CommonQuestions) {
            BenefitsHub.CommonQuestions.ADAPTER.encodeWithTag(protoWriter, 5, ((BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$Disclosures) {
            BenefitsHub.Disclosures.ADAPTER.encodeWithTag(protoWriter, 6, ((BenefitsHub$Section$Body_$Disclosures) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$CallToActions) {
            BenefitsHub.CallToActions.ADAPTER.encodeWithTag(protoWriter, 7, ((BenefitsHub$Section$Body_$CallToActions) imageResourcesKt).value);
        } else if (imageResourcesKt instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) {
            BenefitsHub.BenefitsBreakdown.ADAPTER.encodeWithTag(protoWriter, 8, ((BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt).value);
        } else if (imageResourcesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
