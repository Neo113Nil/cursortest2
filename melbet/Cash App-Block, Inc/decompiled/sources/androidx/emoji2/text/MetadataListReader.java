package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataList;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount$Data$RewardRelativeAmount;
import com.squareup.protos.cash.cashstorefronts.api.RewardRelativeAmount;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes3.dex */
public abstract class MetadataListReader {
    public static final Float access$getCapDiscountAmount(ShoppingWebScreen shoppingWebScreen) {
        zzuk zzukVar;
        Integer num;
        if (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
            return Float.valueOf((float) (((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen).discountAmount * 0.01d));
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
            IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
            if ((iabMetadata instanceof IabMetadata.CashPayMetadata) && (zzukVar = ((IabMetadata.CashPayMetadata) iabMetadata).rewardAmount.data) != null) {
                RewardAmount$Data$RewardRelativeAmount rewardAmount$Data$RewardRelativeAmount = zzukVar instanceof RewardAmount$Data$RewardRelativeAmount ? (RewardAmount$Data$RewardRelativeAmount) zzukVar : null;
                RewardRelativeAmount rewardRelativeAmount = rewardAmount$Data$RewardRelativeAmount != null ? rewardAmount$Data$RewardRelativeAmount.value : null;
                if (rewardRelativeAmount != null && (num = rewardRelativeAmount.basis_points) != null) {
                    return Float.valueOf((float) (num.intValue() * 0.01d));
                }
            }
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RefreshAllAppMessagesInBackground.deepLinkSpecs;
    }

    public static MetadataList read(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & HPKE.aead_EXPORT_ONLY;
        if (i > 100) {
            a$$ExternalSyntheticBUOutline0.m$4("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & BodyPartID.bodyIdMax;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & BodyPartID.bodyIdMax;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & BodyPartID.bodyIdMax;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    MetadataList metadataList = new MetadataList();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    metadataList.bb = duplicate;
                    metadataList.bb_pos = position;
                    int i6 = position - duplicate.getInt(position);
                    metadataList.vtable_start = i6;
                    metadataList.vtable_size = metadataList.bb.getShort(i6);
                    return metadataList;
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4("Cannot read metadata.");
        return null;
    }
}
