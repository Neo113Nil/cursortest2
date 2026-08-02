package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.c4i0;
import defpackage.oa90;
import defpackage.tje;
import defpackage.tqy;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.progress.CircularSegmentedProgressView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/yandex/taxi/design/ListCircularProgressComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "(Landroid/util/AttributeSet;I)V", "totalProgress", "currentProgress", "setProgress", "(II)V", "position", "setProgressPosition", "(I)V", "Loa90;", "paintMode", "setPaintMode", "(Loa90;)V", "Lru/yandex/taxi/widget/progress/CircularSegmentedProgressView;", "progressView", "Lru/yandex/taxi/widget/progress/CircularSegmentedProgressView;", "initialPosition", CA20Status.STATUS_USER_I, "getInitialPosition$annotations", "()V", "Companion", "tqy", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ListCircularProgressComponent extends ListItemComponent {
    public static final tqy Companion = new tqy();
    public static final int PROGRESS_POSITION_END = 1;
    public static final int PROGRESS_POSITION_START = 0;
    private int initialPosition;
    private final CircularSegmentedProgressView progressView;

    public ListCircularProgressComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progressView = new CircularSegmentedProgressView(context, null, 0, 6, null);
        init(attributeSet, i);
        setProgressPosition(this.initialPosition);
    }

    private static /* synthetic */ void getInitialPosition$annotations() {
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ListCircularProgressComponent, defStyleAttr, 0);
        try {
            this.initialPosition = obtainStyledAttributes.getInt(c4i0.ListCircularProgressComponent_progress_position, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setPaintMode(oa90 paintMode) {
        this.progressView.setBonusTypeVisualIdentity(paintMode);
    }

    public final void setProgress(int totalProgress, int currentProgress) {
        this.progressView.setTotalProgress(totalProgress);
        this.progressView.setCurrentProgress(currentProgress);
    }

    public final void setProgressPosition(int position) {
        CircularSegmentedProgressView circularSegmentedProgressView = this.progressView;
        if (position == 0) {
            setLeadView(circularSegmentedProgressView);
            clearTrailView();
        } else {
            setTrailView(circularSegmentedProgressView);
            clearLeadView();
        }
        xw31.D(tje.u(14, getContext()), this.progressView);
        ru.yandex.taxi.design.utils.c.E(tje.u(32, getContext()), this.progressView);
        ru.yandex.taxi.design.utils.c.C(tje.u(32, getContext()), this.progressView);
    }

    public ListCircularProgressComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListCircularProgressComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListCircularProgressComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listCircularProgressComponentStyle : i);
    }
}
