package androidx.exifinterface.media;

import androidx.camera.core.impl.utils.ByteOrderedDataOutputStream;
import androidx.exifinterface.media.ExifInterface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.webview.android.WebViewUseCase;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class ExifInterfaceUtils {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] convertToLongArray(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void copy(ExifInterface.ByteOrderedDataInputStream byteOrderedDataInputStream, ByteOrderedDataOutputStream byteOrderedDataOutputStream, int i) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (i > 0) {
            int min = Math.min(i, PKIFailureInfo.certRevoked);
            int read = byteOrderedDataInputStream.read(bArr, 0, min);
            if (read != min) {
                a$$ExternalSyntheticBUOutline0.m$4("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= read;
                byteOrderedDataOutputStream.write(bArr, 0, read);
            }
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RefreshBitcoinInvoice.deepLinkSpecs;
    }

    public static final boolean isVersion2WithCorrectMetadata(ShoppingWebScreen shoppingWebScreen, WebViewUseCase webViewUseCase) {
        shoppingWebScreen.getClass();
        if (!(shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2)) {
            return false;
        }
        int ordinal = webViewUseCase.ordinal();
        if (ordinal == 0) {
            return ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata instanceof IabMetadata.SUPMetadata;
        }
        if (ordinal == 1) {
            return ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata instanceof IabMetadata.CashPayMetadata;
        }
        if (ordinal == 2) {
            return ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata instanceof IabMetadata.AfterpayMetadata;
        }
        if (ordinal != 3) {
            return false;
        }
        return ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata instanceof IabMetadata.AffiliateBoostMetadata;
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final WebViewUseCase toUseCase(ShoppingWebScreen shoppingWebScreen) {
        shoppingWebScreen.getClass();
        if (shoppingWebScreen instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
            return WebViewUseCase.SUP;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
            return WebViewUseCase.AFFILIATE;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
            return WebViewUseCase.AFTERPAY;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
            return WebViewUseCase.INCENTIVES;
        }
        if (!(shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
        if (iabMetadata instanceof IabMetadata.CashPayMetadata) {
            return WebViewUseCase.INCENTIVES;
        }
        if (iabMetadata instanceof IabMetadata.AffiliateBoostMetadata) {
            return WebViewUseCase.AFFILIATE;
        }
        if (iabMetadata instanceof IabMetadata.AfterpayMetadata) {
            return WebViewUseCase.AFTERPAY;
        }
        if (iabMetadata instanceof IabMetadata.SUPMetadata) {
            return WebViewUseCase.SUP;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
