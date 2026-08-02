package defpackage;

import android.net.Uri;
import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.FamilyInfo;
import com.yandex.xplat.payment.sdk.IconURLs;
import com.yandex.xplat.payment.sdk.PartnerInfo;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.yandex.xplat.payment.sdk.YBCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class wme {
    public static final SbpChallengeInfo a(u89 u89Var) {
        return new SbpChallengeInfo(SbpChallengeInfo.SbpChallengeMethod.RandomAmount, "", u89Var.b, 0L, u89Var.c, u89Var.d, null);
    }

    public static final SbpChallengeInfo b(x89 x89Var) {
        SbpChallengeInfo.SbpChallengeMethod sbpChallengeMethod = SbpChallengeInfo.SbpChallengeMethod.SmsChallenge;
        String str = x89Var.b;
        String str2 = x89Var.d;
        Long m = str2 != null ? bvu0.m(10, str2) : null;
        return new SbpChallengeInfo(sbpChallengeMethod, "", str, m != null ? m.longValue() : 0L, "", "", x89Var.c);
    }

    public static final ArrayList c(AvailableMethods availableMethods) {
        List<PaymentMethod> paymentMethods = availableMethods.getPaymentMethods();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(e((PaymentMethod) it.next()));
        }
        if (availableMethods.getIsGooglePayAvailable()) {
            arrayList.add(PaymentMethod.GooglePay.INSTANCE);
        }
        if (availableMethods.getIsCashAvailable()) {
            arrayList.add(PaymentMethod.Cash.INSTANCE);
        }
        if (availableMethods.getIsSpbQrAvailable()) {
            arrayList.add(PaymentMethod.Sbp.INSTANCE);
        }
        if (availableMethods.getIsNewSbpTokenAvailable()) {
            arrayList.add(PaymentMethod.NewSbpToken.INSTANCE);
        }
        arrayList.add(PaymentMethod.NewCard.INSTANCE);
        return arrayList;
    }

    public static final CardPaymentSystem d(com.yandex.xplat.payment.sdk.CardPaymentSystem cardPaymentSystem) {
        switch (vme.a[cardPaymentSystem.ordinal()]) {
            case 1:
                return CardPaymentSystem.AmericanExpress;
            case 2:
                return CardPaymentSystem.DinersClub;
            case 3:
                return CardPaymentSystem.DiscoverCard;
            case 4:
                return CardPaymentSystem.JCB;
            case 5:
                return CardPaymentSystem.HUMO;
            case 6:
                return CardPaymentSystem.Maestro;
            case 7:
                return CardPaymentSystem.MasterCard;
            case 8:
                return CardPaymentSystem.MIR;
            case 9:
                return CardPaymentSystem.UnionPay;
            case 10:
                return CardPaymentSystem.Uzcard;
            case 11:
                return CardPaymentSystem.Visa;
            case 12:
                return CardPaymentSystem.VisaElectron;
            case 13:
                return CardPaymentSystem.Unknown;
            default:
                w511.b();
                return null;
        }
    }

    public static final com.yandex.payment.sdk.core.data.PaymentMethod e(com.yandex.xplat.payment.sdk.PaymentMethod paymentMethod) {
        BankName bankName;
        Uri uri;
        String dark;
        String light;
        Uri uri2;
        PartnerInfo partnerInfo = paymentMethod.getPartnerInfo();
        Uri uri3 = null;
        if (n891.o(partnerInfo != null ? Boolean.valueOf(partnerInfo.getIsYBCard()) : null)) {
            PartnerInfo partnerInfo2 = paymentMethod.getPartnerInfo();
            if ((partnerInfo2 != null ? partnerInfo2.getYbCardType() : null) != null) {
                String identifier = paymentMethod.getIdentifier();
                PartnerInfo partnerInfo3 = paymentMethod.getPartnerInfo();
                boolean p = n891.p(partnerInfo3 != null ? Boolean.valueOf(partnerInfo3.getIsYBCardOwner()) : null);
                PartnerInfo partnerInfo4 = paymentMethod.getPartnerInfo();
                YBCardType ybCardType = partnerInfo4 != null ? partnerInfo4.getYbCardType() : null;
                int i = ybCardType == null ? -1 : vme.e[ybCardType.ordinal()];
                com.yandex.payment.sdk.core.data.YBCardType yBCardType = i != 1 ? i != 2 ? com.yandex.payment.sdk.core.data.YBCardType.PlusCard : com.yandex.payment.sdk.core.data.YBCardType.SplitCard : com.yandex.payment.sdk.core.data.YBCardType.ProCard;
                FamilyInfo familyInfo = paymentMethod.getFamilyInfo();
                return new PaymentMethod.YBMethod(identifier, p, yBCardType, familyInfo != null ? new com.yandex.payment.sdk.core.data.FamilyInfo(familyInfo.getFamilyAdminUid(), familyInfo.getFamilyId(), familyInfo.getExpenses(), familyInfo.getLimit(), familyInfo.getCurrency(), familyInfo.getFrame(), familyInfo.getIsUnlimited()) : null, paymentMethod.getErrorRespCode(), paymentMethod.getAliases(), null, 64, null);
            }
        }
        int i2 = vme.g[paymentMethod.getType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            String identifier2 = paymentMethod.getIdentifier();
            String memberId = paymentMethod.getMemberId();
            if (memberId == null) {
                memberId = "";
            }
            String str = memberId;
            String memberName = paymentMethod.getMemberName();
            String memberNameRus = paymentMethod.getMemberNameRus();
            IconURLs iconURLs = paymentMethod.getIconURLs();
            if (iconURLs == null || (light = iconURLs.getLight()) == null) {
                uri = null;
            } else {
                try {
                    uri2 = Uri.parse(light);
                } catch (Throwable unused) {
                    uri2 = null;
                }
                uri = uri2;
            }
            IconURLs iconURLs2 = paymentMethod.getIconURLs();
            if (iconURLs2 != null && (dark = iconURLs2.getDark()) != null) {
                try {
                    uri3 = Uri.parse(dark);
                } catch (Throwable unused2) {
                }
            }
            return new PaymentMethod.SbpToken(identifier2, str, memberName, memberNameRus, uri, uri3, paymentMethod.getErrorRespCode(), paymentMethod.getAliases(), paymentMethod.getPayload());
        }
        CardId cardId = new CardId(paymentMethod.getIdentifier());
        CardPaymentSystem d = d(tfb1.g(paymentMethod.getSystem()));
        String account = paymentMethod.getAccount();
        switch (vme.f[paymentMethod.getBank().ordinal()]) {
            case 1:
                bankName = BankName.AlfaBank;
                break;
            case 2:
                bankName = BankName.SberBank;
                break;
            case 3:
                bankName = BankName.Tinkoff;
                break;
            case 4:
                bankName = BankName.Vtb;
                break;
            case 5:
                bankName = BankName.GazpromBank;
                break;
            case 6:
                bankName = BankName.BankOfMoscow;
                break;
            case 7:
                bankName = BankName.OpenBank;
                break;
            case 8:
                bankName = BankName.PromsvyazBank;
                break;
            case 9:
                bankName = BankName.RosBank;
                break;
            case 10:
                bankName = BankName.Qiwi;
                break;
            case 11:
                bankName = BankName.CitiBank;
                break;
            case 12:
                bankName = BankName.UnicreditBank;
                break;
            case 13:
                bankName = BankName.RaiffeisenBank;
                break;
            case 14:
                bankName = BankName.UnknownBank;
                break;
            default:
                w511.b();
                return null;
        }
        BankName bankName2 = bankName;
        FamilyInfo familyInfo2 = paymentMethod.getFamilyInfo();
        return new PaymentMethod.Card(cardId, d, account, bankName2, familyInfo2 != null ? new com.yandex.payment.sdk.core.data.FamilyInfo(familyInfo2.getFamilyAdminUid(), familyInfo2.getFamilyId(), familyInfo2.getExpenses(), familyInfo2.getLimit(), familyInfo2.getCurrency(), familyInfo2.getFrame(), familyInfo2.getIsUnlimited()) : null, paymentMethod.getRestrictions(), paymentMethod.getErrorRespCode(), paymentMethod.getAliases(), paymentMethod.getPayload());
    }
}
