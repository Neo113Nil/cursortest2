package androidx.test.ext.junit.rules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.util.Checks;
import org.junit.rules.ExternalResource;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityScenarioRule<A extends Activity> extends ExternalResource {
    private ActivityScenario<A> scenario;
    private final Supplier<ActivityScenario<A>> scenarioSupplier;

    interface Supplier<T> {
        T get();
    }

    public ActivityScenarioRule(final Class<A> activityClass) {
        this.scenarioSupplier = new Supplier() { // from class: androidx.test.ext.junit.rules.ActivityScenarioRule$$ExternalSyntheticLambda2
            @Override // androidx.test.ext.junit.rules.ActivityScenarioRule.Supplier
            public final Object get() {
                return ActivityScenario.launch((Class) Checks.checkNotNull(activityClass));
            }
        };
    }

    public ActivityScenarioRule(final Class<A> activityClass, final Bundle activityOptions) {
        this.scenarioSupplier = new Supplier() { // from class: androidx.test.ext.junit.rules.ActivityScenarioRule$$ExternalSyntheticLambda0
            @Override // androidx.test.ext.junit.rules.ActivityScenarioRule.Supplier
            public final Object get() {
                return ActivityScenario.launch((Class) Checks.checkNotNull(activityClass), activityOptions);
            }
        };
    }

    public ActivityScenarioRule(final Intent startActivityIntent) {
        this.scenarioSupplier = new Supplier() { // from class: androidx.test.ext.junit.rules.ActivityScenarioRule$$ExternalSyntheticLambda3
            @Override // androidx.test.ext.junit.rules.ActivityScenarioRule.Supplier
            public final Object get() {
                return ActivityScenario.launch((Intent) Checks.checkNotNull(startActivityIntent));
            }
        };
    }

    public ActivityScenarioRule(final Intent startActivityIntent, final Bundle activityOptions) {
        this.scenarioSupplier = new Supplier() { // from class: androidx.test.ext.junit.rules.ActivityScenarioRule$$ExternalSyntheticLambda1
            @Override // androidx.test.ext.junit.rules.ActivityScenarioRule.Supplier
            public final Object get() {
                return ActivityScenario.launch((Intent) Checks.checkNotNull(startActivityIntent), activityOptions);
            }
        };
    }

    @Override // org.junit.rules.ExternalResource
    protected void before() throws Throwable {
        this.scenario = this.scenarioSupplier.get();
    }

    @Override // org.junit.rules.ExternalResource
    protected void after() {
        this.scenario.close();
    }

    public ActivityScenario<A> getScenario() {
        return (ActivityScenario) Checks.checkNotNull(this.scenario);
    }
}
