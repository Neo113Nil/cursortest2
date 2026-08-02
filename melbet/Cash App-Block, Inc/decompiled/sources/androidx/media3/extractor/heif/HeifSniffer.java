package androidx.media3.extractor.heif;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HeifSniffer {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayAppletOrder.deepLinkSpecs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean sniff(DefaultExtractorInput defaultExtractorInput, boolean z) {
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        boolean z2 = true;
        while (true) {
            parsableByteArray.reset(8);
            if (!defaultExtractorInput.peekFully(parsableByteArray.data, 0, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt != 1) {
                i = 8;
            } else {
                if (!defaultExtractorInput.peekFully(parsableByteArray.data, 8, 8, true)) {
                    break;
                }
                readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
                i = 16;
            }
            long j = i;
            if (readUnsignedInt < j) {
                break;
            }
            int i2 = (int) (readUnsignedInt - j);
            if (z2) {
                if (readInt != 1718909296 || i2 < 8) {
                    break;
                }
                parsableByteArray.reset(4);
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                if (parsableByteArray.readInt() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                defaultExtractorInput.advancePeekPosition(i2 - 4, false);
                z2 = false;
            } else {
                if (readInt == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    defaultExtractorInput.advancePeekPosition(i2, false);
                }
            }
        }
        return false;
    }

    public static final ActivitiesManager.ActivityContext supportActivityContext(RealActivityTokenFactory realActivityTokenFactory) {
        return new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN), ActivityScope.SUPPORT_TRANSACTION, (ActivitiesManager.ActivityPageHandler) null, 12);
    }
}
