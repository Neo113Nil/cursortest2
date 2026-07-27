package kotlin.text;

import android.graphics.Rect;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishToolbarRedux implements Comparator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishToolbarRedux(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                int min = Math.min(str.length(), str2.length());
                for (int i = 4; i < min; i++) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt != charAt2) {
                        return charAt < charAt2 ? -1 : 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                }
            case 1:
                return CatchingFishFirebaseDagger.CatchingFishJetpackCompose(((CatchingFishLayoutLiveData) obj).CatchingFishSnackbar, ((CatchingFishLayoutLiveData) obj2).CatchingFishSnackbar);
            case 2:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                CatchingFishPayPalService catchingFishPayPalService = CatchingFishGraphQLPicasso.CatchingFishReduxKtor;
                Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(view);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope);
                Rect rect = (Rect) CatchingFishViewModelScope;
                Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(view2);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope2);
                Rect rect2 = (Rect) CatchingFishViewModelScope2;
                int i2 = rect.top - rect2.top;
                return i2 == 0 ? rect.bottom - rect2.bottom : i2;
            case 3:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                CatchingFishPayPalService catchingFishPayPalService2 = CatchingFishGraphQLPicasso.CatchingFishReduxKtor;
                Object CatchingFishViewModelScope3 = catchingFishPayPalService2.CatchingFishViewModelScope(view3);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope3);
                Rect rect3 = (Rect) CatchingFishViewModelScope3;
                Object CatchingFishViewModelScope4 = catchingFishPayPalService2.CatchingFishViewModelScope(view4);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishViewModelScope4);
                Rect rect4 = (Rect) CatchingFishViewModelScope4;
                int i3 = rect3.left - rect4.left;
                return i3 == 0 ? (rect3.right - rect4.right) * CatchingFishGraphQLPicasso.CatchingFishCoroutine : CatchingFishGraphQLPicasso.CatchingFishCoroutine * i3;
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) obj;
                CatchingFishBiometricRoom catchingFishBiometricRoom2 = (CatchingFishBiometricRoom) obj2;
                float f = catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishMutableLiveData;
                float f2 = catchingFishBiometricRoom2.CatchingFishPayPalService.CatchingFishAnimationMockk.CatchingFishMutableLiveData;
                return f == f2 ? CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishBiometricRoom.CatchingFishNavigation(), catchingFishBiometricRoom2.CatchingFishNavigation()) : Float.compare(f, f2);
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
