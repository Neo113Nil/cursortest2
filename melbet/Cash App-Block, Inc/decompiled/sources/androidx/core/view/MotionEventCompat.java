package androidx.core.view;

import android.view.MotionEvent;
import androidx.camera.camera2.pipe.AeMode;
import androidx.compose.ui.draw.RotateKt;
import com.fillr.e;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.SavingsParsingErrorFactory;
import com.squareup.cash.savings.backend.api.SavingsProtoParsingError;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.savings.GeneralFolder;
import squareup.cash.savings.GoalFolder;
import squareup.cash.savings.SavingsFolderV2;
import squareup.cash.savings.SavingsFolderV2$FolderType$GeneralFolder;
import squareup.cash.savings.SavingsFolderV2$FolderType$GoalFolder;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes3.dex */
public abstract class MotionEventCompat {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewSingleUsePaymentMerchant.deepLinkSpecs;
    }

    public static boolean isFromSource(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final SavingsFolder.GeneralFolder toGeneralFolder(ProtoValidationScope protoValidationScope, SavingsFolderV2 savingsFolderV2, GeneralFolder generalFolder) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            Money money = savingsFolderV2.balance;
            ProtoValidationScope.required(money, "balance");
            String str = savingsFolderV2.owning_customer_token;
            try {
                ProtoValidationScope.required(str, "owning_customer_token");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(savingsFolderV2.getClass()), savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                return null;
            }
            String str2 = savingsFolderV2.icon_id;
            try {
                ProtoValidationScope.required(str2, "icon_id");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(savingsFolderV2.getClass()), savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str2 = null;
            }
            if (str2 == null) {
                e eVar = Emojis.Companion;
                str2 = "extra_cash";
            }
            LocalizedString localizedString = generalFolder.localized_label;
            return new SavingsFolder.GeneralFolder(money, str, str2, localizedString != null ? localizedString.translated_value : null);
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(SavingsFolderV2.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsFolder.GoalFolder toGoalFolder(ProtoValidationScope protoValidationScope, SavingsFolderV2 savingsFolderV2, GoalFolder goalFolder) {
        String str;
        goalFolder.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(savingsFolderV2, savingsParsingErrorFactory, protoValidationScope);
            Money money = savingsFolderV2.balance;
            ProtoValidationScope.required(money, "balance");
            String str2 = (String) protoValidationScope2.reportIfNullAndContinue("owning_customer_token", (String) null, savingsFolderV2.owning_customer_token);
            if (str2 != null) {
                String str3 = (String) protoValidationScope2.reportIfNullAndContinue("icon_id", (String) null, savingsFolderV2.icon_id);
                if (str3 == null) {
                    e eVar = Emojis.Companion;
                    str3 = "extra_cash";
                }
                String str4 = str3;
                String str5 = goalFolder.token;
                ProtoValidationScope.required(str5, "token");
                Money money2 = (Money) protoValidationScope2.reportIfNullAndContinue("goal_amount", (String) null, goalFolder.goal_amount);
                if (money2 != null && (str = (String) protoValidationScope2.reportIfNullAndContinue("completion_token", (String) null, goalFolder.completion_token)) != null) {
                    String str6 = (String) protoValidationScope2.reportIfNullAndContinue(AnnotatedPrivateKey.LABEL, (String) null, goalFolder.label);
                    String str7 = str6 == null ? "" : str6;
                    Float valueOf = ((Integer) protoValidationScope2.reportIfNullAndContinue("goal_progress_percentage", (String) null, goalFolder.goal_progress_percentage)) != null ? Float.valueOf(r13.intValue() / 100.0f) : null;
                    String str8 = goalFolder.goal_flow_parameters;
                    return new SavingsFolder.GoalFolder(money, str2, str4, str5, money2, str, str7, valueOf, str8 == null ? "" : str8);
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SavingsFolderV2.class), savingsParsingErrorFactory, null);
        }
    }

    public static final List toSavingsFolders(HasObservability hasObservability, VersionedSavingsFolders versionedSavingsFolders) {
        Object goalFolder;
        hasObservability.getClass();
        versionedSavingsFolders.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(versionedSavingsFolders, savingsParsingErrorFactory, hasObservability);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List list = versionedSavingsFolders.v2_folders;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (!hasNext) {
                    if (i == 1) {
                        return arrayList;
                    }
                    GeneralSavingsError generalSavingsError = new GeneralSavingsError("Found incorrect number of general folders: " + i, null);
                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter == null) {
                        throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                    }
                    errorReporter.report(generalSavingsError, defaultSamplingStrategy);
                    return EmptyList.INSTANCE;
                }
                SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) it.next();
                AeMode.Companion companion = savingsFolderV2.folder_type;
                if (companion instanceof SavingsFolderV2$FolderType$GeneralFolder) {
                    goalFolder = toGeneralFolder(protoValidationScope, savingsFolderV2, ((SavingsFolderV2$FolderType$GeneralFolder) companion).value);
                    if (goalFolder != null) {
                        i++;
                    } else {
                        goalFolder = null;
                    }
                } else {
                    if (!(companion instanceof SavingsFolderV2$FolderType$GoalFolder)) {
                        if (companion == null) {
                            throw new SavingsProtoParsingError("VersionedSavingsFolders", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "folder_type", 8);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!linkedHashSet.add(((SavingsFolderV2$FolderType$GoalFolder) companion).value.token)) {
                        GeneralSavingsError generalSavingsError2 = new GeneralSavingsError("Found duplicate goal folder tokens: " + ((SavingsFolderV2$FolderType$GoalFolder) companion).value.token, null);
                        ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter2 == null) {
                            throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                        }
                        errorReporter2.report(generalSavingsError2, defaultSamplingStrategy);
                        return EmptyList.INSTANCE;
                    }
                    goalFolder = toGoalFolder(protoValidationScope, savingsFolderV2, ((SavingsFolderV2$FolderType$GoalFolder) companion).value);
                }
                if (goalFolder != null) {
                    arrayList.add(goalFolder);
                }
            }
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VersionedSavingsFolders.class), savingsParsingErrorFactory, null);
        }
    }
}
