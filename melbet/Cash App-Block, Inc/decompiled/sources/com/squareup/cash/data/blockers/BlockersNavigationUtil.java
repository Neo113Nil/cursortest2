package com.squareup.cash.data.blockers;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import java.util.EnumSet;

/* loaded from: classes4.dex */
public abstract class BlockersNavigationUtil {
    public static final EnumSet acquireAliasFlows = EnumSet.of(Flow$Type.ACQUIRE_ALIAS, Flow$Type.ADD_EMAIL_ALIAS, Flow$Type.ADD_SMS_ALIAS);

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockersData.Flow.values().length];
            try {
                iArr[BlockersData.Flow.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockersData.Flow.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockersData.Flow.PROFILE_BLOCKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockersData.Flow.TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockersData.Flow.CLIENT_SCENARIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r4.unconfirmedPin.getValue() == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean canGoBack(Screen screen, BlockersData blockersData) {
        Flow$Type flow$Type;
        screen.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[blockersData.flow.ordinal()];
        if (i == 1) {
            return (screen instanceof BlockersScreens.VerifyAliasScreen) || (screen instanceof BlockersScreens.BirthdayScreen) || (screen instanceof BlockersScreens.SsnScreen) || ((screen instanceof BlockersScreens.StreetAddressScreen) && ((BlockersScreens.StreetAddressScreen) screen).idvFlow) || (((screen instanceof BlockersScreens.BankAccountLinkingScreen) && ((BlockersScreens.BankAccountLinkingScreen) screen).fromLinkCardScreen) || (((screen instanceof BlockersScreens.InputCardInfoScreen) && ((BlockersScreens.InputCardInfoScreen) screen).fromPasscodeScreen) || (screen instanceof BlockersScreens.ContactVerificationScreen) || (screen instanceof BlockersScreens.VerifyMagic) || (screen instanceof BlockersScreens.RemoteSkipScreen)));
        }
        if (i == 2 || i == 3 || i == 4) {
            if (!(screen instanceof BlockersScreens.VerifyAliasScreen) && !(screen instanceof BlockersScreens.BirthdayScreen) && !(screen instanceof BlockersScreens.SsnScreen) && ((!(screen instanceof BlockersScreens.StreetAddressScreen) || !((BlockersScreens.StreetAddressScreen) screen).idvFlow) && ((!(screen instanceof BlockersScreens.BankAccountLinkingScreen) || !((BlockersScreens.BankAccountLinkingScreen) screen).fromLinkCardScreen) && (!(screen instanceof BlockersScreens.InputCardInfoScreen) || !((BlockersScreens.InputCardInfoScreen) screen).fromPasscodeScreen)))) {
                if (screen instanceof BlockersScreens.SetPinScreen) {
                    BlockersScreens.SetPinScreen setPinScreen = (BlockersScreens.SetPinScreen) screen;
                    if (setPinScreen.oldPin.getValue() == null) {
                        if (setPinScreen.cvv.getValue() == null) {
                        }
                    }
                }
                return (screen instanceof BlockersScreens.ContactVerificationScreen) || (screen instanceof BlockersScreens.RemoteSkipScreen);
            }
        } else if (i == 5 && ((flow$Type = blockersData.flowType) == Flow$Type.INVITE_FRIENDS || acquireAliasFlows.contains(flow$Type))) {
            return false;
        }
        return true;
    }
}
