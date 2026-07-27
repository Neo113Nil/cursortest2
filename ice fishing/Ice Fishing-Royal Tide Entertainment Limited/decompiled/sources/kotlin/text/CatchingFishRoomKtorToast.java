package kotlin.text;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class CatchingFishRoomKtorToast implements Parcelable.Creator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishRoomKtorToast(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public static void CatchingFishParcelableFAB(CatchingFishGradleRealm catchingFishGradleRealm, Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        int i2 = catchingFishGradleRealm.CatchingFishReduxKtor;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = catchingFishGradleRealm.CatchingFishDaggerWebsocket;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = catchingFishGradleRealm.CatchingFishWorkManager;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 4);
        parcel.writeInt(i4);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 4, catchingFishGradleRealm.CatchingFishViewModelScope);
        IBinder iBinder = catchingFishGradleRealm.CatchingFishViewModelFAB;
        if (iBinder != null) {
            int CatchingFishJobScheduler2 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler2);
        }
        CatchingFishViewMVIMVVM.CatchingFishCardViewView(parcel, 6, catchingFishGradleRealm.CatchingFishLayout, i);
        CatchingFishViewMVIMVVM.CatchingFishGsonAppCompat(parcel, 7, catchingFishGradleRealm.CatchingFishFragmentHandler);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 8, catchingFishGradleRealm.CatchingFishCloudMessaging, i);
        CatchingFishViewMVIMVVM.CatchingFishCardViewView(parcel, 10, catchingFishGradleRealm.CatchingFishEspressoTesting, i);
        CatchingFishViewMVIMVVM.CatchingFishCardViewView(parcel, 11, catchingFishGradleRealm.CatchingFishOkHttp, i);
        boolean z = catchingFishGradleRealm.CatchingFishUnitTesting;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = catchingFishGradleRealm.CatchingFishAnimationMockk;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = catchingFishGradleRealm.CatchingFishStateLiveData;
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 15, catchingFishGradleRealm.CatchingFishRoomDatabase);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int CatchingFishAndroidX = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < CatchingFishAndroidX) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt);
                    } else {
                        intent = (Intent) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt, Intent.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX);
                return new CatchingFishFragmentJUnit(intent);
            case 1:
                int CatchingFishAndroidX2 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < CatchingFishAndroidX2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        i = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt2);
                    } else if (c == 2) {
                        z = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt2);
                    } else if (c == 3) {
                        z2 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt2);
                    } else if (c == 4) {
                        i2 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt2);
                    } else if (c != 5) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt2);
                    } else {
                        i3 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt2);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX2);
                return new CatchingFishAdMobLifecycle(i, i2, i3, z, z2);
            case 2:
                return new CatchingFishDaggerGraphQL(parcel.readStrongBinder());
            case 3:
                int CatchingFishAndroidX3 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i4 = 0;
                boolean z3 = false;
                long j = -1;
                String str = null;
                while (parcel.dataPosition() < CatchingFishAndroidX3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        str = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt3);
                    } else if (c2 == 2) {
                        i4 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt3);
                    } else if (c2 == 3) {
                        CatchingFishOkHttpFAB.CatchingFishNavigationGson(parcel, readInt3, 8);
                        j = parcel.readLong();
                    } else if (c2 != 4) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt3);
                    } else {
                        z3 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt3);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX3);
                return new CatchingFishAppCompatPayPal(str, i4, j, z3);
            case 4:
                int CatchingFishAndroidX4 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                String str2 = null;
                int i5 = 0;
                while (parcel.dataPosition() < CatchingFishAndroidX4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        i5 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt4);
                    } else if (c3 != 2) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt4);
                    } else {
                        str2 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt4);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX4);
                return new Scope(str2, i5);
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                int CatchingFishAndroidX5 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                String str3 = null;
                ConnectionResult connectionResult = null;
                int i6 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < CatchingFishAndroidX5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i6 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt5);
                    } else if (c4 == 2) {
                        str3 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt5);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt5);
                    } else {
                        connectionResult = (ConnectionResult) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt5, ConnectionResult.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX5);
                return new Status(i6, str3, pendingIntent, connectionResult);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                int CatchingFishAndroidX6 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                Bundle bundle = null;
                CatchingFishAndroidXGradle catchingFishAndroidXGradle = null;
                int i7 = 0;
                CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr = null;
                while (parcel.dataPosition() < CatchingFishAndroidX6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 1) {
                        bundle = CatchingFishOkHttpFAB.CatchingFishOkHttp(parcel, readInt6);
                    } else if (c5 == 2) {
                        catchingFishAppCompatPayPalArr = (CatchingFishAppCompatPayPal[]) CatchingFishOkHttpFAB.CatchingFishStateLiveData(parcel, readInt6, CatchingFishAppCompatPayPal.CREATOR);
                    } else if (c5 == 3) {
                        i7 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt6);
                    } else if (c5 != 4) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt6);
                    } else {
                        catchingFishAndroidXGradle = (CatchingFishAndroidXGradle) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt6, CatchingFishAndroidXGradle.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX6);
                CatchingFishToastGoogleMaps catchingFishToastGoogleMaps = new CatchingFishToastGoogleMaps();
                catchingFishToastGoogleMaps.CatchingFishReduxKtor = bundle;
                catchingFishToastGoogleMaps.CatchingFishDaggerWebsocket = catchingFishAppCompatPayPalArr;
                catchingFishToastGoogleMaps.CatchingFishWorkManager = i7;
                catchingFishToastGoogleMaps.CatchingFishViewModelScope = catchingFishAndroidXGradle;
                return catchingFishToastGoogleMaps;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                int CatchingFishAndroidX7 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                CatchingFishAdMobLifecycle catchingFishAdMobLifecycle = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z4 = false;
                boolean z5 = false;
                int i8 = 0;
                while (parcel.dataPosition() < CatchingFishAndroidX7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            catchingFishAdMobLifecycle = (CatchingFishAdMobLifecycle) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt7, CatchingFishAdMobLifecycle.CREATOR);
                            break;
                        case 2:
                            z4 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt7);
                            break;
                        case 3:
                            z5 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt7);
                            break;
                        case 4:
                            int CatchingFishHandler = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt7);
                            int dataPosition = parcel.dataPosition();
                            if (CatchingFishHandler != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + CatchingFishHandler);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            i8 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt7);
                            break;
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            int CatchingFishHandler2 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt7);
                            int dataPosition2 = parcel.dataPosition();
                            if (CatchingFishHandler2 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + CatchingFishHandler2);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt7);
                            break;
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX7);
                return new CatchingFishAndroidXGradle(catchingFishAdMobLifecycle, z4, z5, iArr, i8, iArr2);
            default:
                int CatchingFishAndroidX8 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = CatchingFishGradleRealm.CatchingFishNavigation;
                String str4 = null;
                IBinder iBinder = null;
                Account account = null;
                String str5 = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z6 = false;
                int i12 = 0;
                boolean z7 = false;
                CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr2 = CatchingFishGradleRealm.CatchingFish;
                CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr3 = catchingFishAppCompatPayPalArr2;
                while (parcel.dataPosition() < CatchingFishAndroidX8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i9 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt8);
                            break;
                        case 2:
                            i10 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt8);
                            break;
                        case 3:
                            i11 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt8);
                            break;
                        case 4:
                            str4 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt8);
                            break;
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            int CatchingFishHandler3 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt8);
                            int dataPosition3 = parcel.dataPosition();
                            if (CatchingFishHandler3 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition3 + CatchingFishHandler3);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) CatchingFishOkHttpFAB.CatchingFishStateLiveData(parcel, readInt8, Scope.CREATOR);
                            break;
                        case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = CatchingFishOkHttpFAB.CatchingFishOkHttp(parcel, readInt8);
                            break;
                        case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt8, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt8);
                            break;
                        case '\n':
                            catchingFishAppCompatPayPalArr2 = (CatchingFishAppCompatPayPal[]) CatchingFishOkHttpFAB.CatchingFishStateLiveData(parcel, readInt8, CatchingFishAppCompatPayPal.CREATOR);
                            break;
                        case 11:
                            catchingFishAppCompatPayPalArr3 = (CatchingFishAppCompatPayPal[]) CatchingFishOkHttpFAB.CatchingFishStateLiveData(parcel, readInt8, CatchingFishAppCompatPayPal.CREATOR);
                            break;
                        case '\f':
                            z6 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt8);
                            break;
                        case '\r':
                            i12 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt8);
                            break;
                        case 14:
                            z7 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt8);
                            break;
                        case 15:
                            str5 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt8);
                            break;
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX8);
                return new CatchingFishGradleRealm(i9, i10, i11, str4, iBinder, scopeArr, bundle2, account, catchingFishAppCompatPayPalArr2, catchingFishAppCompatPayPalArr3, z6, i12, z7, str5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishFragmentJUnit[i];
            case 1:
                return new CatchingFishAdMobLifecycle[i];
            case 2:
                return new CatchingFishDaggerGraphQL[i];
            case 3:
                return new CatchingFishAppCompatPayPal[i];
            case 4:
                return new Scope[i];
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return new Status[i];
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return new CatchingFishToastGoogleMaps[i];
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return new CatchingFishAndroidXGradle[i];
            default:
                return new CatchingFishGradleRealm[i];
        }
    }
}
