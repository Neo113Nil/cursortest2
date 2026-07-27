package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class CatchingFishCustomViewFlux extends ImageView {
    public final CatchingFishGsonWebSocket CatchingFishDaggerWebsocket;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCustomViewFlux(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        this.CatchingFishWorkManager = false;
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, i);
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = new CatchingFishGsonWebSocket(this);
        this.CatchingFishDaggerWebsocket = catchingFishGsonWebSocket;
        catchingFishGsonWebSocket.CatchingFishWorkManager(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket == null || (catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor) == null) {
            return null;
        }
        return (ColorStateList) catchingFishFABDaggerHilt.CatchingFishCoroutine;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket == null || (catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor) == null) {
            return null;
        }
        return (PorterDuff.Mode) catchingFishFABDaggerHilt.CatchingFishReduxKtor;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.CatchingFishDaggerWebsocket.CatchingFishCoroutine).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null && drawable != null && !this.CatchingFishWorkManager) {
            catchingFishGsonWebSocket.CatchingFishSnackbar = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (catchingFishGsonWebSocket != null) {
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
            if (this.CatchingFishWorkManager) {
                return;
            }
            ImageView imageView = (ImageView) catchingFishGsonWebSocket.CatchingFishCoroutine;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(catchingFishGsonWebSocket.CatchingFishSnackbar);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.CatchingFishWorkManager = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            ImageView imageView = (ImageView) catchingFishGsonWebSocket.CatchingFishCoroutine;
            if (i != 0) {
                Drawable CatchingFishCustomView = CatchingFishLayoutRoomFAB.CatchingFishCustomView(imageView.getContext(), i);
                if (CatchingFishCustomView != null) {
                    CatchingFishRealmPicasso.CatchingFishParcelableFAB(CatchingFishCustomView);
                }
                imageView.setImageDrawable(CatchingFishCustomView);
            } else {
                imageView.setImageDrawable(null);
            }
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            if (((CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor) == null) {
                catchingFishGsonWebSocket.CatchingFishReduxKtor = new CatchingFishFABDaggerHilt();
            }
            CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor;
            catchingFishFABDaggerHilt.CatchingFishCoroutine = colorStateList;
            catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishDaggerWebsocket;
        if (catchingFishGsonWebSocket != null) {
            if (((CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor) == null) {
                catchingFishGsonWebSocket.CatchingFishReduxKtor = new CatchingFishFABDaggerHilt();
            }
            CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) catchingFishGsonWebSocket.CatchingFishReduxKtor;
            catchingFishFABDaggerHilt.CatchingFishReduxKtor = mode;
            catchingFishFABDaggerHilt.CatchingFishParcelableFAB = true;
            catchingFishGsonWebSocket.CatchingFishParcelableFAB();
        }
    }
}
