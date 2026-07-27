package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements VersionedParcelable {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.mIcon = (IconCompat) Preconditions.checkNotNull(iconCompat);
        this.mTitle = (CharSequence) Preconditions.checkNotNull(charSequence);
        this.mContentDescription = (CharSequence) Preconditions.checkNotNull(charSequence2);
        this.mActionIntent = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Preconditions.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        Icon icon;
        CharSequence title;
        CharSequence contentDescription;
        PendingIntent actionIntent;
        boolean isEnabled;
        boolean shouldShowIcon;
        Preconditions.checkNotNull(remoteAction);
        icon = remoteAction.getIcon();
        IconCompat createFromIcon = IconCompat.createFromIcon(icon);
        title = remoteAction.getTitle();
        contentDescription = remoteAction.getContentDescription();
        actionIntent = remoteAction.getActionIntent();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(createFromIcon, title, contentDescription, actionIntent);
        isEnabled = remoteAction.isEnabled();
        remoteActionCompat.setEnabled(isEnabled);
        if (Build.VERSION.SDK_INT >= 28) {
            shouldShowIcon = remoteAction.shouldShowIcon();
            remoteActionCompat.setShouldShowIcon(shouldShowIcon);
        }
        return remoteActionCompat;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public RemoteAction toRemoteAction() {
        Person$$ExternalSyntheticApiModelOutline1.m41m();
        RemoteAction m = Person$$ExternalSyntheticApiModelOutline1.m(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        m.setEnabled(isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            m.setShouldShowIcon(shouldShowIcon());
        }
        return m;
    }
}
