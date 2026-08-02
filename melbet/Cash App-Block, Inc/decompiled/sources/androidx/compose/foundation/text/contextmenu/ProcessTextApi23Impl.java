package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.ProcessTextKey;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ProcessTextApi23Impl {
    public static final BasicTextKt$$ExternalSyntheticLambda14 processTextActivitiesQuery = new BasicTextKt$$ExternalSyntheticLambda14(26);
    public static final RealAppConfigManager$$ExternalSyntheticLambda2 onClickProcessTextItem = new RealAppConfigManager$$ExternalSyntheticLambda2(1);

    /* renamed from: addProcessedTextContextMenuItems-UAq72N0, reason: not valid java name */
    public static final void m373addProcessedTextContextMenuItemsUAq72N0(TextContextMenuBuilderScope textContextMenuBuilderScope, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (TextRange.m987getCollapsedimpl(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) processTextActivitiesQuery.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        textContextMenuBuilderScope.separator();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            MooncakeTheme.item(textContextMenuBuilderScope, new ProcessTextKey(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: androidx.compose.foundation.text.contextmenu.ProcessText_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ProcessTextApi23Impl.onClickProcessTextItem.invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, new TextRange(j));
                    ((TextContextMenuSession) obj).close();
                    return Unit.INSTANCE;
                }
            });
        }
        textContextMenuBuilderScope.separator();
    }
}
