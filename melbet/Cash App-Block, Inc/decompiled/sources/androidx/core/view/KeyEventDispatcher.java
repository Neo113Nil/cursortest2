package androidx.core.view;

import android.view.KeyEvent;
import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.savings.backend.api.SavingsParsingErrorFactory;
import com.squareup.cash.savings.backend.api.mappers.SavingsAppletMappersKt$WhenMappings;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import squareup.cash.savings.SavingsCustomerActiveState;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes3.dex */
public abstract class KeyEventDispatcher {

    /* loaded from: classes.dex */
    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static void dispatchBeforeHierarchy() {
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
    }

    public static boolean dispatchKeyEvent(Component component, KeyEvent keyEvent) {
        if (component == null) {
            return false;
        }
        return component.superDispatchKeyEvent(keyEvent);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewShopSearch.deepLinkSpecs;
    }

    public static final SavingsApplet toSavingsApplet(HasObservability hasObservability, squareup.cash.savings.SavingsApplet savingsApplet) {
        savingsApplet.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(savingsApplet, savingsParsingErrorFactory, hasObservability);
            Boolean bool = (Boolean) protoValidationScope.reportIfNullAndContinue("visible", (String) null, savingsApplet.visible);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            SavingsCustomerActiveState savingsCustomerActiveState = savingsApplet.active_state;
            int i = savingsCustomerActiveState == null ? -1 : SavingsAppletMappersKt$WhenMappings.$EnumSwitchMapping$0[savingsCustomerActiveState.ordinal()];
            SavingsApplet.CustomerActiveState customerActiveState = i != 1 ? i != 2 ? SavingsApplet.CustomerActiveState.UNSPECIFIED : SavingsApplet.CustomerActiveState.UNADOPTED : SavingsApplet.CustomerActiveState.ADOPTED;
            SavingsAction savingsAction = (SavingsAction) protoValidationScope.reportIfNullAndContinue("override_action", (String) null, savingsApplet.override_action);
            SavingsAction.ClientRoute savingsAction2 = savingsAction != null ? HapticFeedbackConstantsCompat.toSavingsAction(protoValidationScope, savingsAction) : null;
            String reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(savingsApplet.override_title, "override_title", (String) null);
            if (reportIfNullAndContinue == null) {
                reportIfNullAndContinue = "";
            }
            String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(savingsApplet.override_subtitle, "override_subtitle", (String) null);
            return new SavingsApplet(booleanValue, customerActiveState, savingsAction2, reportIfNullAndContinue, reportIfNullAndContinue2 == null ? "" : reportIfNullAndContinue2);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(squareup.cash.savings.SavingsApplet.class), savingsParsingErrorFactory, null);
        }
    }
}
