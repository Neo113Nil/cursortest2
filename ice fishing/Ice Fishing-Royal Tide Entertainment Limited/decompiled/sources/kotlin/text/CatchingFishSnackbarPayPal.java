package kotlin.text;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarPayPal implements Parcelable.Creator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishSnackbarPayPal(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(parcel, "parcel");
                return new CatchingFishToolbar(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                CatchingFishToolbarMVP catchingFishToolbarMVP = new CatchingFishToolbarMVP(parcel);
                catchingFishToolbarMVP.CatchingFishReduxKtor = parcel.readByte() != 0;
                return catchingFishToolbarMVP;
            case 2:
                return new CatchingFishViewUnitTesting(parcel);
            case 3:
                return new CatchingFishFragmentGradle(parcel);
            case 4:
                return new CatchingFishCardViewOkHttp((CatchingFishLiveDataMVI) parcel.readParcelable(CatchingFishLiveDataMVI.class.getClassLoader()), (CatchingFishLiveDataMVI) parcel.readParcelable(CatchingFishLiveDataMVI.class.getClassLoader()), (CatchingFishRealmFragment) parcel.readParcelable(CatchingFishRealmFragment.class.getClassLoader()), (CatchingFishLiveDataMVI) parcel.readParcelable(CatchingFishLiveDataMVI.class.getClassLoader()), parcel.readInt());
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return new CatchingFishRealmFragment(parcel.readLong());
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishUnitTestingFAB catchingFishUnitTestingFAB = new CatchingFishUnitTestingFAB();
                catchingFishUnitTestingFAB.CatchingFishReduxKtor = parcel.readString();
                catchingFishUnitTestingFAB.CatchingFishDaggerWebsocket = parcel.readInt();
                return catchingFishUnitTestingFAB;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishDataStoreLayout catchingFishDataStoreLayout = new CatchingFishDataStoreLayout();
                catchingFishDataStoreLayout.CatchingFishViewModelFAB = null;
                catchingFishDataStoreLayout.CatchingFishLayout = new ArrayList();
                catchingFishDataStoreLayout.CatchingFishFragmentHandler = new ArrayList();
                catchingFishDataStoreLayout.CatchingFishReduxKtor = parcel.createStringArrayList();
                catchingFishDataStoreLayout.CatchingFishDaggerWebsocket = parcel.createStringArrayList();
                catchingFishDataStoreLayout.CatchingFishWorkManager = (CatchingFishViewUnitTesting[]) parcel.createTypedArray(CatchingFishViewUnitTesting.CREATOR);
                catchingFishDataStoreLayout.CatchingFishViewModelScope = parcel.readInt();
                catchingFishDataStoreLayout.CatchingFishViewModelFAB = parcel.readString();
                catchingFishDataStoreLayout.CatchingFishLayout = parcel.createStringArrayList();
                catchingFishDataStoreLayout.CatchingFishFragmentHandler = parcel.createTypedArrayList(CatchingFishFragmentGradle.CREATOR);
                catchingFishDataStoreLayout.CatchingFishCloudMessaging = parcel.createTypedArrayList(CatchingFishUnitTestingFAB.CREATOR);
                return catchingFishDataStoreLayout;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return new CatchingFishHiltGson(parcel);
            case 9:
                CatchingFishFirebaseDagger.CatchingFishNavigation(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(readParcelable);
                return new CatchingFishGlideEspresso((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                CatchingFishRealmRetrofit catchingFishRealmRetrofit = new CatchingFishRealmRetrofit();
                catchingFishRealmRetrofit.CatchingFishReduxKtor = parcel.readInt();
                catchingFishRealmRetrofit.CatchingFishDaggerWebsocket = parcel.readInt();
                catchingFishRealmRetrofit.CatchingFishWorkManager = parcel.readInt() == 1;
                return catchingFishRealmRetrofit;
            case 11:
                CatchingFishStateFlowRoom catchingFishStateFlowRoom = new CatchingFishStateFlowRoom(parcel);
                catchingFishStateFlowRoom.CatchingFishReduxKtor = ((Integer) parcel.readValue(CatchingFishStateFlowRoom.class.getClassLoader())).intValue();
                return catchingFishStateFlowRoom;
            case 12:
                return CatchingFishLiveDataMVI.CatchingFishParcelableFAB(parcel.readInt(), parcel.readInt());
            case 13:
                CatchingFishDaggerFirebase catchingFishDaggerFirebase = new CatchingFishDaggerFirebase(parcel);
                catchingFishDaggerFirebase.CatchingFishReduxKtor = parcel.readInt();
                return catchingFishDaggerFirebase;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                return new CatchingFishRoomPayPal(parcel.readFloat());
            case 16:
                return new CatchingFishViewWidgetFAB(parcel.readInt());
            case 17:
                return new CatchingFishAndroidXHilt(parcel.readLong());
            case 18:
                CatchingFishMVVMAdMob catchingFishMVVMAdMob = new CatchingFishMVVMAdMob();
                catchingFishMVVMAdMob.CatchingFishReduxKtor = parcel.readInt();
                catchingFishMVVMAdMob.CatchingFishDaggerWebsocket = parcel.readInt();
                catchingFishMVVMAdMob.CatchingFishViewModelScope = parcel.readInt() == 1;
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    int[] iArr = new int[readInt2];
                    catchingFishMVVMAdMob.CatchingFishWorkManager = iArr;
                    parcel.readIntArray(iArr);
                }
                return catchingFishMVVMAdMob;
            case 19:
                CatchingFishBiometricPayPal catchingFishBiometricPayPal = new CatchingFishBiometricPayPal();
                catchingFishBiometricPayPal.CatchingFishReduxKtor = parcel.readInt();
                catchingFishBiometricPayPal.CatchingFishDaggerWebsocket = parcel.readInt();
                int readInt3 = parcel.readInt();
                catchingFishBiometricPayPal.CatchingFishWorkManager = readInt3;
                if (readInt3 > 0) {
                    int[] iArr2 = new int[readInt3];
                    catchingFishBiometricPayPal.CatchingFishViewModelScope = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt4 = parcel.readInt();
                catchingFishBiometricPayPal.CatchingFishViewModelFAB = readInt4;
                if (readInt4 > 0) {
                    int[] iArr3 = new int[readInt4];
                    catchingFishBiometricPayPal.CatchingFishLayout = iArr3;
                    parcel.readIntArray(iArr3);
                }
                catchingFishBiometricPayPal.CatchingFishCloudMessaging = parcel.readInt() == 1;
                catchingFishBiometricPayPal.CatchingFishEspressoTesting = parcel.readInt() == 1;
                catchingFishBiometricPayPal.CatchingFishOkHttp = parcel.readInt() == 1;
                catchingFishBiometricPayPal.CatchingFishFragmentHandler = parcel.readArrayList(CatchingFishMVVMAdMob.class.getClassLoader());
                return catchingFishBiometricPayPal;
            case 20:
                int CatchingFishAndroidX = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i = 0;
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < CatchingFishAndroidX) {
                        int readInt5 = parcel.readInt();
                        char c = (char) readInt5;
                        if (c == 1) {
                            i = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt5);
                        } else if (c != 2) {
                            CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt5);
                        } else {
                            Parcelable.Creator<CatchingFishMoshiCustomView> creator = CatchingFishMoshiCustomView.CREATOR;
                            int CatchingFishHandler = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (CatchingFishHandler == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + CatchingFishHandler);
                        }
                    }
                    CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX);
                    return new CatchingFishMVPAdMobKtor(i, arrayList);
                    break;
                }
            case 21:
                int CatchingFishAndroidX2 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                Intent intent = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < CatchingFishAndroidX2) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        i2 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt6);
                    } else if (c2 == 2) {
                        i3 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt6);
                    } else if (c2 != 3) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt6);
                    } else {
                        intent = (Intent) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt6, Intent.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX2);
                return new CatchingFishAdMobMVPLayout(i2, i3, intent);
            case 22:
                int CatchingFishAndroidX3 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < CatchingFishAndroidX3) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 2:
                                str = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case 3:
                                str2 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case 4:
                                str3 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                str4 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                uri = (Uri) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt, Uri.CREATOR);
                                break;
                            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                str5 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                break;
                            case '\t':
                                str6 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                                int CatchingFishHandler2 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt);
                                int dataPosition2 = parcel.dataPosition();
                                if (CatchingFishHandler2 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                    parcel.setDataPosition(dataPosition2 + CatchingFishHandler2);
                                    arrayList2 = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList2 = null;
                                    break;
                                }
                            case 11:
                                str7 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            case '\f':
                                str8 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt);
                                break;
                            default:
                                CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt);
                                break;
                        }
                    }
                    CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX3);
                    return new GoogleSignInAccount(str, str2, str3, str4, uri, str5, j2, str6, arrayList2, str7, str8);
                    CatchingFishOkHttpFAB.CatchingFishNavigationGson(parcel, readInt, 8);
                    j = parcel.readLong();
                    break;
                }
            case 23:
                int CatchingFishAndroidX4 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i4 = 0;
                int i5 = 0;
                boolean z = false;
                long j3 = 0;
                String str9 = null;
                while (parcel.dataPosition() < CatchingFishAndroidX4) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i4 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt7);
                    } else if (c3 == 2) {
                        str9 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt7);
                    } else if (c3 == 3) {
                        CatchingFishOkHttpFAB.CatchingFishNavigationGson(parcel, readInt7, 8);
                        j3 = parcel.readLong();
                    } else if (c3 == 4) {
                        i5 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt7);
                    } else if (c3 != 5) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt7);
                    } else {
                        z = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt7);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX4);
                return new CatchingFishMVVMIntent(i4, str9, j3, i5, z);
            case 24:
                int CatchingFishAndroidX5 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                ArrayList<String> arrayList3 = null;
                String str10 = null;
                while (parcel.dataPosition() < CatchingFishAndroidX5) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        int CatchingFishHandler3 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt8);
                        int dataPosition3 = parcel.dataPosition();
                        if (CatchingFishHandler3 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + CatchingFishHandler3);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c4 != 2) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt8);
                    } else {
                        str10 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt8);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX5);
                return new CatchingFishGradleHandler(str10, arrayList3);
            case 25:
                int CatchingFishAndroidX6 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                ConnectionResult connectionResult = null;
                int i6 = 0;
                CatchingFishWidgetFABGlide catchingFishWidgetFABGlide = null;
                while (parcel.dataPosition() < CatchingFishAndroidX6) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 1) {
                        i6 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt9);
                    } else if (c5 == 2) {
                        connectionResult = (ConnectionResult) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt9, ConnectionResult.CREATOR);
                    } else if (c5 != 3) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt9);
                    } else {
                        catchingFishWidgetFABGlide = (CatchingFishWidgetFABGlide) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt9, CatchingFishWidgetFABGlide.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX6);
                return new CatchingFishHiltGlideFlux(i6, connectionResult, catchingFishWidgetFABGlide);
            case 26:
                int CatchingFishAndroidX7 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i7 = -1;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                String str11 = null;
                String str12 = null;
                long j4 = 0;
                long j5 = 0;
                while (parcel.dataPosition() < CatchingFishAndroidX7) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i8 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt10);
                            break;
                        case 2:
                            i9 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt10);
                            break;
                        case 3:
                            i10 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt10);
                            break;
                        case 4:
                            CatchingFishOkHttpFAB.CatchingFishNavigationGson(parcel, readInt10, 8);
                            j4 = parcel.readLong();
                            break;
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            CatchingFishOkHttpFAB.CatchingFishNavigationGson(parcel, readInt10, 8);
                            j5 = parcel.readLong();
                            break;
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            str11 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt10);
                            break;
                        case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                            str12 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt10);
                            break;
                        case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                            i11 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt10);
                            break;
                        case '\t':
                            i7 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt10);
                            break;
                        default:
                            CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt10);
                            break;
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX7);
                return new CatchingFishMoshiCustomView(i8, i9, i10, j4, j5, str11, str12, i11, i7);
            case 27:
                int CatchingFishAndroidX8 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                Account account = null;
                int i12 = 0;
                int i13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < CatchingFishAndroidX8) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        i12 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt11);
                    } else if (c6 == 2) {
                        account = (Account) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt11, Account.CREATOR);
                    } else if (c6 == 3) {
                        i13 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt11);
                    } else if (c6 != 4) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt11, GoogleSignInAccount.CREATOR);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX8);
                return new CatchingFishMVPDagger(i12, account, i13, googleSignInAccount);
            case 28:
                int CatchingFishAndroidX9 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                int i14 = 0;
                boolean z2 = false;
                boolean z3 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < CatchingFishAndroidX9) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        i14 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt12);
                    } else if (c7 == 2) {
                        int CatchingFishHandler4 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt12);
                        int dataPosition4 = parcel.dataPosition();
                        if (CatchingFishHandler4 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + CatchingFishHandler4);
                        }
                    } else if (c7 == 3) {
                        connectionResult2 = (ConnectionResult) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt12, ConnectionResult.CREATOR);
                    } else if (c7 == 4) {
                        z2 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt12);
                    } else if (c7 != 5) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt12);
                    } else {
                        z3 = CatchingFishOkHttpFAB.CatchingFishDagger(parcel, readInt12);
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX9);
                return new CatchingFishWidgetFABGlide(i14, iBinder, connectionResult2, z2, z3);
            default:
                int CatchingFishAndroidX10 = CatchingFishOkHttpFAB.CatchingFishAndroidX(parcel);
                PendingIntent pendingIntent = null;
                String str13 = null;
                Integer num = null;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < CatchingFishAndroidX10) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        i15 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt13);
                    } else if (c8 == 2) {
                        i16 = CatchingFishOkHttpFAB.CatchingFishCameraXIntent(parcel, readInt13);
                    } else if (c8 == 3) {
                        pendingIntent = (PendingIntent) CatchingFishOkHttpFAB.CatchingFishUnitTesting(parcel, readInt13, PendingIntent.CREATOR);
                    } else if (c8 == 4) {
                        str13 = CatchingFishOkHttpFAB.CatchingFishAnimationMockk(parcel, readInt13);
                    } else if (c8 != 5) {
                        CatchingFishOkHttpFAB.CatchingFishDataStoreIntent(parcel, readInt13);
                    } else {
                        int CatchingFishHandler5 = CatchingFishOkHttpFAB.CatchingFishHandler(parcel, readInt13);
                        if (CatchingFishHandler5 == 0) {
                            num = null;
                        } else {
                            if (CatchingFishHandler5 != 4) {
                                String hexString = Integer.toHexString(CatchingFishHandler5);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(CatchingFishHandler5).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(CatchingFishHandler5);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new CatchingFishBiometricView(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                CatchingFishOkHttpFAB.CatchingFishNavigation(parcel, CatchingFishAndroidX10);
                return new ConnectionResult(i15, i16, pendingIntent, str13, num);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishToolbar[i];
            case 1:
                return new CatchingFishToolbarMVP[i];
            case 2:
                return new CatchingFishViewUnitTesting[i];
            case 3:
                return new CatchingFishFragmentGradle[i];
            case 4:
                return new CatchingFishCardViewOkHttp[i];
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return new CatchingFishRealmFragment[i];
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return new CatchingFishUnitTestingFAB[i];
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return new CatchingFishDataStoreLayout[i];
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return new CatchingFishHiltGson[i];
            case 9:
                return new CatchingFishGlideEspresso[i];
            case 10:
                return new CatchingFishRealmRetrofit[i];
            case 11:
                return new CatchingFishStateFlowRoom[i];
            case 12:
                return new CatchingFishLiveDataMVI[i];
            case 13:
                return new CatchingFishDaggerFirebase[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new CatchingFishRoomPayPal[i];
            case 16:
                return new CatchingFishViewWidgetFAB[i];
            case 17:
                return new CatchingFishAndroidXHilt[i];
            case 18:
                return new CatchingFishMVVMAdMob[i];
            case 19:
                return new CatchingFishBiometricPayPal[i];
            case 20:
                return new CatchingFishMVPAdMobKtor[i];
            case 21:
                return new CatchingFishAdMobMVPLayout[i];
            case 22:
                return new GoogleSignInAccount[i];
            case 23:
                return new CatchingFishMVVMIntent[i];
            case 24:
                return new CatchingFishGradleHandler[i];
            case 25:
                return new CatchingFishHiltGlideFlux[i];
            case 26:
                return new CatchingFishMoshiCustomView[i];
            case 27:
                return new CatchingFishMVPDagger[i];
            case 28:
                return new CatchingFishWidgetFABGlide[i];
            default:
                return new ConnectionResult[i];
        }
    }
}
