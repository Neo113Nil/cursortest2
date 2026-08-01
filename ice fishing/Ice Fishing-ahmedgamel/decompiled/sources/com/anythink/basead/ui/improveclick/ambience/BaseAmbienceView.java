package com.anythink.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public abstract class BaseAmbienceView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected c.a f11109a;

    public BaseAmbienceView(Context context) {
        super(context);
        initView();
    }

    public abstract void initSetting(x xVar, c.a aVar);

    public abstract void initView();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void release();

    public BaseAmbienceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public BaseAmbienceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }
}
