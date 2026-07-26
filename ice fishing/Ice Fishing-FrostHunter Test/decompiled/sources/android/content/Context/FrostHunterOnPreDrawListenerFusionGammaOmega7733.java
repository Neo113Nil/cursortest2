package android.content.Context;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnPreDrawListenerFusionGammaOmega7733 implements Parcelable.Creator {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterOnPreDrawListenerFusionGammaOmega7733(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterSupervisorJobNeoShadow8390 frostHunterSupervisorJobNeoShadow8390, Parcel parcel, int i) {
        int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 20293);
        int i2 = frostHunterSupervisorJobNeoShadow8390.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = frostHunterSupervisorJobNeoShadow8390.FrostHunterFlowMaxDragonHero5809;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = frostHunterSupervisorJobNeoShadow8390.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 3, 4);
        parcel.writeInt(i4);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 4, frostHunterSupervisorJobNeoShadow8390.FrostHunterKeyframeGammaGamma1197);
        IBinder iBinder = frostHunterSupervisorJobNeoShadow8390.FrostHunterFragmentBetaMegaVortex6025;
        if (iBinder != null) {
            int FrostHunterInAppPurchaseLegendEpicDragon45792 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterInAppPurchaseLegendEpicDragon4579(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon45792);
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewPixelPhantom8605(parcel, 6, frostHunterSupervisorJobNeoShadow8390.FrostHunterServiceConnectionTurboPhoenixOmega6719, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterSoundPoolNovaTitanTitan5784(parcel, 7, frostHunterSupervisorJobNeoShadow8390.FrostHunterLightSensorForceFusion4241);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewThunderNovaX6772(parcel, 8, frostHunterSupervisorJobNeoShadow8390.FrostHunterScaleAnimationStrikeSpark5059, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewPixelPhantom8605(parcel, 10, frostHunterSupervisorJobNeoShadow8390.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, i);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterNestedScrollViewPixelPhantom8605(parcel, 11, frostHunterSupervisorJobNeoShadow8390.FrostHunterLintTitanVortexQuantum9911, i);
        boolean z = frostHunterSupervisorJobNeoShadow8390.FrostHunterCameraXTurboCelestialHero5430;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = frostHunterSupervisorJobNeoShadow8390.FrostHunterResourcesTitanHyperVision5823;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = frostHunterSupervisorJobNeoShadow8390.FrostHunterTextViewDragonStormMega4297;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterPlaceholderLegendForceNebula9869(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListMegaBetaFusion7423(parcel, 15, frostHunterSupervisorJobNeoShadow8390.FrostHunterLooperThreadBetaHyperionMax1000);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPager2StrikePulse8790(parcel, FrostHunterInAppPurchaseLegendEpicDragon4579);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        Intent intent = null;
        String str3 = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        Intent intent2 = null;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                parcel.getClass();
                return new FrostHunterRealtimeDatabasePulseStormOlympian4721(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                return new FrostHunterPaintFlagsDrawFilterPixelUltraMega2835(parcel);
            case 2:
                return new FrostHunterPackageManagerPixelElite7258(parcel);
            case 3:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new FrostHunterKotlinNebulaSpectraOlympian6969((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 4:
                return new ParcelImpl(parcel);
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return new FrostHunterAdapterDelegateStormTitanElite5494(parcel.readFloat());
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return new FrostHunterGyroscopeNebulaVisionInferno5349(parcel.readInt());
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return new FrostHunterNavigationViewOmegaBlazePixel2451(parcel.readLong());
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                int FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma8999) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c == 1) {
                            i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt);
                        } else if (c != 2) {
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt);
                        } else {
                            Parcelable.Creator<FrostHunterViewEpicShadowLegend9470> creator = FrostHunterViewEpicShadowLegend9470.CREATOR;
                            int FrostHunterMagnetometerFusionTitanium8202 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (FrostHunterMagnetometerFusionTitanium8202 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + FrostHunterMagnetometerFusionTitanium8202);
                        }
                    }
                    FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma8999);
                    return new FrostHunterBarcodeScannerCyberShadowEpic9339(i, arrayList);
                    break;
                }
            case 9:
                int FrostHunterPushNotificationStormTitanGamma89992 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89992) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt2);
                    } else if (c2 == 2) {
                        i2 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt2);
                    } else if (c2 != 3) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt2);
                    } else {
                        intent2 = (Intent) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt2, Intent.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89992);
                return new FrostHunterStateLegendNebulaTurbo6626(i, i2, intent2);
            case 10:
                int FrostHunterPushNotificationStormTitanGamma89993 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                long j = 0;
                int i3 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89993) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i3 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt3);
                            break;
                        case 2:
                            str4 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case 3:
                            str5 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case 4:
                            str6 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            str7 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt3, Uri.CREATOR);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            str8 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterConstraintSetCloneOmegaHyperion9304(parcel, readInt3, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str9 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int FrostHunterMagnetometerFusionTitanium82022 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt3);
                            int dataPosition2 = parcel.dataPosition();
                            if (FrostHunterMagnetometerFusionTitanium82022 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + FrostHunterMagnetometerFusionTitanium82022);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str10 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        case '\f':
                            str11 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt3);
                            break;
                        default:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt3);
                            break;
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89993);
                return new GoogleSignInAccount(i3, str4, str5, str6, str7, uri, str8, j, str9, arrayList2, str10, str11);
            case 11:
                int FrostHunterPushNotificationStormTitanGamma89994 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                ArrayList<String> arrayList3 = null;
                String str12 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89994) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        int FrostHunterMagnetometerFusionTitanium82023 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt4);
                        int dataPosition3 = parcel.dataPosition();
                        if (FrostHunterMagnetometerFusionTitanium82023 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + FrostHunterMagnetometerFusionTitanium82023);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt4);
                    } else {
                        str12 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt4);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89994);
                return new FrostHunterSurfaceViewNeoFusionRogue9589(str12, arrayList3);
            case 12:
                int FrostHunterPushNotificationStormTitanGamma89995 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                FrostHunterDelayHyperionBetaBeta1195 frostHunterDelayHyperionBetaBeta1195 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89995) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt5);
                    } else if (c4 == 2) {
                        connectionResult = (ConnectionResult) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt5, ConnectionResult.CREATOR);
                    } else if (c4 != 3) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt5);
                    } else {
                        frostHunterDelayHyperionBetaBeta1195 = (FrostHunterDelayHyperionBetaBeta1195) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt5, FrostHunterDelayHyperionBetaBeta1195.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89995);
                return new FrostHunterFlingGestureShadowMegaHyperion8241(i, connectionResult, frostHunterDelayHyperionBetaBeta1195);
            case 13:
                int FrostHunterPushNotificationStormTitanGamma89996 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                long j2 = 0;
                long j3 = 0;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89996) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i5 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt6);
                            break;
                        case 2:
                            i6 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt6);
                            break;
                        case 3:
                            i7 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt6);
                            break;
                        case 4:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterConstraintSetCloneOmegaHyperion9304(parcel, readInt6, 8);
                            j2 = parcel.readLong();
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterConstraintSetCloneOmegaHyperion9304(parcel, readInt6, 8);
                            j3 = parcel.readLong();
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            str13 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt6);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            str14 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt6);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            i8 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt6);
                            break;
                        case '\t':
                            i4 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt6);
                            break;
                        default:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt6);
                            break;
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89996);
                return new FrostHunterViewEpicShadowLegend9470(i5, i6, i7, j2, j3, str13, str14, i8, i4);
            case 14:
                int FrostHunterPushNotificationStormTitanGamma89997 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                int i9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89997) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt7);
                    } else if (c5 == 2) {
                        account = (Account) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt7, Account.CREATOR);
                    } else if (c5 == 3) {
                        i9 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt7);
                    } else if (c5 != 4) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89997);
                return new FrostHunterScaleGestureDetectorEpicSpark8718(i, account, i9, googleSignInAccount);
            case 15:
                int FrostHunterPushNotificationStormTitanGamma89998 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                int i10 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89998) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i10 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt8);
                    } else if (c6 == 2) {
                        int FrostHunterMagnetometerFusionTitanium82024 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt8);
                        int dataPosition4 = parcel.dataPosition();
                        if (FrostHunterMagnetometerFusionTitanium82024 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + FrostHunterMagnetometerFusionTitanium82024);
                            iBinder = readStrongBinder;
                        }
                    } else if (c6 == 3) {
                        connectionResult2 = (ConnectionResult) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt8, ConnectionResult.CREATOR);
                    } else if (c6 == 4) {
                        z = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt8);
                    } else if (c6 != 5) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt8);
                    } else {
                        z2 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt8);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89998);
                return new FrostHunterDelayHyperionBetaBeta1195(i10, iBinder, connectionResult2, z, z2);
            case 16:
                int FrostHunterPushNotificationStormTitanGamma89999 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma89999) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt9);
                    } else if (c7 != 2) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt9);
                    } else {
                        str3 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt9);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma89999);
                return new Scope(str3, i);
            case 17:
                int FrostHunterPushNotificationStormTitanGamma899910 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899910) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt10);
                    } else {
                        intent = (Intent) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt10, Intent.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899910);
                return new FrostHunterDigitalInkRecognitionAuroraUltra6822(intent);
            case 18:
                int FrostHunterPushNotificationStormTitanGamma899911 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                int i11 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899911) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i11 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt11);
                    } else if (c8 == 2) {
                        z3 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt11);
                    } else if (c8 == 3) {
                        z4 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt11);
                    } else if (c8 == 4) {
                        i12 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt11);
                    } else if (c8 != 5) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt11);
                    } else {
                        i13 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt11);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899911);
                return new FrostHunterViewModelScopeMasterPhantomCyber1698(i11, z3, z4, i12, i13);
            case 19:
                int FrostHunterPushNotificationStormTitanGamma899912 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                int i14 = 0;
                String str15 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899912) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt12);
                    } else if (c9 == 2) {
                        i14 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt12);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt12);
                    } else {
                        str15 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt12);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899912);
                return new ConnectionResult(i, i14, pendingIntent, str15);
            case 20:
                int FrostHunterPushNotificationStormTitanGamma899913 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult3 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899913) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt13);
                    } else if (c10 == 2) {
                        str2 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt13);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt13, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt13);
                    } else {
                        connectionResult3 = (ConnectionResult) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt13, ConnectionResult.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899913);
                return new Status(i, str2, pendingIntent2, connectionResult3);
            case 21:
                return new FrostHunterAnalyticsCelestialBeta2989(parcel.readStrongBinder());
            case 22:
                int FrostHunterPushNotificationStormTitanGamma899914 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                long j4 = -1;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899914) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        str = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt14);
                    } else if (c11 == 2) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt14);
                    } else if (c11 != 3) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt14);
                    } else {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterConstraintSetCloneOmegaHyperion9304(parcel, readInt14, 8);
                        j4 = parcel.readLong();
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899914);
                return new FrostHunterContextBetaSpark7441(i, j4, str);
            case 23:
                int FrostHunterPushNotificationStormTitanGamma899915 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr = null;
                FrostHunterScaleGestureDetectorHyperSpectraOlympian7145 frostHunterScaleGestureDetectorHyperSpectraOlympian7145 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899915) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        bundle = FrostHunterExecutorSolarPhoenix3849.FrostHunterLintTitanVortexQuantum9911(parcel, readInt15);
                    } else if (c12 == 2) {
                        frostHunterContextBetaSpark7441Arr = (FrostHunterContextBetaSpark7441[]) FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperThreadBetaHyperionMax1000(parcel, readInt15, FrostHunterContextBetaSpark7441.CREATOR);
                    } else if (c12 == 3) {
                        i = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt15);
                    } else if (c12 != 4) {
                        FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt15);
                    } else {
                        frostHunterScaleGestureDetectorHyperSpectraOlympian7145 = (FrostHunterScaleGestureDetectorHyperSpectraOlympian7145) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt15, FrostHunterScaleGestureDetectorHyperSpectraOlympian7145.CREATOR);
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899915);
                FrostHunterJavaPrimeSpectraBlaze7587 frostHunterJavaPrimeSpectraBlaze7587 = new FrostHunterJavaPrimeSpectraBlaze7587();
                frostHunterJavaPrimeSpectraBlaze7587.FrostHunterCameraXPixelTurboCosmos9814 = bundle;
                frostHunterJavaPrimeSpectraBlaze7587.FrostHunterFlowMaxDragonHero5809 = frostHunterContextBetaSpark7441Arr;
                frostHunterJavaPrimeSpectraBlaze7587.FrostHunterAlertDialogAuroraDelta3200 = i;
                frostHunterJavaPrimeSpectraBlaze7587.FrostHunterKeyframeGammaGamma1197 = frostHunterScaleGestureDetectorHyperSpectraOlympian7145;
                return frostHunterJavaPrimeSpectraBlaze7587;
            case 24:
                int FrostHunterPushNotificationStormTitanGamma899916 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                boolean z5 = false;
                boolean z6 = false;
                int i15 = 0;
                FrostHunterViewModelScopeMasterPhantomCyber1698 frostHunterViewModelScopeMasterPhantomCyber1698 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899916) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            frostHunterViewModelScopeMasterPhantomCyber1698 = (FrostHunterViewModelScopeMasterPhantomCyber1698) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt16, FrostHunterViewModelScopeMasterPhantomCyber1698.CREATOR);
                            break;
                        case 2:
                            z5 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt16);
                            break;
                        case 3:
                            z6 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt16);
                            break;
                        case 4:
                            int FrostHunterMagnetometerFusionTitanium82025 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt16);
                            int dataPosition5 = parcel.dataPosition();
                            if (FrostHunterMagnetometerFusionTitanium82025 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + FrostHunterMagnetometerFusionTitanium82025);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            i15 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt16);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            int FrostHunterMagnetometerFusionTitanium82026 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt16);
                            int dataPosition6 = parcel.dataPosition();
                            if (FrostHunterMagnetometerFusionTitanium82026 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + FrostHunterMagnetometerFusionTitanium82026);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt16);
                            break;
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899916);
                return new FrostHunterScaleGestureDetectorHyperSpectraOlympian7145(frostHunterViewModelScopeMasterPhantomCyber1698, z5, z6, iArr, i15, iArr2);
            default:
                int FrostHunterPushNotificationStormTitanGamma899917 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPushNotificationStormTitanGamma8999(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = FrostHunterSupervisorJobNeoShadow8390.FrostHunterMotionSceneAuroraMega2271;
                FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr2 = FrostHunterSupervisorJobNeoShadow8390.FrostHunterBitmapTurboDeltaNebula8743;
                FrostHunterContextBetaSpark7441[] frostHunterContextBetaSpark7441Arr3 = frostHunterContextBetaSpark7441Arr2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z7 = false;
                int i19 = 0;
                boolean z8 = false;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                while (parcel.dataPosition() < FrostHunterPushNotificationStormTitanGamma899917) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i16 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt17);
                            break;
                        case 2:
                            i17 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt17);
                            break;
                        case 3:
                            i18 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt17);
                            break;
                        case 4:
                            str16 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt17);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            int FrostHunterMagnetometerFusionTitanium82027 = FrostHunterExecutorSolarPhoenix3849.FrostHunterMagnetometerFusionTitanium8202(parcel, readInt17);
                            int dataPosition7 = parcel.dataPosition();
                            if (FrostHunterMagnetometerFusionTitanium82027 != 0) {
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition7 + FrostHunterMagnetometerFusionTitanium82027);
                                iBinder2 = readStrongBinder2;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperThreadBetaHyperionMax1000(parcel, readInt17, Scope.CREATOR);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = FrostHunterExecutorSolarPhoenix3849.FrostHunterLintTitanVortexQuantum9911(parcel, readInt17);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXTurboCelestialHero5430(parcel, readInt17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdMasterStrike9463(parcel, readInt17);
                            break;
                        case '\n':
                            frostHunterContextBetaSpark7441Arr2 = (FrostHunterContextBetaSpark7441[]) FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperThreadBetaHyperionMax1000(parcel, readInt17, FrostHunterContextBetaSpark7441.CREATOR);
                            break;
                        case 11:
                            frostHunterContextBetaSpark7441Arr3 = (FrostHunterContextBetaSpark7441[]) FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperThreadBetaHyperionMax1000(parcel, readInt17, FrostHunterContextBetaSpark7441.CREATOR);
                            break;
                        case '\f':
                            z7 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt17);
                            break;
                        case '\r':
                            i19 = FrostHunterExecutorSolarPhoenix3849.FrostHunterStateCelestialNovaPixel8414(parcel, readInt17);
                            break;
                        case 14:
                            z8 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTranslateAnimationCyberSolarUltra7101(parcel, readInt17);
                            break;
                        case 15:
                            str17 = FrostHunterExecutorSolarPhoenix3849.FrostHunterTextViewDragonStormMega4297(parcel, readInt17);
                            break;
                    }
                }
                FrostHunterExecutorSolarPhoenix3849.FrostHunterDialogFragmentTurboPhoenixDragon7627(parcel, FrostHunterPushNotificationStormTitanGamma899917);
                return new FrostHunterSupervisorJobNeoShadow8390(i16, i17, i18, str16, iBinder2, scopeArr, bundle2, account2, frostHunterContextBetaSpark7441Arr2, frostHunterContextBetaSpark7441Arr3, z7, i19, z8, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterRealtimeDatabasePulseStormOlympian4721[i];
            case 1:
                return new FrostHunterPaintFlagsDrawFilterPixelUltraMega2835[i];
            case 2:
                return new FrostHunterPackageManagerPixelElite7258[i];
            case 3:
                return new FrostHunterKotlinNebulaSpectraOlympian6969[i];
            case 4:
                return new ParcelImpl[i];
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return new FrostHunterAdapterDelegateStormTitanElite5494[i];
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return new FrostHunterGyroscopeNebulaVisionInferno5349[i];
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return new FrostHunterNavigationViewOmegaBlazePixel2451[i];
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                return new FrostHunterBarcodeScannerCyberShadowEpic9339[i];
            case 9:
                return new FrostHunterStateLegendNebulaTurbo6626[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new FrostHunterSurfaceViewNeoFusionRogue9589[i];
            case 12:
                return new FrostHunterFlingGestureShadowMegaHyperion8241[i];
            case 13:
                return new FrostHunterViewEpicShadowLegend9470[i];
            case 14:
                return new FrostHunterScaleGestureDetectorEpicSpark8718[i];
            case 15:
                return new FrostHunterDelayHyperionBetaBeta1195[i];
            case 16:
                return new Scope[i];
            case 17:
                return new FrostHunterDigitalInkRecognitionAuroraUltra6822[i];
            case 18:
                return new FrostHunterViewModelScopeMasterPhantomCyber1698[i];
            case 19:
                return new ConnectionResult[i];
            case 20:
                return new Status[i];
            case 21:
                return new FrostHunterAnalyticsCelestialBeta2989[i];
            case 22:
                return new FrostHunterContextBetaSpark7441[i];
            case 23:
                return new FrostHunterJavaPrimeSpectraBlaze7587[i];
            case 24:
                return new FrostHunterScaleGestureDetectorHyperSpectraOlympian7145[i];
            default:
                return new FrostHunterSupervisorJobNeoShadow8390[i];
        }
    }
}
