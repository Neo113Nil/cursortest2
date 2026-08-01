package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackFramework implements Parcelable.Creator {
    public static final WinterFlowStackFramework WinterFlowHookDataSource = new WinterFlowStackFramework(0);
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowStackFramework(int i) {
        this.WinterFlowRouterStructure = i;
    }

    public static void WinterFlowRouterStructure(WinterFlowManagerProcess winterFlowManagerProcess, Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        int i2 = winterFlowManagerProcess.WinterFlowVariableVersionControl;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = winterFlowManagerProcess.WinterFlowTransactionManagerStrategy;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = winterFlowManagerProcess.WinterFlowUnitTestResponse;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(i4);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 4, winterFlowManagerProcess.WinterFlowRouterRouter);
        IBinder iBinder = winterFlowManagerProcess.WinterFlowSyntax;
        if (iBinder != null) {
            int WinterFlowConsumerUserManager2 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager2);
        }
        WinterFlowWorkerVersionControl.WinterFlowSerializerStructure(parcel, 6, winterFlowManagerProcess.WinterFlowResponseEngine, i);
        WinterFlowWorkerVersionControl.WinterFlowVariableBandwidth(parcel, 7, winterFlowManagerProcess.WinterFlowTransactionAgent);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 8, winterFlowManagerProcess.WinterFlowServerProtocol, i);
        WinterFlowWorkerVersionControl.WinterFlowSerializerStructure(parcel, 10, winterFlowManagerProcess.WinterFlowThreadListener, i);
        WinterFlowWorkerVersionControl.WinterFlowSerializerStructure(parcel, 11, winterFlowManagerProcess.WinterFlowServiceUtility, i);
        boolean z = winterFlowManagerProcess.WinterFlowBandwidthObject;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = winterFlowManagerProcess.WinterFlowOrchestrationSubsystem;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = winterFlowManagerProcess.WinterFlowConcurrencyThread;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 15, winterFlowManagerProcess.WinterFlowSingletonPlatform);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        WinterFlowLibraryService winterFlowLibraryService = null;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        Intent intent = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        Intent intent2 = null;
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return WinterFlowEventProtocol.WinterFlowRouterRouter;
                }
                int WinterFlowBatchUI = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                while (parcel.dataPosition() < WinterFlowBatchUI) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        winterFlowLibraryService = (WinterFlowLibraryService) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt, WinterFlowLibraryService.CREATOR);
                    } else if (c != 2) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt);
                    } else {
                        z = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI);
                return new WinterFlowEventProtocol(winterFlowLibraryService, z);
            case 1:
                parcel.getClass();
                return new WinterFlowScriptVersion(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 2:
                return new WinterFlowControllerGateway(parcel.readInt());
            case 3:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new WinterFlowRouterWebsocket((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 4:
                return new ParcelImpl(parcel);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return new WinterFlowObjectHandler(parcel.readFloat());
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return new WinterFlowVersionControlModule(parcel.readInt());
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return new WinterFlowSchedulerConfiguration(parcel.readLong());
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                int WinterFlowBatchUI2 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < WinterFlowBatchUI2) {
                        int readInt2 = parcel.readInt();
                        char c2 = (char) readInt2;
                        if (c2 == 1) {
                            i8 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt2);
                        } else if (c2 != 2) {
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt2);
                        } else {
                            Parcelable.Creator<WinterFlowTestingFramework> creator = WinterFlowTestingFramework.CREATOR;
                            int WinterFlowConcurrencyThread = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt2);
                            int dataPosition2 = parcel.dataPosition();
                            if (WinterFlowConcurrencyThread == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition2 + WinterFlowConcurrencyThread);
                        }
                    }
                    WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI2);
                    return new WinterFlowTransactionManagerParser(i8, arrayList);
                    break;
                }
            case 9:
                int WinterFlowBatchUI3 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < WinterFlowBatchUI3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i7 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt3);
                    } else if (c3 == 2) {
                        i9 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt3);
                    } else if (c3 != 3) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt3);
                    } else {
                        intent2 = (Intent) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt3, Intent.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI3);
                return new WinterFlowProxyInterface(i7, i9, intent2);
            case 10:
                int WinterFlowBatchUI4 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                long j = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList2 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str3 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case 3:
                            str4 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case 4:
                            str5 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            str6 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt4, Uri.CREATOR);
                            break;
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            str7 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                            WinterFlowNodeVersion.WinterFlowSerializerStructure(parcel, readInt4, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str8 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int WinterFlowConcurrencyThread2 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt4);
                            int dataPosition3 = parcel.dataPosition();
                            if (WinterFlowConcurrencyThread2 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition3 + WinterFlowConcurrencyThread2);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str9 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        case '\f':
                            str10 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt4);
                            break;
                        default:
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt4);
                            break;
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI4);
                return new GoogleSignInAccount(str3, str4, str5, str6, uri, str7, j, str8, arrayList2, str9, str10);
            case 11:
                int WinterFlowBatchUI5 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                long j2 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z2 = false;
                String str11 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i10 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt5);
                    } else if (c4 == 2) {
                        str11 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt5);
                    } else if (c4 == 3) {
                        WinterFlowNodeVersion.WinterFlowSerializerStructure(parcel, readInt5, 8);
                        j2 = parcel.readLong();
                    } else if (c4 == 4) {
                        i11 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt5);
                    } else if (c4 != 5) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt5);
                    } else {
                        z2 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt5);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI5);
                return new WinterFlowQueryLoader(i10, str11, j2, i11, z2);
            case 12:
                int WinterFlowBatchUI6 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                ArrayList<String> arrayList3 = null;
                String str12 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 1) {
                        int WinterFlowConcurrencyThread3 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt6);
                        int dataPosition4 = parcel.dataPosition();
                        if (WinterFlowConcurrencyThread3 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition4 + WinterFlowConcurrencyThread3);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c5 != 2) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt6);
                    } else {
                        str12 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt6);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI6);
                return new WinterFlowResolverTesting(str12, arrayList3);
            case 13:
                int WinterFlowBatchUI7 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                WinterFlowFrameworkUtility winterFlowFrameworkUtility = null;
                while (parcel.dataPosition() < WinterFlowBatchUI7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 1) {
                        i6 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt7);
                    } else if (c6 == 2) {
                        connectionResult = (ConnectionResult) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt7, ConnectionResult.CREATOR);
                    } else if (c6 != 3) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt7);
                    } else {
                        winterFlowFrameworkUtility = (WinterFlowFrameworkUtility) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt7, WinterFlowFrameworkUtility.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI7);
                return new WinterFlowRouterQueue(i6, connectionResult, winterFlowFrameworkUtility);
            case 14:
                int WinterFlowBatchUI8 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                long j3 = 0;
                long j4 = 0;
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i13 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt8);
                            break;
                        case 2:
                            i14 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt8);
                            break;
                        case 3:
                            i15 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt8);
                            break;
                        case 4:
                            WinterFlowNodeVersion.WinterFlowSerializerStructure(parcel, readInt8, 8);
                            j3 = parcel.readLong();
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            WinterFlowNodeVersion.WinterFlowSerializerStructure(parcel, readInt8, 8);
                            j4 = parcel.readLong();
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            str13 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt8);
                            break;
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            str14 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt8);
                            break;
                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                            i16 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt8);
                            break;
                        case '\t':
                            i12 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt8);
                            break;
                        default:
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt8);
                            break;
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI8);
                return new WinterFlowTestingFramework(i13, i14, i15, j3, j4, str13, str14, i16, i12);
            case 15:
                int WinterFlowBatchUI9 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i17 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < WinterFlowBatchUI9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i5 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt9);
                    } else if (c7 == 2) {
                        account = (Account) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt9, Account.CREATOR);
                    } else if (c7 == 3) {
                        i17 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt9);
                    } else if (c7 != 4) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI9);
                return new WinterFlowTestingProcess(i5, account, i17, googleSignInAccount);
            case 16:
                int WinterFlowBatchUI10 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i18 = 0;
                boolean z3 = false;
                boolean z4 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI10) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 1) {
                        i18 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt10);
                    } else if (c8 == 2) {
                        int WinterFlowConcurrencyThread4 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt10);
                        int dataPosition5 = parcel.dataPosition();
                        if (WinterFlowConcurrencyThread4 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition5 + WinterFlowConcurrencyThread4);
                            iBinder = readStrongBinder;
                        }
                    } else if (c8 == 3) {
                        connectionResult2 = (ConnectionResult) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt10, ConnectionResult.CREATOR);
                    } else if (c8 == 4) {
                        z3 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt10);
                    } else if (c8 != 5) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt10);
                    } else {
                        z4 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt10);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI10);
                return new WinterFlowFrameworkUtility(i18, iBinder, connectionResult2, z3, z4);
            case 17:
                int WinterFlowBatchUI11 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i19 = 0;
                int i20 = 0;
                PendingIntent pendingIntent = null;
                String str15 = null;
                Integer num = null;
                while (parcel.dataPosition() < WinterFlowBatchUI11) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 1) {
                        i19 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt11);
                    } else if (c9 == 2) {
                        i20 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt11);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt11, PendingIntent.CREATOR);
                    } else if (c9 == 4) {
                        str15 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt11);
                    } else if (c9 != 5) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt11);
                    } else {
                        int WinterFlowConcurrencyThread5 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt11);
                        if (WinterFlowConcurrencyThread5 == 0) {
                            num = null;
                        } else {
                            if (WinterFlowConcurrencyThread5 != 4) {
                                String hexString = Integer.toHexString(WinterFlowConcurrencyThread5);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(WinterFlowConcurrencyThread5).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(WinterFlowConcurrencyThread5);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new WinterFlowServerSystem(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI11);
                return new ConnectionResult(i19, i20, pendingIntent, str15, num);
            case 18:
                int WinterFlowBatchUI12 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                while (parcel.dataPosition() < WinterFlowBatchUI12) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt12);
                    } else {
                        intent = (Intent) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt12, Intent.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI12);
                return new WinterFlowThreadTransactionManager(intent);
            case 19:
                int WinterFlowBatchUI13 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i21 = 0;
                boolean z5 = false;
                boolean z6 = false;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < WinterFlowBatchUI13) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i21 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt13);
                    } else if (c10 == 2) {
                        z5 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt13);
                    } else if (c10 == 3) {
                        z6 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt13);
                    } else if (c10 == 4) {
                        i22 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt13);
                    } else if (c10 != 5) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt13);
                    } else {
                        i23 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt13);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI13);
                return new WinterFlowQueryScript(i21, z5, z6, i22, i23);
            case 20:
                int WinterFlowBatchUI14 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                long j5 = -1;
                int i24 = 0;
                boolean z7 = false;
                String str16 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI14) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        str16 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt14);
                    } else if (c11 == 2) {
                        i24 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt14);
                    } else if (c11 == 3) {
                        WinterFlowNodeVersion.WinterFlowSerializerStructure(parcel, readInt14, 8);
                        j5 = parcel.readLong();
                    } else if (c11 != 4) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt14);
                    } else {
                        z7 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt14);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI14);
                return new WinterFlowDebugDatabaseSchema(str16, i24, j5, z7);
            case 21:
                return new WinterFlowResponseHandler(parcel.readStrongBinder());
            case 22:
                int WinterFlowBatchUI15 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                boolean z8 = true;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < WinterFlowBatchUI15) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        i4 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt15);
                    } else if (c12 == 2) {
                        i25 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt15);
                    } else if (c12 == 3) {
                        i26 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt15);
                    } else if (c12 != 4) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt15);
                    } else {
                        z8 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt15);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI15);
                return new WinterFlowLibraryService(i4, i25, i26, z8);
            case 23:
                int WinterFlowBatchUI16 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                while (parcel.dataPosition() < WinterFlowBatchUI16) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        i3 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt16);
                    } else if (c13 != 2) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt16);
                    } else {
                        str2 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt16);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI16);
                return new Scope(str2, i3);
            case 24:
                int WinterFlowBatchUI17 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult3 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI17) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i2 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt17);
                    } else if (c14 == 2) {
                        str = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt17);
                    } else if (c14 == 3) {
                        pendingIntent2 = (PendingIntent) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt17, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt17);
                    } else {
                        connectionResult3 = (ConnectionResult) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt17, ConnectionResult.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI17);
                return new Status(i2, str, pendingIntent2, connectionResult3);
            case 25:
                int WinterFlowBatchUI18 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr = null;
                WinterFlowVariableEngine winterFlowVariableEngine = null;
                while (parcel.dataPosition() < WinterFlowBatchUI18) {
                    int readInt18 = parcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        bundle = WinterFlowNodeVersion.WinterFlowCacheManagerAgent(parcel, readInt18);
                    } else if (c15 == 2) {
                        winterFlowDebugDatabaseSchemaArr = (WinterFlowDebugDatabaseSchema[]) WinterFlowNodeVersion.WinterFlowTransactionManagerStrategy(parcel, readInt18, WinterFlowDebugDatabaseSchema.CREATOR);
                    } else if (c15 == 3) {
                        i = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt18);
                    } else if (c15 != 4) {
                        WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt18);
                    } else {
                        winterFlowVariableEngine = (WinterFlowVariableEngine) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt18, WinterFlowVariableEngine.CREATOR);
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI18);
                WinterFlowListenerEvent winterFlowListenerEvent = new WinterFlowListenerEvent();
                winterFlowListenerEvent.WinterFlowVariableVersionControl = bundle;
                winterFlowListenerEvent.WinterFlowTransactionManagerStrategy = winterFlowDebugDatabaseSchemaArr;
                winterFlowListenerEvent.WinterFlowUnitTestResponse = i;
                winterFlowListenerEvent.WinterFlowRouterRouter = winterFlowVariableEngine;
                return winterFlowListenerEvent;
            case 26:
                int WinterFlowBatchUI19 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                boolean z9 = false;
                boolean z10 = false;
                int i27 = 0;
                WinterFlowQueryScript winterFlowQueryScript = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI19) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            winterFlowQueryScript = (WinterFlowQueryScript) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt19, WinterFlowQueryScript.CREATOR);
                            break;
                        case 2:
                            z9 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt19);
                            break;
                        case 3:
                            z10 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt19);
                            break;
                        case 4:
                            int WinterFlowConcurrencyThread6 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt19);
                            int dataPosition6 = parcel.dataPosition();
                            if (WinterFlowConcurrencyThread6 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + WinterFlowConcurrencyThread6);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            i27 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt19);
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            int WinterFlowConcurrencyThread7 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt19);
                            int dataPosition7 = parcel.dataPosition();
                            if (WinterFlowConcurrencyThread7 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition7 + WinterFlowConcurrencyThread7);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt19);
                            break;
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI19);
                return new WinterFlowVariableEngine(winterFlowQueryScript, z9, z10, iArr, i27, iArr2);
            case 27:
                int WinterFlowBatchUI20 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = WinterFlowManagerProcess.WinterFlowVariableBandwidth;
                WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr2 = WinterFlowManagerProcess.WinterFlowBatchUI;
                WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr3 = winterFlowDebugDatabaseSchemaArr2;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                boolean z11 = false;
                int i31 = 0;
                boolean z12 = false;
                String str17 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str18 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i28 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt20);
                            break;
                        case 2:
                            i29 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt20);
                            break;
                        case 3:
                            i30 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt20);
                            break;
                        case 4:
                            str17 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt20);
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            int WinterFlowConcurrencyThread8 = WinterFlowNodeVersion.WinterFlowConcurrencyThread(parcel, readInt20);
                            int dataPosition8 = parcel.dataPosition();
                            if (WinterFlowConcurrencyThread8 != 0) {
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition8 + WinterFlowConcurrencyThread8);
                                iBinder2 = readStrongBinder2;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) WinterFlowNodeVersion.WinterFlowTransactionManagerStrategy(parcel, readInt20, Scope.CREATOR);
                            break;
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = WinterFlowNodeVersion.WinterFlowCacheManagerAgent(parcel, readInt20);
                            break;
                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) WinterFlowNodeVersion.WinterFlowArrayNetwork(parcel, readInt20, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt20);
                            break;
                        case '\n':
                            winterFlowDebugDatabaseSchemaArr2 = (WinterFlowDebugDatabaseSchema[]) WinterFlowNodeVersion.WinterFlowTransactionManagerStrategy(parcel, readInt20, WinterFlowDebugDatabaseSchema.CREATOR);
                            break;
                        case 11:
                            winterFlowDebugDatabaseSchemaArr3 = (WinterFlowDebugDatabaseSchema[]) WinterFlowNodeVersion.WinterFlowTransactionManagerStrategy(parcel, readInt20, WinterFlowDebugDatabaseSchema.CREATOR);
                            break;
                        case '\f':
                            z11 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt20);
                            break;
                        case '\r':
                            i31 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt20);
                            break;
                        case 14:
                            z12 = WinterFlowNodeVersion.WinterFlowBandwidthObject(parcel, readInt20);
                            break;
                        case 15:
                            str18 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt20);
                            break;
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI20);
                return new WinterFlowManagerProcess(i28, i29, i30, str17, iBinder2, scopeArr, bundle2, account2, winterFlowDebugDatabaseSchemaArr2, winterFlowDebugDatabaseSchemaArr3, z11, i31, z12, str18);
            default:
                int WinterFlowBatchUI21 = WinterFlowNodeVersion.WinterFlowBatchUI(parcel);
                int i32 = 0;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                while (parcel.dataPosition() < WinterFlowBatchUI21) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            str19 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        case 2:
                            str20 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        case 3:
                            str21 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        case 4:
                            str22 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            str23 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            i32 = WinterFlowNodeVersion.WinterFlowOrchestrationSubsystem(parcel, readInt21);
                            break;
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            str24 = WinterFlowNodeVersion.WinterFlowVariableVersionControl(parcel, readInt21);
                            break;
                        default:
                            WinterFlowNodeVersion.WinterFlowSingletonPlatform(parcel, readInt21);
                            break;
                    }
                }
                WinterFlowNodeVersion.WinterFlowSyntax(parcel, WinterFlowBatchUI21);
                return new WinterFlowLibraryController(str19, str20, str21, str22, str23, i32, str24);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowEventProtocol[i];
            case 1:
                return new WinterFlowScriptVersion[i];
            case 2:
                return new WinterFlowControllerGateway[i];
            case 3:
                return new WinterFlowRouterWebsocket[i];
            case 4:
                return new ParcelImpl[i];
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return new WinterFlowObjectHandler[i];
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return new WinterFlowVersionControlModule[i];
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return new WinterFlowSchedulerConfiguration[i];
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowTransactionManagerParser[i];
            case 9:
                return new WinterFlowProxyInterface[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new WinterFlowQueryLoader[i];
            case 12:
                return new WinterFlowResolverTesting[i];
            case 13:
                return new WinterFlowRouterQueue[i];
            case 14:
                return new WinterFlowTestingFramework[i];
            case 15:
                return new WinterFlowTestingProcess[i];
            case 16:
                return new WinterFlowFrameworkUtility[i];
            case 17:
                return new ConnectionResult[i];
            case 18:
                return new WinterFlowThreadTransactionManager[i];
            case 19:
                return new WinterFlowQueryScript[i];
            case 20:
                return new WinterFlowDebugDatabaseSchema[i];
            case 21:
                return new WinterFlowResponseHandler[i];
            case 22:
                return new WinterFlowLibraryService[i];
            case 23:
                return new Scope[i];
            case 24:
                return new Status[i];
            case 25:
                return new WinterFlowListenerEvent[i];
            case 26:
                return new WinterFlowVariableEngine[i];
            case 27:
                return new WinterFlowManagerProcess[i];
            default:
                return new WinterFlowLibraryController[i];
        }
    }
}
