package kotlin.text;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class CatchingFishPayPalStateFlow extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMVVMIntentGson CatchingFishFragmentHandler;
    public final /* synthetic */ String CatchingFishLayout;
    public final /* synthetic */ CatchingFishSensorManager CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishPayPalStateFlow(CatchingFishSensorManager catchingFishSensorManager, String str, CatchingFishMVVMIntentGson catchingFishMVVMIntentGson, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishViewModelFAB = catchingFishSensorManager;
        this.CatchingFishLayout = str;
        this.CatchingFishFragmentHandler = catchingFishMVVMIntentGson;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishPayPalStateFlow(this.CatchingFishViewModelFAB, this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishPayPalStateFlow) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishServiceHilt catchingFishServiceHilt = (CatchingFishServiceHilt) this.CatchingFishViewModelFAB.CatchingFishViewModelScope;
        String str = this.CatchingFishFragmentHandler.CatchingFishCoroutine;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "password");
        String str2 = this.CatchingFishLayout;
        if (CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str2) || CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str)) {
            return "";
        }
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[12];
        SecureRandom secureRandom = (SecureRandom) ((CatchingFishEspressoPayPal) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket;
        secureRandom.nextBytes(bArr);
        secureRandom.nextBytes(bArr2);
        char[] charArray = str.toCharArray();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(charArray, "toCharArray(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(charArray, bArr, 10000, 256)).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2));
        byte[] bytes = str2.getBytes(CatchingFishOkHttpToast.CatchingFishParcelableFAB);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(bytes, "getBytes(...)");
        byte[] doFinal = cipher.doFinal(bytes);
        byte[] copyOf = Arrays.copyOf(bArr, 28);
        System.arraycopy(bArr2, 0, copyOf, 16, 12);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(copyOf);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(doFinal);
        int length = copyOf.length;
        int length2 = doFinal.length;
        byte[] copyOf2 = Arrays.copyOf(copyOf, length + length2);
        System.arraycopy(doFinal, 0, copyOf2, length, length2);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(copyOf2);
        String encodeToString = Base64.encodeToString(copyOf2, 2);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
