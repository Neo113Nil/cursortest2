package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;

/* loaded from: classes6.dex */
public final class MyFirstStockAdapter extends SingleRowAdapter {
    public final MyFirstConfigurationView$Factory$Impl myFirstConfigurationViewFactory;
    public final InvestingHomeView$$ExternalSyntheticLambda3 onClick;

    public MyFirstStockAdapter(MyFirstConfigurationView$Factory$Impl myFirstConfigurationView$Factory$Impl, InvestingHomeView$$ExternalSyntheticLambda3 investingHomeView$$ExternalSyntheticLambda3) {
        super(10, true);
        this.myFirstConfigurationViewFactory = myFirstConfigurationView$Factory$Impl;
        this.onClick = investingHomeView$$ExternalSyntheticLambda3;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        MyFirstConfigurationView myFirstConfigurationView = (MyFirstConfigurationView) view;
        ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel = (ColoredLearnMoreConfigurationModel) obj;
        myFirstConfigurationView.getClass();
        coloredLearnMoreConfigurationModel.getClass();
        LearnMoreConfiguration learnMoreConfiguration = coloredLearnMoreConfigurationModel.learnMoreConfiguration;
        ColoredLearnMoreConfigurationModel.LinkStyle linkStyle = coloredLearnMoreConfigurationModel.linkStyle;
        RealImageLoader realImageLoader = myFirstConfigurationView.imageLoader;
        Context context = myFirstConfigurationView.getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = learnMoreConfiguration.image_url;
        ImageRequests_androidKt.target(builder, myFirstConfigurationView.headerImage);
        realImageLoader.enqueue(builder.build());
        myFirstConfigurationView.title.setText(learnMoreConfiguration.title_text);
        myFirstConfigurationView.body.setText(learnMoreConfiguration.body_text);
        MooncakePillButton mooncakePillButton = myFirstConfigurationView.link;
        String str = learnMoreConfiguration.link_text;
        mooncakePillButton.setText(str);
        MooncakePillButton mooncakePillButton2 = myFirstConfigurationView.pillButtonLink;
        mooncakePillButton2.setText(str);
        mooncakePillButton.setVisibility(linkStyle == ColoredLearnMoreConfigurationModel.LinkStyle.TEXT_BUTTON ? 0 : 8);
        mooncakePillButton2.setVisibility(linkStyle == ColoredLearnMoreConfigurationModel.LinkStyle.PILL_BUTTON ? 0 : 8);
        myFirstConfigurationView.border.setVisibility(coloredLearnMoreConfigurationModel.hasBorder ? 0 : 8);
        myFirstConfigurationView.setLinkListener(new IntentLauncher$$ExternalSyntheticLambda0(7, this, coloredLearnMoreConfigurationModel));
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        MyFirstConfigurationView$Factory$Impl myFirstConfigurationView$Factory$Impl = this.myFirstConfigurationViewFactory;
        myFirstConfigurationView$Factory$Impl.getClass();
        RealImageLoader realImageLoader = (RealImageLoader) myFirstConfigurationView$Factory$Impl.delegateFactory.staticImageLoader.invoke();
        realImageLoader.getClass();
        MyFirstConfigurationView myFirstConfigurationView = new MyFirstConfigurationView(context, realImageLoader);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(myFirstConfigurationView.getDip(24), 0, myFirstConfigurationView.getDip(24), 0);
        myFirstConfigurationView.setLayoutParams(layoutParams);
        return myFirstConfigurationView;
    }
}
